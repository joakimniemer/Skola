import java.io.BufferedReader;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collector;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Excercise3 {
    public static void main(String[] args) {

        Path file = Path.of("testFile.txt");

        try (BufferedReader reader = Files.newBufferedReader(file)) {

            var counter = Files.lines(file).filter(w -> w.contains("and")).mapToInt(String::length).sum();
            System.out.println(counter);

            // Sätt att lösa det utan stream.

            // StringBuilder charsToCount = new StringBuilder();
            // String line;
            // while ((line = reader.readLine()) != null) {

            // for (int i = 0; i < line.length(); i++) {
            // if (line.charAt(i) == 'd' && line.charAt(i - 1) == 'n' && line.charAt(i - 2)
            // == 'a') {
            // charsToCount.append(line);
            // }
            // }
            // }

            // System.out.println(charsToCount.toString().length());

        } catch (IOException ex) {
            System.err.println("Ops, " + ex);
        }
    }
}