package schema2template.docs;

import de.topobyte.jsoup.Generatable;
import de.topobyte.jsoup.HtmlBuilder;
import de.topobyte.webpaths.WebPath;

public abstract class BaseGenerator implements Generatable {

	protected WebPath sitePath;
	protected HtmlBuilder builder = new HtmlBuilder();


	public BaseGenerator(WebPath sitePath) {
		this.sitePath = sitePath;
	}

	@Override
	public HtmlBuilder getBuilder() {
		return builder;
	}

	@Override
	public WebPath getPath() {
		return sitePath;
	}

}
