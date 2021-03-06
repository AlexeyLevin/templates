package li.barlog.rest;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.HashMap;
import java.util.Map;

@RestController
@RequestMapping("/api")
public final class VersionController {
	@Value("${app.version}")
	private String version;

	@RequestMapping("/version")
	@ResponseBody
	public Map<String, Object> version() {
		Map<String, Object> r = new HashMap<>(1);
		r.put("version", version);
		return r;
	}
}
