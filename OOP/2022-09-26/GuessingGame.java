import java.util.Random;

public class GuessingGame {

    private static int guessCounter = 0;
    private int secretNumber = randomNumber();
    private static int bestResult = 0;
    private static int worstResult = 0;

    public int randomNumber() {
        Random rand = new Random();
        return rand.nextInt(10) + 1;
    }

    public int guessNumber(int guess) {

        if (guess < secretNumber) {
            guessCounter++;
            return 1;
        } else if (guess > secretNumber) {
            guessCounter++;
            return 2;
        } else {
            guessCounter++;
            return 3;
        }

    }

    public static int getGuessCounter() {
        return guessCounter;
    }

    public static void resetCounter() {
        guessCounter = 0;
    }

    public int getSecretNumber() {
        return this.secretNumber;
    }

    public int getBestResult() {
        return bestResult;
    }

    public int getWorstResult() {
        return worstResult;
    }

    public static int bestResultCounter() {
        if (bestResult == 0) {
            bestResult = guessCounter;
        } else if (guessCounter < bestResult) {
            bestResult = guessCounter;
        }
        return bestResult;
    }

    public static int worstResultCounter() {
        if (guessCounter > worstResult) {
            worstResult = guessCounter;
        }
        return worstResult;
    }

    public static void resetAllCounters(){
        guessCounter = 0;
        bestResult = 0;
        worstResult = 0;
    }

}
