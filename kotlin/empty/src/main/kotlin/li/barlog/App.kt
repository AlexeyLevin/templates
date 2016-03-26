package li.barlog

import org.slf4j.LoggerFactory

private fun log() = LoggerFactory.getLogger("App")

fun main(vararg args: String) {
    log().info("App started")
}
