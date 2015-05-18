package li.barlog.rest;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.HashMap;
import java.util.Map;

@RestController
@RequestMapping("/foo")
public final class FooController {
	@Value("${app.version}")
	private String version;

	@RequestMapping("/test")
	@ResponseBody
	public String hello() {
		return "test";
	}

	@RequestMapping("/version")
	@ResponseBody
	public Map<String, Object> version() {
		Map<String, Object> r = new HashMap<>(1);
		r.put("version", version);
		return r;
	}
}
