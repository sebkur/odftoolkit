package schema2template.docs;

import de.topobyte.jsoup.Buildable;
import de.topobyte.jsoup.Generatable;
import de.topobyte.jsoup.HtmlBuilder;
import de.topobyte.webpaths.NioPaths;
import de.topobyte.webpaths.WebPath;
import de.topobyte.webpaths.WebPaths;
import org.apache.commons.io.IOUtils;

import java.io.IOException;
import java.io.UnsupportedEncodingException;
import java.io.Writer;
import java.net.URLEncoder;
import java.nio.file.Files;
import java.nio.file.Path;

public class WebsiteUtil {

	public static void generate(Path dir, Generatable generatable) throws IOException {
		generatable.generate();
		HtmlBuilder builder = generatable.getBuilder();
		String document = builder.getDocument().toString();

		Path file = NioPaths.resolve(dir, generatable.getPath());
		try (Writer writer = Files.newBufferedWriter(file)) {
			IOUtils.write(document, writer);
		}
	}

	public static String encode(String name) {
		try {
			return URLEncoder.encode(name, "UTF-8");
		} catch (UnsupportedEncodingException e) {
			return name;
		}
	}

	public static String linkElement(Buildable buildable, String referenceName) {
		WebPath referencePath = WebPaths.get(referenceName + ".html");
		WebPath link = buildable.getPath().resolve(referencePath);
		return encode(link.toString());
	}

}
