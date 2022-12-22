import java.io.IOException;
import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;
import java.net.http.HttpResponse.BodyHandlers;
import java.nio.file.Path;

public class OvningTre {
    public static void main(String[] args) throws IOException, InterruptedException {

        Path file = Path.of("text.txt");

        HttpClient client = HttpClient.newHttpClient();

        URI uri = URI.create("https://sv.wikipedia.org/wiki/Vinterkriget");

        HttpRequest request = HttpRequest.newBuilder()
                .uri(uri)
                .header("Accept", "text.plain")
                .header("User-Agent", "My library (https://github.com/joakimniemer/Skola)")
                .build();

        HttpResponse<Path> resp = client.send(request, BodyHandlers.ofFile(file));

    }
}
