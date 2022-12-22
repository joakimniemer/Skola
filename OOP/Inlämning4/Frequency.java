import java.io.BufferedReader;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

@SuppressWarnings({ "java:S106" })
public class Frequency {
    public static void main(String[] args) {

        if (args.length < 1 || args.length == 1 && args[0].equals("-i")) {
            System.out.println("Det behövs minst ett argument.");
            System.exit(-1);
        }

        List<String> files = new ArrayList<>();
        for (int i = 0; i < args.length; i++) {
            if (Files.exists(Path.of(args[i]))) {
                files.add(args[i]);
            } else if (!args[i].equals("-i")) {
                System.err.printf("Filen %s finns inte.%n%n", args[i]);
            }
        }

        try {

            String combinedText = combineTextFromAllFiles(files);

            if (ignoreCaseFlag(args[0])) {
                combinedText = combinedText.toLowerCase();
            }

            List<Character> uniqueCharacters = new ArrayList<>(getUniqueChars(combinedText));
            List<String> numberOfChars = countNumberOfChars(uniqueCharacters, combinedText);

            numberOfChars.stream().sorted().forEach(System.out::println);

        } catch (IOException ex) {
            System.err.println("Ops nu blev det fel.");
            System.err.println(ex);
        }
    }

    /**
     * Metod for checking if first argument is -i and if true puts all text
     * to lowerCase.
     * 
     * @param arg first argument from user with name of files to check.
     * @return true if "flag" -i is used as the first agument.
     */
    private static boolean ignoreCaseFlag(String arg) {
        if (arg.equals("-i")) {
            return true;
        }
        return false;
    }

    /**
     * Counting and listing amount of times a character appears in a text.
     * 
     * @param existingChars characters to be counted.
     * @param combinedText  text to count characters from.
     * @return numberOfChars String List with char and number of times it
     *         appears in a text.
     */
    private static List<String> countNumberOfChars(List<Character> existingChars, String combinedText) {
        List<String> numberOfChars = new ArrayList<String>();
        for (int i = 0; i < existingChars.size(); i++) {

            int letterOccurens = charOccurensCounter(existingChars.get(i), combinedText);
            numberOfChars.add(existingChars.get(i) + ": " + letterOccurens);
        }
        return numberOfChars;
    }

    /**
     * 
     * Counts the number of times a character appears in a text.
     * 
     * @param character    unique characters to be counted.
     * @param combinedText text to count characters from.
     * @return occurens number of time the character apperas in the text.
     */
    private static int charOccurensCounter(Character character, String combinedText) {
        int occurens = 0;
        for (int k = 0; k < combinedText.length(); k++) {

            if (character.equals(combinedText.charAt(k))) {
                occurens++;
            }
        }
        return occurens;
    }

    /**
     * Sorting out all unique characters from a string text and returning
     * a set och characters that can be counted.
     * 
     * @param combinedText text to extract unique characters from.
     * @return set of unique characters existing in the text (whitespace removed).
     */
    private static Set<Character> getUniqueChars(String combinedText) {
        Set<Character> existingChars = new HashSet<>();
        for (int i = 0; i < combinedText.length(); i++) {

            if (!Character.isWhitespace(combinedText.charAt(i))) {
                existingChars.add(combinedText.charAt(i));
            }
        }
        return existingChars;
    }

    /**
     * Combining all text from a list of files to one string to only have
     * to check letters from one string.
     * 
     * @param files list with name of all added files.
     * @return one string with all the text from all files.
     * @throws IOException
     */
    private static String combineTextFromAllFiles(List<String> files) throws IOException {
        StringBuilder build = new StringBuilder();
        for (int i = 0; i < files.size(); i++) {

            for (String text : readFile(files.get(i))) {
                build.append(text);
            }
        }
        return build.toString();
    }

    /**
     * Reads all text from all files added and combining to one List of Strings
     * as a first step of checking amount of characters.
     * 
     * @param fileName filename added in arguments
     * @return listOfLines list with strings of all lines in all textfiles
     * @throws IOException
     */
    private static List<String> readFile(String fileName) throws IOException {
        List<String> listOfLines = new ArrayList<>();
        try (BufferedReader reader = Files.newBufferedReader(Path.of(fileName))) {

            String line;
            while ((line = reader.readLine()) != null) {
                listOfLines.add(line);
            }
        }
        return listOfLines;
    }

    private void foo() {
        Map<Character, Integer> map = new HashMap<>();
        for (char c : "apapapa".toCharArray()) {
            if (!Character.isWhitespace(c)) {
                // map.put(c, map.getOrDefault(c, 0) + 1);
                map.merge(c, 1, Integer::sum);
            }
        }
    }
}
