package li.barlog

import li.barlog.service.BarService
import org.junit.Test
import org.junit.Assert.assertEquals
import org.junit.runner.RunWith
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.boot.test.IntegrationTest
import org.springframework.boot.test.SpringApplicationConfiguration
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner

@RunWith(SpringJUnit4ClassRunner::class)
@SpringApplicationConfiguration(classes = arrayOf(App::class))
@IntegrationTest
class IntegrationTest {
	@Autowired
	var barService: BarService? = null

	@Test
	fun test() {
		assertEquals("foo", barService?.b())
	}
}
