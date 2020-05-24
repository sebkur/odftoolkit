package de.mobanisto.schema2template.webdoc;

import com.sun.msv.grammar.Expression;
import schema2template.example.odf.docs.WebsiteGenerator;
import schema2template.model.XMLModel;

import java.io.IOException;
import java.nio.file.Path;
import java.nio.file.Paths;

public class RunWebsiteGenerator {

    public static void main(String[] args) throws IOException {
        if (args.length != 2) {
            System.out.println("usage: RunWebsiteGenerator <input.rng> <output directory>");
            System.exit(1);
        }

        Path input = Paths.get(args[0]);
        Path output = Paths.get(args[1]);

        System.out.println("Loading schema...");
        Expression root = XMLModel.loadSchemaFromFile(input);

        System.out.println("Generating static website...");
        WebsiteGenerator generator = new WebsiteGenerator(output);
        generator.generate(root);
    }

}
