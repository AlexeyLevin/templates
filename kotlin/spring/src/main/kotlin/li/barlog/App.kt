package li.barlog

import org.slf4j.LoggerFactory
import org.springframework.boot.CommandLineRunner
import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.builder.SpringApplicationBuilder

@SpringBootApplication
open class App: CommandLineRunner {
	private val log = LoggerFactory.getLogger(App::class.java)

	override fun run(vararg args: String?) {
		log.info("App started")
	}
}

fun main(args: Array<String>) {
	SpringApplicationBuilder(App::class.java)
		.registerShutdownHook(true).run(*args)
}
