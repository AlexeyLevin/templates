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

	@Value("${app.name}")
	private String name;

	@Value("${app.description}")
	private String description;

	@RequestMapping("/version")
	@ResponseBody
	public Version version() {
		return new Version(version, name, description);
	}

	private class Version {
		public final String version;
		public final String name;
		public final String description;

		private Version(String version, String name, String description) {
			this.version = version;
			this.name = name;
			this.description = description;
		}
	}
}
