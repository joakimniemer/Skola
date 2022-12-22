import java.util.Scanner;

public class LattareArrayOvningAtta {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        int[] values = new int[10];

        System.out.println("Skriv in några heltal (max 10 st), för sluta mata in tal skriv \"0\"");
        for (int i = 0; i < values.length; i++) {
            System.out.print("Skriv in ett heltal: ");
            int answer = scan.nextInt();
            if (answer == 0) {
                break;
            }
            if (values[9] > 0) {
                break;
            }
        }
        int maxValue = 0;
        int minValue = Integer.MAX_VALUE;

        for (int k = 0; k < values.length; k++) {
            if (values[k] > maxValue) {
                maxValue = values[k];
            }
            if (values[k] < minValue) {
                minValue = values[k];
            }
        }

        System.out.println("Det största talet du skrev in är " + maxValue);
        System.out.println("Det minsta talet du skrev in är " + minValue);
    }
}
