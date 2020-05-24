package schema2template.docs;

import de.topobyte.jsoup.HTML;
import de.topobyte.jsoup.HtmlBuilder;
import de.topobyte.jsoup.components.Body;
import de.topobyte.jsoup.components.Div;
import de.topobyte.jsoup.components.UnorderedList;
import de.topobyte.webpaths.WebPath;
import de.topobyte.webpaths.WebPaths;
import schema2template.model.PuzzlePiece;
import schema2template.model.PuzzlePieceSet;

import java.io.IOException;
import java.io.UnsupportedEncodingException;
import java.net.URLEncoder;
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
		section(div, puzzlePiece, "Attributes", puzzlePiece::getAttributes, false);
		section(div, puzzlePiece, "Child Elements", puzzlePiece::getChildElements, true);
		section(div, puzzlePiece, "Parent Elements", puzzlePiece::getParents, true);
	}

	private void section(Div div, PuzzlePiece puzzlePiece, String title, Supplier<PuzzlePieceSet> references, boolean links) {
		PuzzlePieceSet childElements = puzzlePiece.getChildElements();
		if (childElements.isEmpty()) {
			return;
		}

		div.ac(HTML.h2(title));
		UnorderedList list = div.ac(HTML.ul());

		for (PuzzlePiece element : references.get()) {
			String referenceName = element.getQName();
			if (links) {
				WebPath referencePath = WebPaths.get(referenceName + ".html");
				WebPath link = sitePath.resolve(referencePath);
				list.addItem(HTML.a(encode(link.toString()), element.getQName()));
			} else {
				list.addTextItem(element.getQName());
			}
		}
	}

	public static String encode(String name) {
		try {
			return URLEncoder.encode(name, "UTF-8");
		} catch (UnsupportedEncodingException e) {
			return name;
		}
	}

}
