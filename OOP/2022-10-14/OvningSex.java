import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStream;
import java.nio.file.Files;
import java.nio.file.Path;

public class OvningSex {
    public static void main(String[] args) throws IOException {

        Path file1 = Path.of(args[0]);
        Path file2 = Path.of(args[1]);

        

        try (BufferedInputStream r =  new BufferedInputStream(Files.newInputStream(file1));
                BufferedOutputStream w = new BufferedOutputStream(Files.newOutputStream(file2))) {

            r.transferTo(w);

        } catch (IOException e) {
            System.out.println(e.getClass().getName());
        }

    }
}
