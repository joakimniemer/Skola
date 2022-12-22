import java.util.Scanner;
import java.util.concurrent.ThreadLocalRandom;

public class OvningTva {
    public static void main(String[] args) {

        game();
        

    }

    public static int game() {
        Scanner scan = new Scanner(System.in);
        int rightAnswers = 0;
        int numberOfQuestions = 0;
        int totalTime = 0;
        int answer;
        int timeBonus = 0;

        System.out.println("Vill du spela på lätt, medel eller jättesvårt nivå? (l/m/j)");
        String levelChoice = scan.nextLine();
        System.out.println("Svara 0 för att avsluta.");

        do {
            int randomNumberOne = 2 + ThreadLocalRandom.current().nextInt(9);
            int randomNumberTwo = 2 + ThreadLocalRandom.current().nextInt(9);
            System.out.printf("Vad blir %d x %d?%n", randomNumberOne, randomNumberTwo);
            long timeOne = System.currentTimeMillis();
            answer = scan.nextInt();
            long timeTwo = System.currentTimeMillis();
            totalTime += (timeTwo - timeOne) / 1000;

            if (answer != 0 && answer == (randomNumberOne * randomNumberTwo)) {
                rightAnswers++;
            }
            if (answer != 0) {
                numberOfQuestions++;

                if (levelChoice.equals("l") && (randomNumberOne * randomNumberTwo) / 1000 <= 8) {
                    timeBonus++;
                }
                if (levelChoice.equals("m") && (randomNumberOne * randomNumberTwo) / 1000 <= 5) {
                    timeBonus++;
                }
                if (levelChoice.equals("j") && (randomNumberOne * randomNumberTwo) / 1000 <= 2) {
                    timeBonus++;
                }
            }

        } while (answer != 0);

        double median = totalTime / numberOfQuestions;
        System.out.printf(
                "Du svarade på %d frågor. Du hade %d rätt.%nTotalt tog det %d sekunder att svara (%.1f sekunder i snitt per fråga).%n",
                numberOfQuestions, rightAnswers, totalTime, median);
        System.out.printf("Du fick %d tidsbonus poäng.", timeBonus);
        return rightAnswers;
    }

}