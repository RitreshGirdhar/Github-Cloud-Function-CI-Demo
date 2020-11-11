package function;

import com.google.cloud.functions.*;

import java.io.BufferedWriter;
import java.io.IOException;

public class Helloworld implements HttpFunction {

	public void service(HttpRequest request, HttpResponse response)
			throws IOException {
		BufferedWriter writer = response.getWriter();
		writer.write("Hello world!");
	}
}