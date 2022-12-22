import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.StandardOpenOption;
import java.time.LocalDateTime;

public class App {
    public static void main(String[] args) {

        if (args.length != 2) {
            System.out.println("Lägg till två filer");
            System.exit(-1);
        }

        Path inFile = Path.of(args[0]);
        Path outFile = Path.of(args[1]);

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

            String outPutText = String.format("File: %s%nDate: %s%n%n%s%n", inFile.toAbsolutePath(),
                    LocalDateTime.now(),
                    removeUpperCaseLetters(text));

            Files.writeString(outFile, outPutText, StandardCharsets.UTF_8, StandardOpenOption.CREATE);

        } catch (Exception e) {
            System.err.println("Ett fel uppstod.");
            e.printStackTrace();
        }

    }

    private static String removeUpperCaseLetters(String text) {

        StringBuilder builder = new StringBuilder();
        var textToChars = text.toCharArray();
        int removedLetters = 0;

        for (char c : textToChars) {
            if (Character.isUpperCase(c)) {
                removedLetters++;
            }
        }

        String removeText = String.format("Removed: %s%n", removedLetters);
        builder.append(removeText);

        for (char c : textToChars) {
            if (!Character.isUpperCase(c)) {
                builder.append(c);
                removedLetters++;
            }
        }

        return builder.toString();
    }
}