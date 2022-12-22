import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class LattareArrayOvningSex {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        List<String> persons = new ArrayList<>();

        for (int i = 0; i < 3; i++) {
            System.out.println("Skriv in ett namn för person som deltar i lotteriet.");
            persons.add(scan.nextLine());
        }

        System.out.println("Skriv in en vinstsumma.");
        int moneyPot = scan.nextInt();
        int priceCounter = 0;

        for (String name : persons) {
            if (priceCounter < 1) {
                System.out.println(name + " vann " + (moneyPot / 2));
                priceCounter++;
            } else {
                System.out.println(name + " vann " + (moneyPot / 4));
            }
        }

    }
}
