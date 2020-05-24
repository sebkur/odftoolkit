/************************************************************************
 *
 * DO NOT ALTER OR REMOVE COPYRIGHT NOTICES OR THIS FILE HEADER
 *
 * Copyright 2009, 2010 Oracle and/or its affiliates. All rights reserved.
 *
 * Use is subject to license terms.
 *
 * Licensed under the Apache License, Version 2.0 (the "License"); you may not
 * use this file except in compliance with the License. You may obtain a copy
 * of the License at http://www.apache.org/licenses/LICENSE-2.0. You can also
 * obtain a copy of the License at http://odftoolkit.org/docs/license.txt
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS, WITHOUT
 * WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 *
 * See the License for the specific language governing permissions and
 * limitations under the License.
 *
 ************************************************************************/
package schema2template.model;

import com.sun.msv.grammar.Expression;
import com.sun.msv.reader.trex.ng.RELAXNGReader;
import com.sun.msv.reader.xmlschema.XMLSchemaReader;
import org.xml.sax.InputSource;

import javax.xml.parsers.SAXParserFactory;
import java.io.IOException;
import java.io.InputStream;
import java.nio.file.Path;
import java.util.*;

/**
 * The most important model, the first access to the XML Schema information.
 *
 * Provides all XML attribute and XML element definitions from the schema.
 * All further information can be accessed from those definitions
 * (e.g. dependencies, constant values, data types, etc.).
 */
public class XMLModel {

    PuzzlePieceSet mElements = new PuzzlePieceSet();
    PuzzlePieceSet mAttributes = new PuzzlePieceSet();
    Map<String, PuzzlePiece> mNameElementMap;
    Map<String, PuzzlePiece> mNameAttributeMap;
    public Expression mRootExpression;
    public String mLastSchemaFileName;

    /**
     * Constructs new model by the MSV root expression
     *
     * @param root MSV root Expression
     */
    public XMLModel(Path schemaFile) throws IOException {
        mRootExpression = loadSchemaFromClasspath(schemaFile);
        mLastSchemaFileName = schemaFile.toAbsolutePath().getFileName().toString();

        PuzzlePiece.extractPuzzlePieces(mRootExpression, mElements, mAttributes, mLastSchemaFileName);
        mElements.makeImmutable();
        mAttributes.makeImmutable();
        mNameElementMap = createMap(mElements);
        mNameAttributeMap = createMap(mAttributes);
    }

    // Create Map Name->PuzzlePiece. Ignore the fact that there may be more than one PuzzlePiece per Name
    private static Map<String, PuzzlePiece> createMap(Collection<PuzzlePiece> definitions) {
        Map<String, PuzzlePiece> retval = new HashMap<String, PuzzlePiece>();
        Iterator<PuzzlePiece> iter = definitions.iterator();
        while (iter.hasNext()) {
            PuzzlePiece def = iter.next();
            retval.put(def.getQName(), def);
        }
        return retval;
    }

    /**
     * Map Name to PuzzlePiece(s).
     */
    static Map<String, SortedSet<PuzzlePiece>> createDefinitionMap(Collection<PuzzlePiece> definitions) {
        Map<String, SortedSet<PuzzlePiece>> retval = new HashMap<String, SortedSet<PuzzlePiece>>();
        Iterator<PuzzlePiece> iter = definitions.iterator();
        while (iter.hasNext()) {
            PuzzlePiece def = iter.next();
            SortedSet<PuzzlePiece> multiples = retval.get(def.getQName());
            if (multiples == null) {
                multiples = new TreeSet<>();
                retval.put(def.getQName(), multiples);
            }
            multiples.add(def);
        }
        return retval;
    }

    /**
     * Load and parse a Schema from File.
     *
     * @param Schema file (RelaxNG or W3C schema)
     * @return MSV Expression Tree (more specific: The tree's MSV root
     * expression)
     * @throws Exception
     */
    public static Expression loadSchemaFromFile(Path rngFile) throws IOException {
        SAXParserFactory factory = SAXParserFactory.newInstance();
        factory.setNamespaceAware(true);
        // Parsing the Schema with MSV
        // 4-DEBUG: DebugController ignoreController = new DebugController(true, false);
        com.sun.msv.reader.util.IgnoreController ignoreController = new com.sun.msv.reader.util.IgnoreController();
        String filename = rngFile.getFileName().toString();
        String absolutePath = rngFile.toAbsolutePath().toString();
        Expression root = null;
        if (filename.endsWith(".rng")) {
            root = RELAXNGReader.parse(absolutePath, factory, ignoreController).getTopLevel();
        } else if (filename.endsWith(".xsd")) {
            root = XMLSchemaReader.parse(absolutePath, factory, ignoreController).getTopLevel();
        } else {
            throw new RuntimeException("Reader not chosen for given schema suffix!");
        }
        if (root == null) {
            throw new RuntimeException("Schema could not be parsed.");
        }
        return root;
    }

    /**
     * Load and parse a Schema from File.
     *
     * @param Schema file (RelaxNG or W3C schema)
     * @return MSV Expression Tree (more specific: The tree's MSV root
     * expression)
     * @throws Exception
     */
    public static Expression loadSchemaFromClasspath(Path rngFile) throws IOException {
        SAXParserFactory factory = SAXParserFactory.newInstance();
        factory.setNamespaceAware(true);
        // Parsing the Schema with MSV
        // 4-DEBUG: DebugController ignoreController = new DebugController(true, false);
        com.sun.msv.reader.util.IgnoreController ignoreController = new com.sun.msv.reader.util.IgnoreController();
        String filename = rngFile.getFileName().toString();
        Expression root = null;
        if (filename.endsWith(".rng")) {
            try (InputStream input = Thread.currentThread().getContextClassLoader().getResourceAsStream(rngFile.toString())) {
                root = RELAXNGReader.parse(new InputSource(input), factory, ignoreController).getTopLevel();
            }
        } else if (filename.endsWith(".xsd")) {
            try (InputStream input = Thread.currentThread().getContextClassLoader().getResourceAsStream(rngFile.toString())) {
                root = XMLSchemaReader.parse(new InputSource(input), factory, ignoreController).getTopLevel();
            }
        } else {
            throw new RuntimeException("Reader not chosen for given schema suffix!");
        }
        if (root == null) {
            throw new RuntimeException("Schema could not be parsed.");
        }
        return root;
    }

    /**
     * Get all elements, sorted by ns:local name.
     *
     * @return Unmodifiable SortedSet of elements
     */
    public PuzzlePieceSet getElements() {
        return mElements;
    }

    /**
     * Get all attributes, sorted by ns:local name.
     *
     * @return Unmodifiable SortedSet of attributes
     */
    public PuzzlePieceSet getAttributes() {
        return mAttributes;
    }

    /**
     * Get element(s) by tag name. If there are multiple elements sharing the same
     * tag name, a PuzzlePieceSet is returned. If not, a single PuzzlePiece is returned.
     *
     * @param name
     * @return Element PuzzlePiece(s)
     */
    public QNamedPuzzleComponent getElement(String name) {
        PuzzlePiece element = mNameElementMap.get(name);
        if (element == null) {
            return null;
        }
        return element.withMultiples();
    }

    /**
     * Get element by tag name and hash code. The hash code distincts
     * elements from sharing the same tag name.
     *
     * @param name
     * @param hashCode
     * @return Element PuzzlePiece
     */
    public PuzzlePiece getElement(String name, int hashCode) {
        PuzzlePiece element = mNameElementMap.get(name);
        if (element == null) {
            return null;
        }
        for (PuzzlePiece def : element.withMultiples()) {
            if (def.hashCode() == hashCode) {
                return def;
            }
        }
        return null;
    }

    /**
     * Get attribute by tag name. If there are multiple attributes sharing the same
     * tag name, a PuzzlePieceSet is returned. If not, a single PuzzlePiece is returned.
     *
     * @param name
     * @return Attribute PuzzlePiece(s)
     */
    public QNamedPuzzleComponent getAttribute(String name) {
        PuzzlePiece attribute = mNameAttributeMap.get(name);
        if (attribute == null) {
            return null;
        }
        return attribute.withMultiples();
    }

    /**
     * Get attribute by tag name and hash code. The hash code distincts
     * Attributes sharing the same tag name.
     *
     * @param name
     * @param hashCode
     * @return Attribute PuzzlePiece
     */
    public PuzzlePiece getAttribute(String name, int hashCode) {
        PuzzlePiece attribute = mNameAttributeMap.get(name);
        if (attribute == null) {
            return null;
        }
        for (PuzzlePiece def : attribute.withMultiples()) {
            if (def.hashCode() == hashCode) {
                return def;
            }
        }
        return null;
    }

    /**
     * Convert a-few:words into AFewWords in CamelCase spelling
     *
     * @param raw input String
     * @return filtered output String
     */
    public static String camelCase(String raw) {
       StringTokenizer tok = new StringTokenizer(raw, "-:/ _.,");
       String retval = "";
       while (tok.hasMoreElements()) {
           String word = tok.nextToken();
           if (! word.equals("")) {
               retval += word.substring(0, 1).toUpperCase() + word.substring(1);
           }
       }
       return retval;
    }

    /**
     * Convert a-few:words into AFewWords in CamelCase spelling
     *
     * @param def input
     * @return filtered output String
     */
    public static String camelCase(QNamed def) {
        return camelCase(def.getQName());
    }

    /**
     * Convert a-few:words into aFewWords in spelling for java method names
     *
     * @param raw input String
     * @return filtered output String
     */
    public static String javaCase(String raw) {
        String retval = camelCase(raw);
        if (retval.length() > 0) {
            retval = retval.substring(0,1).toLowerCase().concat(retval.substring(1));
        }
        return retval;
    }

    /**
     * Convert a-few:words into aFewWords in spelling for java method names
     *
     * @param def input
     * @return filtered output String
     */
    public static String javaCase(QNamed def) {
        return javaCase(def.getQName());
    }

    /**
     * Convert a-few:words into A_FEW_WORDS in spelling used for Java constants
     *
     * @param raw input String
     * @return filtered output String
     */
    public static String constantCase(String raw) {
       StringTokenizer tok = new StringTokenizer(raw, "-:/ _.,");
       String retval = "";
       String separator = "";
       while (tok.hasMoreElements()) {
           String word = tok.nextToken();
           if (! word.equals("")) {
               retval += separator + word.toUpperCase();
               separator = "_";
           }
       }
       return retval;
    }

    /**
     * Convert a-few:words into A_FEW_WORDS in spelling used for Java constants
     *
     * @param def input
     * @return filtered output String
     */
    public static String constantCase(QNamed def) {
        return constantCase(def.getQName());
    }

    /**
     * Assist method for camel-case adaptions or namespace extraction.
	 * Maybe not used anymore: Get first word out of a String containing delimiters like "-:/ _.,"
     *
	 *
     * @param raw input String
     * @return filtered output String
     */
    public static String firstWord(String raw) {
       StringTokenizer tok = new StringTokenizer(raw, "-:/ _.,");
       if (tok.hasMoreElements()) {
           return tok.nextToken();
       }
       return null;
    }

    /**
     * Maybe not used anymore: Get first word out of a QNamed object containing delimiters like "-:/ _.,"
     *
     * @param def input
     * @return first word
     */
    public static String firstWord(QNamed def) {
        return firstWord(def.getQName());
    }

    /**
     * Maybe not used anymore: Get last word out of a String containing delimiters like "-:/ _.,"
     *
     * @param raw input
     * @return last word
     */
    public static String lastWord(String raw) {
       StringTokenizer tok = new StringTokenizer(raw, "-:/ _.,");
       String retval = null;
       while (tok.hasMoreElements()) {
           retval = tok.nextToken();
       }
       return retval;
    }

    /**
     * Maybe not used anymore: Get last word out of a String containing delimiters like "-:/ _.,"
     *
     * @param def input
     * @return last word
     */
    public static String lastWord(QNamed def) {
        return lastWord(def.getQName());
    }

    /**
     * (Java) member variable may not start with a number, so escape it
     * @param in raw input
     * @return filtered output, starting with a literal
     */
    public static String escapeKeyword(QNamed in) {
        return escapeKeyword(in.getQName());
    }

    /**
     * (Java) Keyword may not start with a number, so escape it
     *
     * @param in raw input
     * @return filtered output, starting with a literal
     */
    public static String escapeKeyword(String in) {
        if (in == null || in.length() == 0) {
            return in;
        }
        String out = in;
        // Do not start with number
        if (out.substring(0,1).matches("^\\p{Digit}")) {
            out = "_" + out;
        }
        return out;
    }

    /**
     * Escape the quotation marks of String literals
     *
     * @param in raw input
     * @return filtered output, with escaped quotation marks
     */
    public static String escapeLiteral(QNamed in) {
        return escapeLiteral(in.getQName());
    }

    /**
     * Escape the quotation marks of String literals
     *
     * @param in raw input
     * @return filtered output, with escaped quotation marks
     */
    public static String escapeLiteral(String in) {
        if (in == null || in.length() == 0) {
            return in;
        }
        String out = in;
        // Escape '"'
        out = out.replaceAll("\"", "\\\\\"");
        return out;
    }

    /**
     * Extract namespace ns from ns:local name
     *
     * @param name in form ns:local
     * @return ns part from ns:local name
     */
    public static String extractNamespace(String name) {
        int pos = name.lastIndexOf(":");
        if (pos > 0 && pos < name.length() - 1) {
            return name.substring(0, pos);
        }
        else {
            return null;
        }
    }

    /**
     * Extract namespace ns from ns:local name
     *
     * @param def QNamed object
     * @return ns part from ns:local name
     */
    public static String extractNamespace(QNamed def) {
        return extractNamespace(def.getQName());
    }

    /**
     * Extract localname local from ns:local name
     *
     * @param name in form ns:local
     * @return local part from ns:local name
     */
    public static String extractLocalname(String name) {
        int pos = name.lastIndexOf(":");
        if (pos > 0 && pos < name.length() - 1) {
            return name.substring(pos + 1);
        }
        else {
            return null;
        }
    }

    /**
     * Extract localname local from ns:local name
     *
     * @param def QNamed object
     * @return local part from ns:local name
     */
    public static String extractLocalname(QNamed def) {
        return extractLocalname(def.getQName());
    }

}
