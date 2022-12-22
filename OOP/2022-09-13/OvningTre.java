import java.util.Scanner;

public class OvningTre {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Ange födelseår med fyra siffror.");
        int year = scanner.nextInt();

        int currentYear = 2022;
        if (year <= 2004) {
            int diff = currentYear - year;
            System.out.printf("Du är %d år och myndig.", diff);

        } else {
            System.out.println("Du är omyndig.");
        }

        scanner.close();
    }
}
