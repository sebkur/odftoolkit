package schema2template.docs;

import de.topobyte.jsoup.HTML;
import de.topobyte.jsoup.HtmlBuilder;
import de.topobyte.jsoup.components.Body;
import de.topobyte.jsoup.components.Div;
import de.topobyte.jsoup.components.UnorderedList;
import de.topobyte.webpaths.WebPaths;
import schema2template.model.PuzzlePiece;
import schema2template.model.PuzzlePieceSet;

import java.io.IOException;
import java.util.SortedSet;
import java.util.function.Supplier;

public class WebsiteGenerator extends BaseGenerator {

	private String definition;
	private SortedSet<PuzzlePiece> pieces;

	public WebsiteGenerator(String definition, SortedSet<PuzzlePiece> pieces) {
		super(WebPaths.get(definition + ".html"));
		this.definition = definition;
		this.pieces = pieces;
	}

	@Override
	public void generate() throws IOException {
		HtmlBuilder builder = getBuilder();

		Body body = builder.getBody();
		body.ac(HTML.h1(definition));

		for (PuzzlePiece puzzlePiece : pieces) {
			Div div = body.ac(HTML.div());
			piece(div, puzzlePiece);
		}
	}

	private void piece(Div div, PuzzlePiece puzzlePiece) {
		section(div, puzzlePiece, "Attributes", puzzlePiece::getAttributes);
		section(div, puzzlePiece, "Child Elements", puzzlePiece::getChildElements);
		section(div, puzzlePiece, "Parent Elements", puzzlePiece::getParents);
	}

	private void section(Div div, PuzzlePiece puzzlePiece, String title, Supplier<PuzzlePieceSet> references) {
		PuzzlePieceSet childElements = puzzlePiece.getChildElements();
		if (childElements.isEmpty()) {
			return;
		}

		div.ac(HTML.h2(title));
		UnorderedList list = div.ac(HTML.ul());

		for (PuzzlePiece element : references.get() ) {
			list.addTextItem(element.getQName());
		}
	}

}
