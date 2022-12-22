import java.util.Scanner;

public class SvarOvningTva {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.print("Skriv in ett tal mellan -128 och 127:");
        int input;


        do {
            input = scan.nextInt();
            if (input >= 128) {
                System.out.println("För stort, försök igen:");
            } else if (input <= -129) {
                System.out.println("För litet, försök igen:");
            } else {
                byte inputByte = (byte) input;
                System.out.printf("Bra, du skrev in %d", inputByte);
            }

        } while (input >= 128 || input < -128);

        scan.close();

    }
}
