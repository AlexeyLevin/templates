package li.barlog;

import com.fasterxml.jackson.databind.ObjectMapper;
import li.barlog.service.VersionService;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.MockitoAnnotations;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.SpringApplicationConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.test.context.web.WebAppConfiguration;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.web.context.WebApplicationContext;

import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.content;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;
import static org.springframework.test.web.servlet.setup.MockMvcBuilders.webAppContextSetup;

@RunWith(SpringJUnit4ClassRunner.class)
@SpringApplicationConfiguration(classes = App.class)
@WebAppConfiguration
public class VersionControllerTests {
	@Autowired
	private WebApplicationContext webApplicationContext;

	@Autowired
	private VersionService versionService;

	private MockMvc mockMvc;

	private ObjectMapper mapper;

	@Before
	public void init() {
		MockitoAnnotations.initMocks(this);
		mockMvc = webAppContextSetup(webApplicationContext).build();
		mapper = new ObjectMapper();
	}

	@Test
	public void test() throws Exception {
		mockMvc.perform(get("/api/version"))
			.andExpect(status().isOk())
			.andExpect(content().json(mapper.writeValueAsString(versionService.getVersion())));
	}
}
