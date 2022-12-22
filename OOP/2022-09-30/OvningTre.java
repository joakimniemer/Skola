import java.util.Scanner;

import javax.sound.sampled.SourceDataLine;

public class OvningTre {
    public static void main(String[] args) {

        Game game = new GuessingGame();
        Scanner scan = new Scanner(System.in);
        int bestNumberOfGuesses = Integer.MAX_VALUE;
        int worstNumberOfGuesses = 0;
        String continueAnswer;

        System.out.println("Vi spelar nu " + game.getName());

        do {
            int numGuesses = game.play();
            if (numGuesses < bestNumberOfGuesses) {
                bestNumberOfGuesses = numGuesses;
            }
            if (numGuesses > worstNumberOfGuesses) {
                worstNumberOfGuesses = numGuesses;
            }
            System.out.printf("Som bäst klarade du det på %d gissningar.",
             bestNumberOfGuesses);
            System.out.printf("Som somt klarade du det på %d gissningar",
             worstNumberOfGuesses);

            System.out.println("Vill du spela igen? (J/N)");
            continueAnswer = scan.next();
        } while (continueAnswer.toLowerCase().equals("j"));

    }

}