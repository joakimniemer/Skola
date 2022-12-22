import java.io.BufferedReader;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;

public class Day1 {
    public static void main(String[] args) {

        String fileToRead = "dataDay1.txt";

        try {

            readFile(fileToRead);

        } catch (Exception e) {
            System.err.println("Ops");
        }

    }

    private static void readFile(String fileToRead) throws IOException {

        try (BufferedReader reader = Files.newBufferedReader(Path.of(fileToRead))) {

            int maxCalories = 0;
            int totalCalories = 0;
            String line;
            while ((line = reader.readLine()) != null) {

                if (line.isBlank()) {
                    // nästa rad är ny alv
                    if (totalCalories > maxCalories) {
                        maxCalories = totalCalories;
                    }
                    totalCalories = 0;

                } else {
                    // addera till nuvarande alv
                    totalCalories += Integer.parseInt(line);
                }

            }

            if (totalCalories > maxCalories) {
                maxCalories = totalCalories;
            }

            System.out.println(maxCalories);

        }

        // Testdatan skall ge 24000

    }

}