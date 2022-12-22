import java.util.Scanner;

public class OvningTre {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        System.out.println("Skriv in ett tal:");
        int answer = scan.nextInt();
        System.out.println("Talet består av " + numberOfNumbers(answer) + " siffror.");

    }

    /**
     * Metod för att beräkna antalet siffror i ett heltal.
     * 
     * @param input
     * @return numberCounter, antal siffror i talet från input.
     */
    private static int numberOfNumbers(int input) {
        int numberCounter = 0;
        int multiplier = 1;
        int controlValue = 1;
        for (int i = 1; i <= input; i++) {

            if (i == multiplier * controlValue) {
                numberCounter++;
                multiplier *= 10;
            }
        }
        return numberCounter;
    }
}
