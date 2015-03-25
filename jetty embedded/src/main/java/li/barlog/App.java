package li.barlog;

import org.eclipse.jetty.server.Request;
import org.eclipse.jetty.server.Server;
import org.eclipse.jetty.server.handler.AbstractHandler;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

public final class App extends AbstractHandler {
	private static final int PORT = 8080;

	public static void main(final String... args) throws Exception {
		final Server server = new Server(PORT);
		server.setHandler(new App());

		server.start();
		server.join();
	}

	@Override
	public void handle(final String target,
					   final Request baseRequest,
					   final HttpServletRequest request,
					   final HttpServletResponse response)
			throws IOException, ServletException {
		response.setContentType("text/html;charset=utf-8");
		response.setStatus(HttpServletResponse.SC_OK);
		baseRequest.setHandled(true);
		response.getWriter().println("<h3>Hello, World!</h3>");
	}
}
