import java.util.Scanner;

public class OvningEtt {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        System.out.println("Skriv in namn, ålder och längd i meter: ");
        String name = scan.next();
        int age = scan.nextInt();
        double length = scan.nextDouble() * 100;

        if (age < 13) {
            System.out.println("Jag får inte behandla din information.");
        } else {
            if (length > 174) {
                System.out.printf("%s du är %.2f cm lång.", name, length);
                System.out.println(" Du är längre än en medelsvensson.");
            } else {
                System.out.printf("%s du är %.2f cm lång.", name, length);
            }
        }

        scan.close(

        );
    }
}
