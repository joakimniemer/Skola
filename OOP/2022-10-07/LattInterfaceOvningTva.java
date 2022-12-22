import java.util.Scanner;

public class LattInterfaceOvningTva {

    public static int minimum(int[] values) {
        int minValue = Integer.MAX_VALUE;

        for (int min : values) {
            if (min < minValue) {
                minValue = min;
            }
        }
        return minValue;
    }

    public static int maximum(int[] values) {
        int maxValue = Integer.MIN_VALUE;

        for (int max : values) {
            if (max > maxValue) {
                maxValue = max;
            }
        }
        return maxValue;
    }

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int[] values = new int[3];
        for (int i = 0; i < 3; i++) {
            System.out.print("Skriv in ett tal: ");
            values[i] = scan.nextInt();
            scan.nextLine();
        }

        System.out.printf("Vad vill du räkna ut:%n- minimum%n- maximum%n");
        String answer = scan.nextLine();
        if (answer.equals("minimum")) {
            System.out.println("min: " + minimum(values));
        } else if (answer.equals("maximum")) {
            System.out.println("min: " + maximum(values));
        }
    }
}