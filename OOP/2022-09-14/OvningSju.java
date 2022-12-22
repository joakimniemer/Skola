import java.util.Random;
import java.util.Scanner;

public class OvningSju {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        Random rand = new Random();

        int winCounterPlayer = 0;
        int winCountComputer = 0;
        String input;

        do {
            int slumpTal = rand.nextInt(3);
            System.out.print("sten, sax, påse? ");
            input = scan.nextLine();
            input = input.toLowerCase();

            if (slumpTal == 0) {
                System.out.println("Jag hade sten");
            } else if (slumpTal == 1) {
                System.out.println("Jag hade sax");
            } else {
                System.out.println("Jag hade påse");
            }

            if (input.equals("sten"))
                if (slumpTal == 0) {
                    System.out.println("Oavgjort.");
                } else if (slumpTal == 1) {
                    System.out.println("Du vann!");
                    winCounterPlayer++;
                } else {
                    System.out.println("Jag vann.");
                    winCountComputer++;
                }

            if (input.equals("sax"))
                if (slumpTal == 0) {
                    System.out.println("Jag vann.");
                    winCountComputer++;
                } else if (slumpTal == 1) {
                    System.out.println("Oavgjort.");
                } else {
                    System.out.println("Du vann!");
                    winCounterPlayer++;
                }

            if (input.equals("påse"))
                if (slumpTal == 0) {
                    System.out.println("Du vann!");
                    winCounterPlayer++;
                } else if (slumpTal == 1) {
                    System.out.println("Jag vann.");
                    winCountComputer++;
                } else {
                    System.out.println("Oavgjort.");
                }
        } while (!input.equals("sluta"));

        System.out.printf("Du vann %d gånger\n", winCounterPlayer);
        System.out.printf("Jag vann %d gånger", winCountComputer);

        scan.close();

    }
}
