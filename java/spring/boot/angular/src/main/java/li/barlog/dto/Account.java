package li.barlog.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import com.fasterxml.jackson.databind.annotation.JsonSerialize;
import org.immutables.value.Value;

@Value.Immutable
@JsonSerialize(as = ImmutableAccount.class)
@JsonDeserialize(as = ImmutableAccount.class)
public interface Account {
	@JsonProperty("login") String login();
}
