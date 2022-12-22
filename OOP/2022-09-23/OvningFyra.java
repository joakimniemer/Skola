import java.util.Scanner;

public class OvningFyra {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        System.out.println("Skriv in ett tal: ");
        int answer = scan.nextInt();

        while (answer % 2 == 0) {
            System.out.println("Skriv in ett udda tal, tack: ");
            answer = scan.nextInt();
        }

        int x = answer;

        for (int i = 1; i <= answer; i++) {

            for (int k = 1; k <= answer; k++) {

                if (k == i || k == x) {
                    System.out.print("*");
                } else {
                    System.out.print(" ");
                }
            }
            x--;
            System.out.println("");
        }

    }
}
