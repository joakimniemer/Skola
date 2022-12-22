import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.HashSet;
import java.util.Set;

public class WordFromFileRemka {
    public static void main(String[] args) {

        // öppna filen
        // läsa in filen
        // göra den till vettiga ord
        // ta bort för korta ord
        // se till att den inte har dubbletter
        // skriva till en ny fil

        if (args.length != 1){
            printHelp();
            System.exit(-1);
        }

        Path fileIn = Path.of(args[0]);
        Path fileOut = Path.of(args[0] + ".clean.txt");

        if (!Files.exists(fileIn)){
            System.out.println("The file does not exist.");
            System.exit(-1);
        }

        try (BufferedReader reader = Files.newBufferedReader(fileIn);
                BufferedWriter writer = Files.newBufferedWriter(fileOut)) {

            Set<String> list = readWords(reader);

            System.out.println(list);

            for (String word : list){
                writer.append(word);
                writer.append("\n");
            }

        } catch (Exception ex) {
            System.out.println(ex);
        }
    }

    private static void printHelp() {
        System.out.println("Need to put in arg.");
    }

    private static Set<String> readWords(BufferedReader reader) throws IOException {
        Set<String> words = new HashSet<>();

        String line;
        while ((line = reader.readLine()) != null) {
            Set<String> lineWords = splitInToWords(line);
            words.addAll(lineWords);
        }
        return words;
    }

    private static Set<String> splitInToWords(String line) {
        Set<String> listOfWords = new HashSet<>();

        String[] rawWords = line.split("\\s");
        for (String word : rawWords) {
            if (word.length() > 5) {
                listOfWords.add(cleanWord(word));
            }
        }
        return listOfWords;
    }

    private static String cleanWord(String word) {
        StringBuilder sb = new StringBuilder();

        for (char letter : word.toCharArray()) {
            if (Character.isAlphabetic(letter)) {
                sb.append(letter);
            }
        }
        return sb.toString();
    }

}
