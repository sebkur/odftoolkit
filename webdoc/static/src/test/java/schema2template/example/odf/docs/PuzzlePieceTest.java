package schema2template.example.odf.docs; /************************************************************************
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

import com.sun.msv.grammar.Expression;
import org.junit.Test;
import schema2template.example.odf.PathPrinter;
import schema2template.model.PuzzlePiece;
import schema2template.model.PuzzlePieceSet;

import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.Map;
import java.util.SortedSet;
import java.util.TreeSet;
import java.util.logging.Logger;

import static schema2template.example.odf.OdfHelper.TEST_REFERENCE_DIR;
import static schema2template.example.odf.OdfHelper.loadSchemaODF12;

public class PuzzlePieceTest {

    private static final Logger LOG = Logger.getLogger(PuzzlePieceTest.class.getName());
    private static final Path OUTPUT_DUMP_ODF10 = Paths.get("target", "odf10-msvtree.dump");
    private static final Path OUTPUT_DUMP_ODF11 = Paths.get("target", "odf11-msvtree.dump");
    private static final Path OUTPUT_DUMP_ODF12 = Paths.get("target", "odf12-msvtree.dump");
    private static final Path OUTPUT_REF_ODF10 = TEST_REFERENCE_DIR.resolve("odf10-msvtree.ref");
    private static final Path OUTPUT_REF_ODF11 = TEST_REFERENCE_DIR.resolve("odf11-msvtree.ref");
    private static final Path OUTPUT_REF_ODF12 = TEST_REFERENCE_DIR.resolve("odf12-msvtree.ref");
    private static final int ODF12_ELEMENT_DUPLICATES = 7;
    private static final int ODF12_ATTRIBUTE_DUPLICATES = 134;

    @Test
    public void generateDocumentation() throws Exception {
        System.out.println("Loading schema...");
        Expression root = loadSchemaODF12();

        System.out.println("Extracting puzzle pieces...");
        PuzzlePieceSet elements = new PuzzlePieceSet();
        PuzzlePieceSet attributes = new PuzzlePieceSet();
        PuzzlePiece.extractPuzzlePieces(root, elements, attributes, null);
        Map<String, SortedSet<PuzzlePiece>> nameToDefinition = PathPrinter.createDefinitionMap(new TreeSet<PuzzlePiece>(elements));

        System.out.println(String.format("Number of elements: %d", elements.size()));
        System.out.println(String.format("Number of attributes: %d", attributes.size()));
        System.out.println(String.format("Number of definitions: %d", nameToDefinition.size()));

        System.out.println("Generating HTML page");
        Path dir = Paths.get("/tmp/puzzlepieces");
        Files.createDirectories(dir);

        IndexGenerator indexGenerator = new IndexGenerator(attributes, elements);
        WebsiteUtil.generate(dir, indexGenerator);

        for (PuzzlePiece piece : attributes) {
            String name = piece.getQName();
            System.out.println(String.format("Attribute: '%s'", name));
            Path file = dir.resolve(name + ".html");
            System.out.println(String.format("Creating file: '%s'", file));

            AttributeGenerator generator = new AttributeGenerator(name, piece);
            WebsiteUtil.generate(dir, generator);
        }

        for (PuzzlePiece piece : elements) {
            String name = piece.getQName();
            System.out.println(String.format("Element: '%s'", name));
            Path file = dir.resolve(name + ".html");
            System.out.println(String.format("Creating file: '%s'", file));

            ElementGenerator generator = new ElementGenerator(name, piece);
            WebsiteUtil.generate(dir, generator);
        }
    }

}
