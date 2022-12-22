import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.StandardOpenOption;
import java.time.LocalDateTime;
import java.util.HashMap;

public class u1rev3 {
    public static void main(String[] args) {

        Path inFile = Path.of(args[0]);
        Path outFile = Path.of(args[1]);

        if (args.length != 2) {
            System.out.println("Skicka in två filnamn.");
            System.exit(-1);
        }

        if (!Files.exists(inFile)) {
            System.err.println("Första filen finns inte.");
            System.exit(-1);
        }

        if (Files.exists(outFile)) {
            System.err.println("Andra filen finns redan.");
            System.exit(-1);
        }

        try {

            String textFromFile = Files.readString(inFile);

            String wordCounted = countWord(textFromFile);

            String outPutString = String.format("Filename: %s%nDate: %s%n%s", inFile.toAbsolutePath(),
                    LocalDateTime.now(), wordCounted);

            Files.writeString(outFile, outPutString, StandardCharsets.UTF_8, StandardOpenOption.CREATE);

        } catch (Exception e) {
            System.err.println("Ett fel uppstod.");
            e.printStackTrace();
        }

    }

    private static String countWord(String input) {

        var map = new HashMap<String, Integer>();
        var word = input.split("\\W");
        int uniqueWord = 0;

        for (String string : word) {
            if (!string.isBlank()) {
                string = string.toLowerCase().trim();
                map.put(string, map.getOrDefault(string, 0) + 1);
            }
        }

        for (var val : map.values()) {
            if (val == 1) {
                uniqueWord++;
            }
        }

        return String.format("Words processed: %d%nTotal unique words: %d", uniqueWord,
                word.length);
    }
}