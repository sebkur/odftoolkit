package schema2template.example.odf.docs;

import de.topobyte.jsoup.HTML;
import de.topobyte.jsoup.HtmlBuilder;
import de.topobyte.jsoup.bootstrap3.Bootstrap;
import de.topobyte.jsoup.bootstrap3.components.Container;
import de.topobyte.jsoup.components.Body;
import de.topobyte.jsoup.components.Div;
import de.topobyte.jsoup.components.UnorderedList;
import de.topobyte.webpaths.WebPaths;
import schema2template.model.PuzzlePiece;
import schema2template.model.PuzzlePieceSet;

import java.io.IOException;
import java.util.function.Supplier;

public class AttributeGenerator extends BaseGenerator {

    private String definition;
    private PuzzlePiece piece;

    public AttributeGenerator(String definition, PuzzlePiece piece) {
        super(WebPaths.get(definition + ".html"));
        this.definition = definition;
        this.piece = piece;
    }

    @Override
    public void generate() throws IOException {
        super.generate();

        HtmlBuilder builder = getBuilder();
        Body body = builder.getBody();
        Container content = body.ac(Bootstrap.container());

        content.ac(HTML.h1(definition));

        Div div = content.ac(HTML.div());
        piece(div, piece);
    }

    private void piece(Div div, PuzzlePiece puzzlePiece) {
        section(div, puzzlePiece, "Parent Elements", puzzlePiece::getParents, true);
        section(div, puzzlePiece, "Child Elements", puzzlePiece::getChildElements, true);
        section(div, puzzlePiece, "Attributes", puzzlePiece::getAttributes, false);
    }

    private void section(Div div, PuzzlePiece puzzlePiece, String title, Supplier<PuzzlePieceSet> references, boolean links) {
        PuzzlePieceSet elements = references.get();
        if (elements.isEmpty()) {
            return;
        }

        div.ac(HTML.h2(title));
        UnorderedList list = div.ac(HTML.ul());

        for (PuzzlePiece element : references.get()) {
            String referenceName = element.getQName();
            if (links) {
                list.addItem(HTML.a(WebsiteUtil.linkElement(this, referenceName), element.getQName()));
            } else {
                list.addTextItem(element.getQName());
            }
        }
    }

}
