package li.barlog.rest;

import li.barlog.domain.Version;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api")
public final class VersionController {
	@Value("${app.version}")
	private String version;

	@Value("${app.name}")
	private String name;

	@Value("${app.description}")
	private String description;

	@RequestMapping("/version")
	@ResponseBody
	public Version version() {
		return new Version(version, name, description);
	}
}
