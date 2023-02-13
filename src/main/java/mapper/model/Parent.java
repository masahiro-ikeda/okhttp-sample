package mapper.model;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * 親階層.
 */
@JsonIgnoreProperties(ignoreUnknown = true) // プロパティにないキーを無視
public class Parent {

  @JsonProperty("id")
  public Long id;

  @JsonProperty("name")
  public String name;

  @JsonProperty("owner")
  public Child child;

  @Override
  public String toString() {
    return String.format("リポジトリ名は %s、所有者は %s", name, child.login);
  }
}
