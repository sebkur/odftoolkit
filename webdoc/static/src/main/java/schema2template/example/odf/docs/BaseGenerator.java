package schema2template.example.odf.docs;

import de.topobyte.jsoup.ElementUtil;
import de.topobyte.jsoup.Generatable;
import de.topobyte.jsoup.HtmlBuilder;
import de.topobyte.jsoup.components.Head;
import de.topobyte.webpaths.WebPath;
import org.apache.commons.io.IOUtils;

import java.io.IOException;
import java.nio.charset.StandardCharsets;

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

    @Override
    public void generate() throws IOException {
        Head head = builder.getHead();

        String header = IOUtils
            .toString(Thread.currentThread().getContextClassLoader()
                .getResourceAsStream("bootstrap.headers.html"), StandardCharsets.UTF_8);
        ElementUtil.appendFragment(head, header);
    }
}
