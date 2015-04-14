package li.barlog.servlet;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import javax.servlet.annotation.WebInitParam;
import javax.servlet.annotation.WebServlet;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import java.io.IOException;

@WebServlet(
	description = "Foo Servlet",
	urlPatterns = {"/foo"},
	initParams = {@WebInitParam(name = "foo", value = "bar")})
public final class FooServlet extends HttpServlet {
	private static final Logger log = LoggerFactory.getLogger(FooServlet.class);

	@Override
	public void init() throws ServletException {
		super.init();
		log.info("initialized");
		log.info("foo: {}", getServletContext().getInitParameter("foo"));
	}

	@Override
	public void doGet(final HttpServletRequest request, final HttpServletResponse response)
		throws IOException, ServletException {

		request.setAttribute("number", Math.random());

		getServletContext().getRequestDispatcher("/WEB-INF/pages/foo.jsp").forward(request, response);
	}
}
