import com.fasterxml.jackson.core.JacksonException;
import mapper.JsonMapper;
import reader.HttpReader;

import java.io.IOException;
import java.util.List;

public class Main {

  public static void main(String[] args) {

    HttpReader reader = new HttpReader();
    JsonMapper mapper = new JsonMapper();

    try {
      // 読み込み
      String json = reader.read();

      // 変換
      List<String> results = mapper.map(json);

      // 出力
      results.forEach(System.out::println);

    } catch (JacksonException e) {
      System.out.println("json変換に失敗");
      e.printStackTrace();
    } catch (IOException e) {
      System.out.println("httpアクセスに失敗");
      e.printStackTrace();
    }
  }
}
