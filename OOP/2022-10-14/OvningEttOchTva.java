import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.Writer;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.StandardOpenOption;

public class OvningEttOchTva {
    public static void main(String[] args) throws IOException {

        Path file = Path.of("Hello.txt");


        //Lägger till text i befintlig fil
        try (BufferedWriter w = Files.newBufferedWriter(file, StandardOpenOption.APPEND)) {

            w.newLine();
            w.write("Hello World!!!!");

        }

        // Skriver över/skapar filen och lägger in texten.
        // try (BufferedWriter w = Files.newBufferedWriter(file)) {

        //     w.write("Hello World!!!!");

        // }
    }
}
