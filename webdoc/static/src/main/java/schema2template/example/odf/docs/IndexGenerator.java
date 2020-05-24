package schema2template.example.odf.docs;

import de.topobyte.jsoup.ElementBuilder;
import de.topobyte.jsoup.HTML;
import de.topobyte.jsoup.HtmlBuilder;
import de.topobyte.jsoup.bootstrap3.Bootstrap;
import de.topobyte.jsoup.bootstrap3.components.Container;
import de.topobyte.jsoup.components.Body;
import de.topobyte.jsoup.components.UnorderedList;
import de.topobyte.jsoup.nodes.Element;
import de.topobyte.webpaths.WebPaths;
import schema2template.model.PuzzlePiece;
import schema2template.model.PuzzlePieceSet;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class IndexGenerator extends BaseGenerator {

    private PuzzlePieceSet attributes;
    private PuzzlePieceSet elements;

    public IndexGenerator(PuzzlePieceSet attributes, PuzzlePieceSet elements) {
        super(WebPaths.get("index.html"));
        this.attributes = attributes;
        this.elements = elements;
    }

    @Override
    public void generate() throws IOException {
        super.generate();

        HtmlBuilder builder = getBuilder();
        Body body = builder.getBody();
        Container content = body.ac(Bootstrap.container());

        content.ac(HTML.h1("Index"));

        List<PuzzlePiece> roots = new ArrayList<>();
        for (PuzzlePiece puzzlePiece : elements) {
            if (puzzlePiece.getParents().isEmpty()) {
                roots.add(puzzlePiece);
            }
        }

        rootElements(content, roots);
        elements(content);
        attributes(content);
    }

    private void rootElements(Element element, List<PuzzlePiece> roots) {
        element.ac(HTML.h2("Root Elements"));

        UnorderedList list = element.ac(HTML.ul());
        for (PuzzlePiece puzzlePiece : roots) {
            String name = puzzlePiece.getQName();
            list.addItem(HTML.a(WebsiteUtil.linkElement(this, name), name));
        }
    }

    private void elements(Element element) {
        element.ac(HTML.h2("Elements"));

        UnorderedList list = element.ac(HTML.ul());
        for (PuzzlePiece puzzlePiece : elements) {
            String name = puzzlePiece.getQName();
            list.addItem(HTML.a(WebsiteUtil.linkElement(this, name), name));
        }
    }

    private void attributes(Element element) {
        element.ac(HTML.h2("Attributes"));

        UnorderedList list = element.ac(HTML.ul());
        for (PuzzlePiece puzzlePiece : attributes) {
            String name = puzzlePiece.getQName();
            list.addItem(HTML.a(WebsiteUtil.linkElement(this, name), name));
        }
    }

}
