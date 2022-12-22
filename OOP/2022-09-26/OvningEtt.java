import java.util.Scanner;

public class OvningEtt {

    public static void main(String[] args) {
        GuessingGame game = new GuessingGame();
        Scanner scan = new Scanner(System.in);

        String yesOrNo;
        int bestResult = 0;
        int worstResult = 0;

        do {
            game = new GuessingGame();

            System.out.println("Gissa vilket tal jag tänker på: ");

            int guessStreak;

            while (true) {

                // System.out.println(game.getSecretNumber());
                int guess = scan.nextInt();
                int guessCheck = game.guessNumber(guess);
                scan.nextLine();

                if (guessCheck == 1) {
                    System.out.printf("Talet jag söker är högre än %d, prova igen.\n", guess);
                } else if (guessCheck == 2) {
                    System.out.printf("Talet jag söker är högre än %d, prova igen.\n", guess);
                } else {
                    System.out.println("Rätt svar!");
                    break;
                }

            }

            if (bestResult == 0) {
                bestResult = game.getGuessCounter();
            } else if (game.getGuessCounter() < bestResult) {
                bestResult = game.getGuessCounter();
            }

            if (game.getGuessCounter() > worstResult) {
                worstResult = game.getGuessCounter();
            }

            System.out.println("Du lyckades som bäst på " + bestResult + " gissningar.");
            System.out.println("Du lyckades som sämst på " + worstResult + " gissningar.");

            System.out.println("Vill du spela igen? (Y/N)");
            yesOrNo = scan.nextLine();
            yesOrNo = yesOrNo.toLowerCase();
        } while (!yesOrNo.equals("n"));

        scan.close();

    }
}
