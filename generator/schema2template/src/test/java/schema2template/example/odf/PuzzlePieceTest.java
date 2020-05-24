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
package schema2template.example.odf;

import com.sun.msv.grammar.Expression;
import org.apache.commons.io.IOUtils;
import org.junit.Assert;
import org.junit.Ignore;
import org.junit.Test;
import schema2template.model.MSVExpressionIterator;
import schema2template.model.PuzzlePiece;
import schema2template.model.PuzzlePieceSet;

import java.io.*;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.List;
import java.util.Map;
import java.util.SortedSet;
import java.util.TreeSet;
import java.util.logging.Level;
import java.util.logging.Logger;

import static schema2template.example.odf.OdfHelper.*;

public class PuzzlePieceTest {

	private static final Logger LOG = Logger.getLogger(PuzzlePieceTest.class.getName());
	private static final String OUTPUT_DUMP_ODF10 = "target" + File.separator + "odf10-msvtree.dump";
	private static final String OUTPUT_DUMP_ODF11 = "target" + File.separator + "odf11-msvtree.dump";
	private static final String OUTPUT_DUMP_ODF12 = "target" + File.separator + "odf12-msvtree.dump";
	private static final String OUTPUT_REF_ODF10 = TEST_REFERENCE_DIR + File.separator + "odf10-msvtree.ref";
	private static final String OUTPUT_REF_ODF11 = TEST_REFERENCE_DIR + File.separator + "odf11-msvtree.ref";
	private static final String OUTPUT_REF_ODF12 = TEST_REFERENCE_DIR + File.separator + "odf12-msvtree.ref";
	private static final int ODF12_ELEMENT_DUPLICATES = 7;
	private static final int ODF12_ATTRIBUTE_DUPLICATES = 134;

    @Test
    public void generateDocumentation() throws Exception {
        System.out.println("Loading schema...");
        Expression root = OdfHelper.loadSchemaODF12();

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
        for (String definition : nameToDefinition.keySet()) {
            System.out.println(String.format("Def: '%s'", definition));
            Path file = dir.resolve(definition + ".html");
            System.out.println(String.format("Creating file: '%s'", file));
            try (BufferedWriter writer = Files.newBufferedWriter(file)) {
                writer.write("<html>");
                writer.write("<body>");
                writer.write(definition);
                writer.write("</body>");
                writer.write("</html>");
            }
        }
    }

    @Test
    public void testStuff1() throws Exception {
        String EXAMPLE_PARENT = "table:table";
        String EXAMPLE_CHILD = "table:table-row";
        test(EXAMPLE_PARENT, EXAMPLE_CHILD);
    }

    @Test
    public void testStuff2() throws Exception {
        String EXAMPLE_PARENT = "text:p";
        String EXAMPLE_CHILD = "text:span";
        test(EXAMPLE_PARENT, EXAMPLE_CHILD);
    }

    public void test(String EXAMPLE_PARENT, String EXAMPLE_CHILD) throws Exception {
        System.out.println("Loading schema...");
        Expression root = OdfHelper.loadSchemaODF12();

        System.out.println("Extracting puzzle pieces...");
        PuzzlePieceSet elements = new PuzzlePieceSet();
        PuzzlePieceSet attributes = new PuzzlePieceSet();
        PuzzlePiece.extractPuzzlePieces(root, elements, attributes, null);
        Map<String, SortedSet<PuzzlePiece>> nameToDefinition = PathPrinter.createDefinitionMap(new TreeSet<PuzzlePiece>(elements));

        System.out.println(String.format("Number of elements: %d", elements.size()));
        System.out.println(String.format("Number of attributes: %d", attributes.size()));
        System.out.println(String.format("Number of definitions: %d", nameToDefinition.size()));

        for (String definition : nameToDefinition.keySet()) {
            System.out.println(String.format("Def: '%s'", definition));
        }

        System.out.println("Print all paths from parent element (e.g. \"text:p\") to direct child element (e.g. \"text:span\")");

        SortedSet<PuzzlePiece> pieces = nameToDefinition.get(EXAMPLE_PARENT);

        if (pieces == null) {
            System.out.println("No parent element found by the given name: " + EXAMPLE_PARENT);
        }

        PuzzlePiece parent = pieces.first();

        pieces = nameToDefinition.get(EXAMPLE_CHILD);

        if (pieces == null) {
            System.out.println("No child element found by the given name: " + EXAMPLE_CHILD);
        }

        PuzzlePiece child = pieces.first();

        if (pieces.size() > 1) {
            System.out.println("There were more than one element by this name. Dropped all instances but one.");
        }

        System.out.println();
        System.out.println("PATHS from " + parent.getQName() + " to " + child.getQName() + ": ");
        System.out.println("---------------------------------------------------------");

        List<String> paths = new PathPrinter(parent).printChildPaths(child);

        if (paths == null) {
            System.out.println("No Path found.");
        } else {
            for (String s : paths) {
                System.out.println(s);
            }
        }
    }

	/**
	 * Test: Use the MSV
	 *
	 * <p>This test uses the ODF example, but it's meant to test the general ability to correctly
	 * extract PuzzlePieces out of a XML schema</p>
	 */
	@Test
	public void testMSVExpressionTree() {
		try {
			Expression odf10Root = OdfHelper.loadSchemaODF10();
			String odf10Dump = MSVExpressionIterator.dumpMSVExpressionTree(odf10Root);
			LOG.info("Writing MSV RelaxNG tree into file: " + OUTPUT_DUMP_ODF10);
			PrintWriter out0 = new PrintWriter(new FileWriter(OUTPUT_DUMP_ODF10));
			out0.print(odf10Dump);
			out0.close();

			Expression odf11Root = OdfHelper.loadSchemaODF11();
			String odf11Dump = MSVExpressionIterator.dumpMSVExpressionTree(odf11Root);
			LOG.info("Writing MSV RelaxNG tree into file: " + OUTPUT_DUMP_ODF11);
			PrintWriter out1 = new PrintWriter(new FileWriter(OUTPUT_DUMP_ODF11));
			out1.print(odf11Dump);
			out1.close();

			Expression odf12Root = OdfHelper.loadSchemaODF12();
			String odf12Dump = MSVExpressionIterator.dumpMSVExpressionTree(odf12Root);
			LOG.info("Writing MSV RelaxNG tree into file: " + OUTPUT_DUMP_ODF12);
			PrintWriter out2 = new PrintWriter(new FileWriter(OUTPUT_DUMP_ODF12));
			out2.print(odf12Dump);
			out2.close();

			String odf10Ref = readFileAsString(OUTPUT_REF_ODF10);
			if(!odf10Ref.equals(odf10Dump)){
				String errorMsg = "There is a difference between the expected outcome of the parsed ODF 1.0 tree.\n"
					+ "Please compare the output:\n\t'" + OUTPUT_DUMP_ODF10 + "'\nwith the reference\n\t'" + ODF10_RNG_FILE;
				LOG.severe(errorMsg);
				Assert.fail(errorMsg);
			}

			String odf11Ref = readFileAsString(OUTPUT_REF_ODF11);
			if(!odf11Ref.equals(odf11Dump)){
				String errorMsg = "There is a difference between the expected outcome of the parsed ODF 1.1 tree.\n"
					+ "Please compare the output:\n\t'" + OUTPUT_DUMP_ODF11 + "'\nwith the reference\n\t'" + odf11RngFile;
				LOG.severe(errorMsg);
				Assert.fail(errorMsg);
			}

			String odf12Ref = readFileAsString(OUTPUT_REF_ODF12);
			if(!odf12Ref.equals(odf12Dump)){
				String errorMsg = "There is a difference between the expected outcome of the parsed ODF 1.2 tree.\n"
					+ "Please compare the output:\n\t'" + OUTPUT_DUMP_ODF12 + "'\nwith the reference\n\t'" + odf12RngFile;
				LOG.severe(errorMsg);
				Assert.fail(errorMsg);
			}
		} catch (Exception ex) {
			Logger.getLogger(PuzzlePieceTest.class.getName()).log(Level.SEVERE, null, ex);
			Assert.fail(ex.toString());
		}
	}

	/**
	 * Reading a file into a string
     * @param filePath  path of the file to be opened.
     */
    private String readFileAsString(String filePath) throws java.io.IOException {
        Path path = Paths.get(filePath);
        try(InputStream input = Files.newInputStream(path)) {
            return IOUtils.toString(input, StandardCharsets.UTF_8);
        }
    }

	/**
	 * Test: Create PuzzlePiece elements and attributes with ODF Spec 1.1 (old version, won't be changed, so
	 * it's a good base for a test).
	 *
	 * <p>This test uses the ODF example, but it's meant to test the general ability to correctly
	 * extract PuzzlePieces out of a XML schema</p>
	 */
	@Test
	@Ignore // due to issue https://issues.apache.org/jira/browse/ODFTOOLKIT-180
	public void testExtractPuzzlePieces() {
		try {
			PuzzlePieceSet allElements_ODF11 = new PuzzlePieceSet();
			PuzzlePieceSet allAttributes_ODF11 = new PuzzlePieceSet();
			PuzzlePiece.extractPuzzlePieces(OdfHelper.loadSchemaODF11(), allElements_ODF11, allAttributes_ODF11, null);
			// There is a difference of one wildcard "*" representing anyElement/anyAttribute
			checkFoundNumber(allElements_ODF11.withoutMultiples(), ODF11_ELEMENT_NUMBER + 1, "element");
			checkFoundNumber(allAttributes_ODF11.withoutMultiples(), ODF11_ATTRIBUTE_NUMBER + 1, "attribute");

			PuzzlePieceSet allElements_ODF12 = new PuzzlePieceSet();
			PuzzlePieceSet allAttributes_ODF12 = new PuzzlePieceSet();
			PuzzlePiece.extractPuzzlePieces(OdfHelper.loadSchemaODF12(), allElements_ODF12, allAttributes_ODF12, null);
			// There is a difference of one wildcard "*" representing anyElement/anyAttribute
			checkFoundNumber(allElements_ODF12.withoutMultiples(), ODF12_ELEMENT_NUMBER + 1, "element");
			checkFoundNumber(allAttributes_ODF12.withoutMultiples(), ODF12_ATTRIBUTE_NUMBER + 1, "attribute");
		} catch (Exception ex) {
			Logger.getLogger(PuzzlePieceTest.class.getName()).log(Level.SEVERE, null, ex);
			Assert.fail(ex.toString());
		}
	}

	/**
	 * Test: Create PuzzlePiece elements and attributes with ODF Spec 1.1 (old version, won't be changed, so
	 * it's a good base for a test).
	 *
	 * <p>This test uses the ODF example, but it's meant to test the general ability to correctly
	 * extract PuzzlePieces out of a XML schema</p>
	 */
	@Test
	@Ignore
	public void testExtractPuzzlePiecesWithDuplicates() {
		try {
			PuzzlePieceSet allElements_ODF12 = new PuzzlePieceSet();
			PuzzlePieceSet allAttributes_ODF12 = new PuzzlePieceSet();
			PuzzlePiece.extractPuzzlePieces(OdfHelper.loadSchemaODF12(), allElements_ODF12, allAttributes_ODF12, null);
			// There is a difference of one wildcard "*" representing anyElement/anyAttribute

			int foundElementDuplicates = allElements_ODF12.size() - (ODF12_ELEMENT_NUMBER + 1);
			int foundAttributeDuplicates = allAttributes_ODF12.size() - (ODF12_ATTRIBUTE_NUMBER + 1);

			if(ODF12_ELEMENT_DUPLICATES != foundElementDuplicates){
				String errorMsg = "There is a difference between the expected outcome of duplicates for ODF 1.2 elements.\n"
					+ "Expected: '" + ODF12_ELEMENT_DUPLICATES + "'\tfound:'" + foundElementDuplicates;
				LOG.severe(errorMsg);
				Assert.fail(errorMsg);
			}
			if(ODF12_ATTRIBUTE_DUPLICATES != foundAttributeDuplicates){
				String errorMsg = "There is a difference between the expected outcome of duplicates for ODF 1.2 elements.\n"
					+ "Expected: '" + ODF12_ATTRIBUTE_DUPLICATES + "'\tfound:'" + foundAttributeDuplicates;
				LOG.severe(errorMsg);
				Assert.fail(errorMsg);
			}
		} catch (Exception ex) {
			Logger.getLogger(PuzzlePieceTest.class.getName()).log(Level.SEVERE, null, ex);
			Assert.fail(ex.toString());
		}
	}

	/** Routine to compare the expected number of either attributes or elements with the found amount */
	private void checkFoundNumber(PuzzlePieceSet puzzlePieceSet, int expectedAmount, String nodeName) {
		if (expectedAmount == puzzlePieceSet.size()) {
			LOG.log(Level.INFO, "The expected amount of {0}s could be found", nodeName);
			if (DEBUG) {
				int i = 0;
				for (PuzzlePiece piece : puzzlePieceSet) {
					LOG.info(piece.getQName() + " was " + nodeName + " #" + ++i);
				}
				LOG.info("++++++++++++");
			}
		} else {
			String errorMsg = "Instead of " + expectedAmount
					+ " there were " + puzzlePieceSet.size() + " " + nodeName + "s found";
			LOG.severe(errorMsg);
			int i = 0;
			for (PuzzlePiece piece : puzzlePieceSet) {
				LOG.severe(piece.getQName() + " was " + nodeName + " #" + ++i);
			}
			LOG.info("********************");
			Assert.fail(errorMsg);
		}
	}
}
