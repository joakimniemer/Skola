import java.util.Scanner;
import java.util.concurrent.ThreadLocalRandom;

public class GuessingGame implements Game {
    private int secretNumber;
    private int numberOfGuesses;
    Scanner scan = new Scanner(System.in);

    public GuessingGame() {
        secretNumber = 1 + ThreadLocalRandom.current().nextInt(10);
        numberOfGuesses = 0;
    }

    public int guess(int guess) {
        numberOfGuesses++;
        if (guess == secretNumber) {
            return 0;
        } else if (guess < secretNumber) {
            return -1;
        }
        return 1;
    }

    public int getNumberOfGuesses() {
        return numberOfGuesses;
    }

    @Override
    public String getName() {
        return "Gissnings spelet";
    }

    @Override
    public int play() {
        GuessingGame gg = new GuessingGame();
        int res;
        do {
            System.out.println("Gissa vilket tal jag tänker på?");
            int guessedNumber = scan.nextInt();
            res = gg.guess(guessedNumber);
            if (res == 0) {
                System.out.println("Hurra du lyckades!");
            } else if (res < 0) {
                System.out.printf("Talet jag söker är större än %d.%n",
                        guessedNumber);
            } else {
                System.out.printf("Talet jag söker är mindre än %d.%n",
                        guessedNumber);
            }
        } while (res != 0);
        return gg.getNumberOfGuesses();
    }
}
