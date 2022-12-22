import java.util.Scanner;
import java.util.concurrent.ThreadLocalRandom;

public class OvningTva {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        System.out.print("Skriv in ett heltal:");
        int[] receivingArray = randomNumberArray(scan.nextInt());

        for (int number : receivingArray) {
            System.out.println(number);
        }

    }

    public static int[] randomNumberArray(int size) {

        int[] randomNumbers = new int[size];
        for (int i = 0; i < randomNumbers.length; i++) {
            randomNumbers[i] = ThreadLocalRandom.current().nextInt(101);
        }

        return randomNumbers;
    }

}
