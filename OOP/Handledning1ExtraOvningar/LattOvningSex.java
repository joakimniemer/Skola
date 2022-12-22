import java.util.Scanner;

public class LattOvningSex {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        int svar;

        do {
            System.out.print("Skriv in ett hel tal: ");
            svar = scan.nextInt();
            System.out.printf("Dubbelt: %d\n", (2 * svar));

        } while (svar != 0);

        System.out.println("Hej då!");

        scan.close();

    }
}
