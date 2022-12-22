import java.util.Scanner;

public class OvningSju {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        // Answers to game questions.
        String answer1 = "tokyo";
        String asnwer2 = "stockholm";
        String answer3 = "oslo";

        // Variable for continue to play or not.
        String playOrQuit;

        System.out.printf("%n%nSkriv in ditt namn: ");
        Statistics sGame1 = new Statistics(scan.nextLine());
        do {
            // Question one.
            System.out.println("Vad heter huvudstaden i Japan?");
            while (!scan.nextLine().equals(answer1)) {
                System.out.println("Fel, prova igen.");
                sGame1.guessCounterAdd();
            }
            sGame1.rigthAnswerReaction();

            // Question two.
            System.out.println("Vad heter huvudstaden i Sverige?");
            while (!scan.nextLine().equals(asnwer2)) {
                System.out.println("Fel, prova igen.");
                sGame1.guessCounterAdd();
            }
            sGame1.rigthAnswerReaction();

            // Question three.
            System.out.println("Vad heter huvudstaden i Norge?");
            while (!scan.nextLine().equals(answer3)) {
                System.out.println("Fel, prova igen.");
                sGame1.guessCounterAdd();
            }

            sGame1.timesPlayedAdd();

            // Scoreboard
            System.out.println(sGame1);
            playOrQuit = scan.nextLine();
            playOrQuit = playOrQuit.toLowerCase();
        } while (!playOrQuit.equals("nej"));
        System.out.println("Välkommen åter!");
    }

}
