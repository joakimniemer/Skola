import java.util.Scanner;

public class WhileEx {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        System.out.println("Skriv ett bra namn;");
        String name = scan.nextLine();

        while (!name.equals("Joakim")) {
            System.out.println("Nä försök igen.");
            name = scan.nextLine();
        }

        System.out.println("Fint namn");
        
        scan.close();

    }

}