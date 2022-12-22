import java.util.Scanner;

public class OvningEttRemake {
    public static void main(String[] args) {
        GuessingGameRemake ggr = new GuessingGameRemake();
        Scanner scan = new Scanner(System.in);

        int playerGuess;
        String playAgainAnswer;
        do {
            ggr.generatSecretNumber();

            do {
                System.out.print("Gissa vilket tal jag tänker på? ");
                playerGuess = scan.nextInt();
                ggr.guess(playerGuess);
                if (ggr.guess(playerGuess) == -1) {
                    ggr.setNumberOfGuesses();
                    System.out.printf("Talet är jag tänker på är större än %d%n",
                            playerGuess);
                } else if (ggr.guess(playerGuess) == 1) {
                    ggr.setNumberOfGuesses();
                    System.out.printf("Talet jag tänker på är mindre än %d%n",
                            playerGuess);
                } else {
                    ggr.setNumberOfGuesses();
                    System.out.println("Rätt svar!");
                }
            } while (ggr.guess(playerGuess) != 0);

            if (ggr.getNumberOfGuesses() > ggr.getWorstResult()){
                ggr.setWorstResult(ggr.getNumberOfGuesses());
            }
            if (ggr.getNumberOfGuesses() < ggr.getBestResult()){
                ggr.setBestResult(ggr.getNumberOfGuesses());
            }
            System.out.printf("Som bäst lyckades du på %d gissningar.",
                    ggr.getBestResult());
            System.out.printf("Som sämst klarade du det på %d gissningar",
                    ggr.getWorstResult());

            System.out.println("Vill du spela igen? (j/n)");
            playAgainAnswer = scan.next();
            playAgainAnswer = playAgainAnswer.toLowerCase();
        } while (!playAgainAnswer.equals("n"));
    }

}