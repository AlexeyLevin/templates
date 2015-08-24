package li.barlog.domain;

public class Version {
	public final String version;
	public final String name;
	public final String description;

	public Version(String version, String name, String description) {
		this.version = version;
		this.name = name;
		this.description = description;
	}
}
