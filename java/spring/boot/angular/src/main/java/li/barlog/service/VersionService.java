package li.barlog.service;

import li.barlog.dto.ImmutableVersion;
import li.barlog.dto.Version;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;

@Service
public class VersionService {
	private Version v;

	@Value("${app.version}")
	private String version;

	@Value("${app.name}")
	private String name;

	@Value("${app.description}")
	private String description;

	public Version getVersion() {
		if (v == null) {
			v = ImmutableVersion.builder()
				.version(version)
				.name(name)
				.description(description).build();
		}

		return v;
	}
}
