import java.io.BufferedWriter;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.HashMap;

public class u1rev2 {
    public static void main(String[] args) {

        if (args.length != 2) {
            System.out.println("Skicka in två filnamn.");
            System.exit(-1);
        }

        if (!Files.exists(Path.of(args[0]))) {
            System.out.println("Filen finns inte.");
            System.exit(-1);
        }

        if (Files.exists(Path.of(args[1]))) {
            System.out.println("Filen finns redan");
            System.exit(-1);
        }

        Path inFile = Path.of(args[0]);
        Path outFile = Path.of(args[1]);

        try {

            String text = Files.readString(inFile);

            String outPutData = combineOutData(inFile, text);

            writeToFile(outPutData, outFile);

        } catch (Exception e) {
            System.out.println("Ett fel uppstod.");
            e.printStackTrace();
        }

    }

    private static void writeToFile(String string, Path outFile) throws IOException {
        try (BufferedWriter writer = Files.newBufferedWriter(outFile)) {

            writer.write(string);
        }
    }

    private static String combineOutData(Path inFile, String text) throws IOException {
        StringBuilder builder = new StringBuilder();
        LocalDateTime ldt = LocalDateTime.now();
        builder.append("Filename: " + inFile.toAbsolutePath() + "\n");
        builder.append("Date: " + ldt.format(DateTimeFormatter.ISO_LOCAL_DATE_TIME) + "\n");
        builder.append(wordCounter(text));
        // Kan ju också bara skriva in alla detta i en String.format för att göra det
        // enklare?
        return builder.toString();
    }

    private static String wordCounter(String text) {
        int uniqWords = 0;
        var mapCounter = new HashMap<String, Integer>();
        var words = text.split("\\W");

        for (String string : words) {
            mapCounter.put(string, mapCounter.getOrDefault(string.toLowerCase().trim(),
                    0) + 1);
        }

        for (var map : mapCounter.values()) {
            if (map == 1) {
                uniqWords++;
            }
        }

        String wordsToReturn = String.format("Words processed: %d%nTotal unique words: %d", uniqWords, words.length);

        return wordsToReturn;
    }
}
