package schema2template.docs;

import de.topobyte.jsoup.HTML;
import de.topobyte.jsoup.HtmlBuilder;
import de.topobyte.jsoup.components.Body;
import de.topobyte.jsoup.components.Headline;
import de.topobyte.jsoup.components.P;
import de.topobyte.webpaths.WebPath;
import de.topobyte.webpaths.WebPaths;

import java.io.BufferedWriter;
import java.io.IOException;
import java.nio.file.Files;

public class WebsiteGenerator extends BaseGenerator {

	private String definition;

	public WebsiteGenerator(String definition) {
		super(WebPaths.get(definition + ".html"));
		this.definition = definition;
	}

	@Override
	public void generate() throws IOException {
		HtmlBuilder builder = getBuilder();

		Body body = builder.getBody();
		body.ac(HTML.h1(definition));

		P p = body.ac(HTML.p());
		p.appendText("Some dummy text");
	}

}
