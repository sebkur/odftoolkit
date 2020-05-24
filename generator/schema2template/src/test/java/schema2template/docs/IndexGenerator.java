package schema2template.docs;

import de.topobyte.jsoup.HTML;
import de.topobyte.jsoup.HtmlBuilder;
import de.topobyte.jsoup.components.Body;
import de.topobyte.jsoup.components.UnorderedList;
import de.topobyte.webpaths.WebPaths;
import schema2template.model.PuzzlePiece;
import schema2template.model.PuzzlePieceSet;

import java.io.IOException;

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
		HtmlBuilder builder = getBuilder();

		Body body = builder.getBody();
		body.ac(HTML.h1("Index"));

		body.ac(HTML.h2("Attributes"));

		UnorderedList list = body.ac(HTML.ul());
		for (PuzzlePiece puzzlePiece : attributes) {
			String name = puzzlePiece.getQName();
			list.addItem(HTML.a(WebsiteUtil.linkElement(this, name), name));
		}

		body.ac(HTML.h2("Elements"));

		list = body.ac(HTML.ul());
		for (PuzzlePiece puzzlePiece : elements) {
			String name = puzzlePiece.getQName();
			list.addItem(HTML.a(WebsiteUtil.linkElement(this, name), name));
		}
	}

}
