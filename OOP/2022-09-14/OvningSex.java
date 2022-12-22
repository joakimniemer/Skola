import java.util.Scanner;

public class OvningSex {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        System.out.print("Skriv in en enhet: ");
        int input = scan.nextInt();

        for (int i = input; i > 0; i--) {
            for (int k = input; k > 0; --k) {

                if (k == i) {
                    System.out.print("1 ");
                } else {
                    System.out.print("0 ");
                }

            }
            System.out.println("");
        }

        scan.close();
    }
}
