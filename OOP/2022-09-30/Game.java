import java.util.Scanner;

public interface Game {
    String getName();

    /**
     * Play the game, return the player's score
     * 
     * @return the score
     */
    int play();
}