package Gangetabell;

import java.util.Scanner;

public class FunGame {
    public static void main(String[] args) {
        Engine a = new Engine();
        Player p1 = new Player("Joakim");
        Player p2 = new Player("Max");

        try (Scanner scan = new Scanner(System.in)) {

            String playAgain = "";

            while (!playAgain.equals("n")) {
                game(scan, p1, p2);
                System.out.println(p1);
                System.out.println(p2);
                System.out.println("Vill ni spela igen j/n?");

                playAgain = scan.nextLine();
            }

        }
    }

    private static void game(Scanner scan, Player p1, Player p2) {
        Engine a = new Engine();

        System.out.println("Nu spelar " + p1.getName());
        question(scan, a, p1);
        System.out.printf("%s klarade alla frågor på %.2f sekunder.%n%n",p1.getName(), a.getTime());
        System.out.println("Nu spelar " + p2.getName());
        question(scan, a, p2);
        System.out.printf("%s klarade alla frågor på %.2f sekunder.%n%n",p2.getName(), a.getTime());

    }

    private static void question(Scanner scan, Engine a, Player p) {

        long startTime = System.currentTimeMillis();
        for (int i = 0; i < 5; i++) {
            a.getRandomNumber();
            System.out.printf("Vad blir %d * %d: ", a.getRandomNumberOne(), a.getRandomNumberTwo());
            int answer = scan.nextInt();
            scan.nextLine();
            if (answer == a.getAnswer()) {
                System.out.println("rätt");
            }
        }
        long endTime = System.currentTimeMillis();
        a.startTimeEndTime((endTime - startTime) / 1000);
        p.setHighScore(a.getTime());
    }

    // fortsätt här.
    // private static void getPoints(double pointOne, double pointTwo){
    // if (pointOne > pointTwo) {

    // System.out.println("");

    // }

}
