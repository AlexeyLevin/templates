package li.barlog.client;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public final class App {
	private static final Logger log = LoggerFactory.getLogger(App.class);

	private App() {}

	public static void main(final String... args) {
		log.debug("Client");
	}
}
