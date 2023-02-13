import okhttp3.*;

import java.io.IOException;

public class Main {

  public static void main(String[] args) {

    String url = "https://api.github.com/users/masahiro-ikeda/repos";
    String token = "secret-token";
    OkHttpClient client = new OkHttpClient();

    try {
      Request request = new Request.Builder()
          .url(url)
          .addHeader("Authorization", String.format("token %s", token))
          .build();
      Response response = client.newCall(request).execute();

      System.out.println(response.body().string());
    } catch (IOException e) {
      e.printStackTrace();
    }
  }
}
