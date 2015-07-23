package li.barlog;

import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.ObjectMapper;
import org.junit.Before;
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
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

@RunWith(SpringJUnit4ClassRunner.class)
@SpringApplicationConfiguration(classes = App.class)
@WebIntegrationTest("server.port:0")
@DirtiesContext
public class VersionServiceIntegrationTests {
	private final TestRestTemplate restTemplate = new TestRestTemplate();
	private String URL;

	@Value("${app.version}")
	private String version;

	@Value("${local.server.port}")
	private int port;

	@Before
	public void init() {
		URL = "http://localhost:" + port + "/api";
	}

	@Test
	public void version() throws Exception {
		ResponseEntity<String> entity = restTemplate.getForEntity(
				URL + "/version", String.class);

		assertEquals(HttpStatus.OK, entity.getStatusCode());

		ObjectMapper objectMapper = new ObjectMapper();
		JsonNode rootNode = objectMapper.readTree(entity.getBody());
		JsonNode versionNode = rootNode.path("version");

		assertFalse(versionNode.isMissingNode());
		assertTrue(versionNode.asText().equals(version));
	}
}
