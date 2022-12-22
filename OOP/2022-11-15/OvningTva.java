import java.io.IOException;
import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;
import java.net.http.HttpResponse.BodyHandlers;

public class OvningTva {
    public static void main(String[] args) throws IOException, InterruptedException {

        HttpClient client = HttpClient.newHttpClient();

        URI dadUri = URI.create("https://icanhazdadjoke.com");

        for (int i = 0; i < 5; i++) {

            HttpRequest request = HttpRequest.newBuilder()
                    .uri(dadUri)
                    .header("Accept", "text/plain")
                    .header("User-Agent", "My library (https://github.com/joakimniemer/Skola)")
                    .build();

            HttpResponse<String> resp = client.send(request, BodyHandlers.ofString());

            if (resp.statusCode() == 200) {
                System.out.println(resp.body());
            }
            System.out.println("");

        }

    }
}