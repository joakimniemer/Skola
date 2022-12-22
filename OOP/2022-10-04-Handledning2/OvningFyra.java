import java.util.Scanner;
import java.util.concurrent.ThreadLocalRandom;

public class OvningFyra {
    private static long currentTimeMillis;

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        int points = 0;
        int rounds = 0;
        String playAgain;

        do {
            int sekunder = 1 + ThreadLocalRandom.current().nextInt(10);
            System.out.printf("Du skall trycka ner enter om %d sekunder.%n", sekunder);
            long firstValue = System.currentTimeMillis();
            String enter = scan.nextLine();
            long secondValue = System.currentTimeMillis();
            long result = (secondValue - firstValue) / 1000;

            if (result > sekunder - 2 && result < sekunder + 2) {
                points += 3;
                System.out.printf("Du tryckte efter %d sekunder%nDu får 3 poäng.%n", result);
                System.out.printf("Totalt har du %d poäng.%n", points);
            } else {
                points -= 1;
                System.out.printf("Du tryckte efter %d sekunder%nDu får -1 poäng.%n", result);
                System.out.printf("Totalt har du %d poäng.%n", points);
            }

            rounds++;
            System.out.println("Vill du spela igen? (ja/nej)");
            playAgain = scan.nextLine();
        } while (!playAgain.equalsIgnoreCase("nej"));

        System.out.printf("Du har spelat %d omgångar och fått %d poäng%n", rounds, points);
    }
}
