import java.util.Random;
import java.util.Scanner;

public class OvningTre {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        Random rand = new Random();

        int slumpTalEttTillTio = rand.nextInt(10) + 1;
        int gissning;

        System.out.println("Gissa vilket tal jag tänker på mellan 1-10.");

        do {
            gissning = scan.nextInt();
            if (gissning < slumpTalEttTillTio) {
                System.out.print("Jag tänker på ett högre tal.");
            } else if (gissning > slumpTalEttTillTio) {
                System.out.print("Jag tänker på ett lägre tal.");
            }
        } while (gissning != slumpTalEttTillTio);

        System.out.printf("Rätt! Jag tänkte på talet %d.\n", slumpTalEttTillTio);

        scan.close();
    }
}