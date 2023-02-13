package mapper;

import com.fasterxml.jackson.core.JacksonException;
import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.ObjectMapper;
import mapper.model.Parent;

import java.util.List;
import java.util.stream.Collectors;

public class JsonMapper {

  /**
   * Json文字列をオブジェクトに変換する.
   */
  public List<String> map(String json) throws JacksonException {
    ObjectMapper mapper = new ObjectMapper();
    List<Parent> list = mapper.readValue(json, new TypeReference<>() {});

    return list.stream().map(Parent::toString).collect(Collectors.toList());
  }
}
