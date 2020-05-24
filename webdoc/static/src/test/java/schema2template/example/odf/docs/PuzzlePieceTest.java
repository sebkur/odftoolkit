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
import schema2template.model.XMLModel;

import java.nio.file.Path;
import java.nio.file.Paths;

public class PuzzlePieceTest {

    private static final Path TEST_INPUT_ROOT_ODF = Paths.get("examples", "odf");
    private static final Path TEST_INPUT_ODF_SCHEMAS = TEST_INPUT_ROOT_ODF.resolve("odf-schemas");
    private static Path odf12RngFile = TEST_INPUT_ODF_SCHEMAS.resolve("OpenDocument-v1.2-os-schema.rng");

    @Test
    public void generateDocumentation() throws Exception {
        System.out.println("Loading schema...");
        Expression root = XMLModel.loadSchemaFromClasspath(odf12RngFile);

        System.out.println("Generating static website...");
        Path output = Paths.get("/tmp/puzzlepieces");
        WebsiteGenerator generator = new WebsiteGenerator(output);
        generator.generate(root);
    }

}
