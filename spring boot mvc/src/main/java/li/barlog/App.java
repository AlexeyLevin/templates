package li.barlog;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;

@SpringBootApplication
public class App implements CommandLineRunner {
	private static final Logger log = LoggerFactory.getLogger(App.class);

	public static void main(String... args) {
		new SpringApplicationBuilder(App.class)
			.registerShutdownHook(true).run(args);
	}

	@Override
	public void run(String... strings) throws Exception {
		log.info("App");
	}
}