package schema2template.example.odf.docs;

import com.sun.msv.grammar.Expression;
import schema2template.example.odf.PathPrinter;
import schema2template.model.PuzzlePiece;
import schema2template.model.PuzzlePieceSet;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.Map;
import java.util.SortedSet;
import java.util.TreeSet;

public class WebsiteGenerator {

    private Path output;

    public WebsiteGenerator(Path output) {
        this.output = output;
    }

    public void generate(Expression root) throws IOException {
        System.out.println("Extracting puzzle pieces...");
        PuzzlePieceSet elements = new PuzzlePieceSet();
        PuzzlePieceSet attributes = new PuzzlePieceSet();
        PuzzlePiece.extractPuzzlePieces(root, elements, attributes, null);
        Map<String, SortedSet<PuzzlePiece>> nameToDefinition = PathPrinter.createDefinitionMap(new TreeSet<PuzzlePiece>(elements));

        System.out.println(String.format("Number of elements: %d", elements.size()));
        System.out.println(String.format("Number of attributes: %d", attributes.size()));
        System.out.println(String.format("Number of definitions: %d", nameToDefinition.size()));

        System.out.println("Generating HTML page");
        Files.createDirectories(output);

        IndexGenerator indexGenerator = new IndexGenerator(attributes, elements);
        WebsiteUtil.generate(output, indexGenerator);

        for (PuzzlePiece piece : attributes) {
            String name = piece.getQName();
            System.out.println(String.format("Attribute: '%s'", name));
            Path file = output.resolve(name + ".html");
            System.out.println(String.format("Creating file: '%s'", file));

            AttributeGenerator generator = new AttributeGenerator(name, piece);
            WebsiteUtil.generate(output, generator);
        }

        for (PuzzlePiece piece : elements) {
            String name = piece.getQName();
            System.out.println(String.format("Element: '%s'", name));
            Path file = output.resolve(name + ".html");
            System.out.println(String.format("Creating file: '%s'", file));

            ElementGenerator generator = new ElementGenerator(name, piece);
            WebsiteUtil.generate(output, generator);
        }
    }

}
