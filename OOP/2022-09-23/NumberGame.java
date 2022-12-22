import java.util.concurrent.ThreadLocalRandom;

public class NumberGame {

    private Player playerOne;
    private Player playerTwo;
    private Player currentPlayer;
    private int roundTarget;

    public NumberGame(Player playerOne, Player playerTwo) {
        this.playerOne = playerOne;
        this.playerTwo = playerTwo;

        this.currentPlayer = playerOne;
        if (ThreadLocalRandom.current().nextBoolean()) {
            this.currentPlayer = playerTwo;
        }
        this.currentPlayer = playerOne;
        this.roundTarget = ThreadLocalRandom.current().nextInt(10) + 1;
    }

    public void newRound() {
        roundTarget = ThreadLocalRandom.current().nextInt(10) + 1;
    }

    public boolean guess(int guessedNumber) {
        if (guessedNumber == roundTarget) {
            // vi har en vinnare!
            currentPlayer.guessedRigth();
            return true;
        } else {
            // Nästa spelar gissar.
            currentPlayer.guessedWrong();
            swapPlayer();
            return false;
        }
    }

    private Player getCurrentPlayer() {
        return currentPlayer;
    }

    private void swapPlayer() {
        if (currentPlayer == playerOne) {
            currentPlayer = playerTwo;
        } else {
            currentPlayer = playerOne;
        }
    }
}
