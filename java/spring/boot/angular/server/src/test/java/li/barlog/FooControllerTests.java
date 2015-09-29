package li.barlog;

import li.barlog.dto.Foo;
import li.barlog.dto.ImmutableFoo;
import li.barlog.rest.FooController;

import com.fasterxml.jackson.databind.ObjectMapper;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.InjectMocks;
import org.mockito.MockitoAnnotations;
import org.springframework.boot.test.SpringApplicationConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.test.context.web.WebAppConfiguration;
import org.springframework.test.web.servlet.MockMvc;

import java.util.ArrayList;
import java.util.List;

import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.content;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;
import static org.springframework.test.web.servlet.setup.MockMvcBuilders.standaloneSetup;

@RunWith(SpringJUnit4ClassRunner.class)
@SpringApplicationConfiguration(classes = App.class)
@WebAppConfiguration
public class FooControllerTests {
	@InjectMocks
	private FooController fooController;

	private MockMvc mockMvc;

	private ObjectMapper mapper;

	@Before
	public void init() {
		MockitoAnnotations.initMocks(this);
		mockMvc = standaloneSetup(fooController).build();
		mapper = new ObjectMapper();
	}

	@Test
	public void test() throws Exception {
		List<Foo> list = new ArrayList<>(3);
		list.add(ImmutableFoo.builder().message("foo").build());
		list.add(ImmutableFoo.builder().message("bar").build());
		list.add(ImmutableFoo.builder().message("buz").build());

		mockMvc.perform(get("/api/foo"))
			.andExpect(status().isOk())
			.andExpect(content().json(mapper.writeValueAsString(list)));
	}
}
