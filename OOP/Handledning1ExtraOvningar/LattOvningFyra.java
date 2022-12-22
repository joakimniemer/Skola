import java.util.Scanner;

public class LattOvningFyra {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        System.out.print("Vilken är din favorit siffra? ");
        int favoritSiffra = scan.nextInt();

        if (favoritSiffra < 0 || favoritSiffra > 9) {
            System.out.println("Det är ingen siffra utan ett nummer!");

        } else {
            System.out.println("Det är en bra siffra!");
        }

        scan.close();
    }
}
