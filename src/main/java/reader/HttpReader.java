package reader;

import okhttp3.OkHttpClient;
import okhttp3.Request;
import okhttp3.Response;

import java.io.IOException;

public class HttpReader {

  /**
   * httpクライアント部分.
   */
  public String read() throws IOException {
    String url = "https://api.github.com/users/masahiro-ikeda/repos";
    String token = "secret-token";
    OkHttpClient client = new OkHttpClient();

    Request request = new Request.Builder()
        .url(url)
        .addHeader("Authorization", String.format("token %s", token))
        .build();

    try (Response response = client.newCall(request).execute()) {
      return response.body().string();
    }
  }
}
