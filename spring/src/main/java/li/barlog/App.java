package li.barlog;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.ComponentScan;

@ComponentScan
public class App {
	private static final Logger log = LoggerFactory.getLogger(App.class);

	public static void main(String... args) {
		log.debug("App starting");

		ConfigurableApplicationContext context =
			new AnnotationConfigApplicationContext(App.class);
		context.registerShutdownHook();

		FooService foo = context.getBean(FooService.class);
		foo.foo();
	}
}