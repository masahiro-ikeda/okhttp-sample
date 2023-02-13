package mapper.model;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * 子階層.
 */
@JsonIgnoreProperties(ignoreUnknown = true) // プロパティにないキーを無視
public class Child {

  @JsonProperty("id")
  public Long id;

  @JsonProperty("login")
  public String login;
}
