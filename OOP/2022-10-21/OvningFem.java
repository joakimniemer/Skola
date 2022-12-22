import java.io.BufferedWriter;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.StandardOpenOption;
import java.util.Scanner;

public class OvningFem {
    public static void main(String[] args) {

        Path fileOut = Path.of("memorable_lines.txt");

        try (Scanner scan = new Scanner(System.in);
                BufferedWriter writer = Files.newBufferedWriter(fileOut, StandardOpenOption.APPEND)) {

            System.out.println("Skriv in en mening:");
            String input = scan.nextLine();

            writer.write(input + "\n");
            throw new IOException();

        } catch (IOException ex) {
            System.out.println("Det blev fel." + ex.getMessage());
        }

    }
}
