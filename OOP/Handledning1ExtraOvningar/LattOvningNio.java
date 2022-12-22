import java.util.Scanner;

public class LattOvningNio {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        System.out.print("Vad heter du? ");
        String namn = scan.nextLine();
        int antal = namn.length();

        for (int i = antal; i > 0; i--) {
            System.out.println(namn);
        }

        scan.close();

    }
}
