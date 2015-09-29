package li.barlog.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import com.fasterxml.jackson.databind.annotation.JsonSerialize;
import org.immutables.value.Value;

@Value.Immutable
@JsonSerialize(as = ImmutableVersion.class)
@JsonDeserialize(as = ImmutableVersion.class)
public interface Version {
	@JsonProperty("version") String version();
	@JsonProperty("name") String name();
	@JsonProperty("description") String description();
}
