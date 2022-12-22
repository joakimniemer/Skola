import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.Writer;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.StandardOpenOption;

public class OvningFem {
    public static void main(String[] args) throws IOException {

        Path file = Path.of("Helloo.txt");


        if (!Files.exists(file)) {
            System.out.println("No such file exists!");
            System.exit(-1);
            }   

        try (BufferedReader r = Files.newBufferedReader(file)) {

            String line;
            while ((line = r.readLine()) != null) {
                System.out.println(line);
            }
        } catch (IOException x) {
            System.out.println("Filen hittades inte. " + x.getClass().getName());
        }

    }
}
