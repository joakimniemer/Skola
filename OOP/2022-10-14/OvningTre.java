import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.Writer;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.StandardOpenOption;

public class OvningTre {
    public static void main(String[] args) throws IOException {

        Path file = Path.of("Hello.txt");

        try (BufferedReader r = Files.newBufferedReader(file)) {

            String line;
            while ((line = r.readLine()) != null) {
                System.out.println(line);
            }
        }

    }
}
