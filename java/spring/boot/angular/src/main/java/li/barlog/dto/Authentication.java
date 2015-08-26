package li.barlog.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import com.fasterxml.jackson.databind.annotation.JsonSerialize;
import org.immutables.value.Value;

@Value.Immutable
@JsonSerialize(as = ImmutableAuthentication.class)
@JsonDeserialize(as = ImmutableAuthentication.class)
public interface Authentication {
	@JsonProperty("login") String login();
	@JsonProperty("password") String password();
}
