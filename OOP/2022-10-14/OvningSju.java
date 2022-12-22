import java.io.BufferedInputStream;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;

public class OvningSju {
    public static void main(String[] args) throws IOException {

        Path file1 = Path.of(args[0]);
        String first = file1.toString();
        int i = first.length();
        int k = i - 6;
        String second = first.substring(k, i);

        if (second.equals(".class")) {
            System.out.println("detta är en .class");
        }

        try (BufferedInputStream r = new BufferedInputStream(Files.newInputStream(file1))) {

            byte[] byteArray = new byte[4];

            for (int j = 0; j < 4; j++) {
                byteArray[j] = Files.readAllBytes(file1)[j];
            }

            for (byte rr : byteArray) {
                System.out.println(rr);
            }

        } catch (Exception e) {
            System.out.println(e);
        }
    }
}