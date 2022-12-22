import java.util.Scanner;

public class OvningTva {

    public static void main(String[] args) {
        GuessingGame game1 = new GuessingGame();
        Scanner scan = new Scanner(System.in);

        String yesOrNo;

        do {
            game1 = new GuessingGame();

            System.out.println("Gissa vilket tal jag tänker på: ");

            while (true) {

                // System.out.println(game.getSecretNumber());
                int guess = scan.nextInt();
                int guessCheck = game1.guessNumber(guess);
                scan.nextLine();

                if (guessCheck == 1) {
                    System.out.printf("Talet jag söker är högre än %d, prova igen.\n", guess);
                } else if (guessCheck == 2) {
                    System.out.printf("Talet jag söker är mindre än %d, prova igen.\n", guess);
                } else {
                    System.out.println("Rätt svar!");
                    break;
                }

            }
            GuessingGame.bestResultCounter();
            GuessingGame.worstResultCounter();

            System.out.println("Du lyckades som bäst på " + game1.getBestResult() + " gissningar.");
            System.out.println("Du lyckades som sämst på " + game1.getWorstResult() + " gissningar.");
            GuessingGame.resetCounter();

            System.out.println("Vill du spela igen? (Y/N)");
            yesOrNo = scan.nextLine();
            yesOrNo = yesOrNo.toLowerCase();
        } while (!yesOrNo.equals("n"));

        GuessingGame.resetAllCounters();

        GuessingGame game2;

        do {
            game2 = new GuessingGame();

            System.out.println("Gissa vilket tal jag tänker på: ");

            while (true) {

                // System.out.println(game.getSecretNumber());
                int guess = scan.nextInt();
                int guessCheck = game2.guessNumber(guess);
                scan.nextLine();

                if (guessCheck == 1) {
                    System.out.printf("Talet jag söker är högre än %d, prova igen.\n", guess);
                } else if (guessCheck == 2) {
                    System.out.printf("Talet jag söker är mindre än %d, prova igen.\n", guess);
                } else {
                    System.out.println("Rätt svar!");
                    break;
                }

            }
            GuessingGame.bestResultCounter();
            GuessingGame.worstResultCounter();

            System.out.println("Du lyckades som bäst på " + game2.getBestResult() + " gissningar.");
            System.out.println("Du lyckades som sämst på " + game2.getWorstResult() + " gissningar.");
            GuessingGame.resetCounter();

            System.out.println("Vill du spela igen? (Y/N)");
            yesOrNo = scan.nextLine();
            yesOrNo = yesOrNo.toLowerCase();
        } while (!yesOrNo.equals("n"));

        scan.close();

    }
}
