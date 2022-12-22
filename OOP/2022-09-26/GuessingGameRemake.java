import java.util.concurrent.ThreadLocalRandom;

public class GuessingGameRemake {

    public int secretNumber;
    public int numbersOfGuesses;
    public int bestResult;
    public int worstResult;

    public GuessingGameRemake() {
        this.numbersOfGuesses = 0;
        this.bestResult = 100;
        this.worstResult = 0;
    }

    public void generatSecretNumber() {
        secretNumber = 1 + ThreadLocalRandom.current().nextInt(10);
        numbersOfGuesses = 0;
    }

    public int guess(int guess) {
        if (guess < secretNumber) {
            return -1;
        } else if (guess > secretNumber) {
            return 1;
        } else {
            return 0;
        }

    }

    public int getSecretNumber() {
        return secretNumber;
    }

    public int getNumberOfGuesses() {
        return numbersOfGuesses;
    }

    public int getBestResult() {
        return bestResult;
    }

    public int getWorstResult() {
        return worstResult;
    }

    public void setBestResult(int bestResult) {
        this.bestResult = bestResult;
    }

    public void setWorstResult(int worstResult) {
        this.worstResult = worstResult;
    }

    public void setNumberOfGuesses(){
        numbersOfGuesses++;
    }

}