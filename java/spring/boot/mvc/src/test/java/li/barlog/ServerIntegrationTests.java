package li.barlog;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.test.SpringApplicationConfiguration;
import org.springframework.boot.test.TestRestTemplate;
import org.springframework.boot.test.WebIntegrationTest;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.test.annotation.DirtiesContext;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import static org.junit.Assert.assertEquals;

@RunWith(SpringJUnit4ClassRunner.class)
@SpringApplicationConfiguration(classes = App.class)
@WebIntegrationTest("server.port:0")
@DirtiesContext
public class ServerIntegrationTests {
	private final TestRestTemplate restTemplate = new TestRestTemplate();

	@Value("${local.server.port}")
	private int port;

	@Test
	public void test() throws Exception {
		ResponseEntity<String> entity = restTemplate.getForEntity(
			"http://localhost:" + this.port + "/test", String.class);
		assertEquals(HttpStatus.OK, entity.getStatusCode());
		assertEquals("test", entity.getBody());
	}
}
