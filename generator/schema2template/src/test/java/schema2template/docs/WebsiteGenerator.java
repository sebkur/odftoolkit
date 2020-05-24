package schema2template.docs;

import java.io.BufferedWriter;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;

public class WebsiteGenerator {

	private String definition;

	public WebsiteGenerator(String definition) {
		this.definition = definition;
	}

	public void generate(Path file) throws IOException {
		try (BufferedWriter writer = Files.newBufferedWriter(file)) {
			writer.write("<html>");
			writer.write("<body>");
			writer.write(definition);
			writer.write("</body>");
			writer.write("</html>");
		}
	}

}
