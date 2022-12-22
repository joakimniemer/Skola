
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.StandardOpenOption;
import java.time.LocalDateTime;
import java.util.HashMap;

public class uu1 {
    public static void main(String[] args) {

        Path inFile = Path.of(args[0]);
        Path outFile = Path.of(args[1]);

        if (args.length != 2) {
            System.out.println("Lägg till två filer.");
            System.exit(-1);
        }

        if (!Files.exists(inFile)) {
            System.out.println("Första filen finns inte.");
            System.exit(-1);
        }

        if (Files.exists(outFile)) {
            System.out.println("Andra filen finns redan.");
            System.exit(-1);
        }

        try {

            String text = Files.readString(inFile);

            String outOutText = String.format("Filename: %s%nDate: %s%n%s", inFile.toAbsolutePath(),
                    LocalDateTime.now(), countWords(text));

            Files.writeString(outFile, outOutText, StandardCharsets.UTF_8, StandardOpenOption.CREATE);

        } catch (Exception e) {
            System.err.println("Det uppstod ett fel.");
            e.printStackTrace();
        }

    }

    private static String countWords(String text) {

        var map = new HashMap<String, Integer>();
        var words = text.split("\\W");
        int uniqueWords = 0;

        for (String string : words) {

            if (!string.isBlank()) {
                map.put(string.toLowerCase().trim(), map.getOrDefault(string.toLowerCase().trim(), 0) + 1);
            }
        }

        for (int value : map.values()) {
            if (value == 1) {
                uniqueWords++;
            }
        }

        return String.format("Words processed: %d%nTotal unique words: %d%n", words.length, uniqueWords);
    }
}
