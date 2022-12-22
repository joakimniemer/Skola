import java.io.BufferedReader;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.concurrent.ThreadLocalRandom;

public class HangMan {

    @SuppressWarnings({ "java:S106" })
    public static void main(String[] args) {

        try (Scanner scan = new Scanner(System.in)) {

            List<String> words = listOfWordsFromFile("paavo.txt.clean.txt");
            List<Character> guessedLetters = new ArrayList<>();

            String randomWord = getRandomWord(words);
            int guesses = 10;
            String previusAnswer = "";

            StringBuilder build = amountOfLetters(randomWord);
            System.out.printf("Order vi söker: %s. Du har %d gissningar.", build.toString(), guesses);

            while (guesses != 0) {
                previusAnswer = build.toString();
                String input = scan.nextLine();

                // if input is char.//göra om till metod?
                if (input.length() == 1) {
                    char charGuessed = input.charAt(0);
                    build = charHandler(charGuessed, randomWord, build);
                    usedLettersCheck(guessedLetters, charGuessed);

                    // if input is string.//göra om till metod?
                } else {
                    if (input.equalsIgnoreCase(randomWord)) {
                        System.out.println("Rätt! Du vann.");
                        break;
                    } else {
                        System.out.println("Fel svar.");
                    }
                }

                //göra om till metod?
                if (!build.toString().contains("*")) {
                    System.out.println("Rätt! Du vann.");
                    break;
                }

                //göra om till metod?
                if (build.toString().equalsIgnoreCase(previusAnswer)) {
                    guesses--;
                }

                System.out.printf(
                        "Så gär ser det ut nu: %s%nDu har gissad på dessa bokstäver: %s%nDu har %d gissningar kvar.%n",
                        build.toString(), guessedLetters, guesses);
            }


            if (guesses == 0) {
                System.out.println("Du blev hängd.");
            }

        } catch (IOException ex) {
            System.out.println(ex.getMessage());
        }

    }

    private static List<String> listOfWordsFromFile(String fileName) throws IOException {
        Path file = Path.of(fileName);
        BufferedReader reader = Files.newBufferedReader(file);
        List<String> words = new ArrayList<>();
        String line;
        while ((line = reader.readLine()) != null) {
            words.add(line);
        }
        return words;
    }

    private static StringBuilder amountOfLetters(String randomWord) {
        StringBuilder build = new StringBuilder();
        for (int i = 0; i < randomWord.length(); i++) {
            build.append("*");
        }
        return build;
    }

    @SuppressWarnings({ "java:S106" })
    private static Character usedLettersCheck(List<Character> guessedLetters, char guessedChar) {
        if (!guessedLetters.contains(guessedChar)) {
            guessedLetters.add(guessedChar);
            return guessedChar;
        } else {
            System.out.printf("Du har redan gissa på %s din dumbom.%n", guessedChar);
            return null;
        }
    }

    private static StringBuilder charHandler(char charGuessed, String randomWord, StringBuilder build) {
        for (int i = 0; i < randomWord.length(); i++) {
            if (charGuessed == randomWord.charAt(i)) {
                build.setCharAt(i, charGuessed);
            }
        }
        return build;
    }

    public static String getRandomWord(List<String> list) {
        int randomNumber = ThreadLocalRandom.current().nextInt(list.size());
        return list.get(randomNumber);
    }
}
