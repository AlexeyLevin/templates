package li.barlog

import org.junit.Test
import org.junit.Assert.assertTrue
import org.junit.runner.RunWith
import org.springframework.boot.test.IntegrationTest
import org.springframework.boot.test.SpringApplicationConfiguration
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner

@RunWith(SpringJUnit4ClassRunner::class)
@SpringApplicationConfiguration(classes = arrayOf(App::class))
@IntegrationTest
class IntegrationTest {
	@Test
	fun test() {
		assertTrue(true)
	}
}
