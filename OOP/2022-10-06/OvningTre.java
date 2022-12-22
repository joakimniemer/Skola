import java.util.Scanner;

public class OvningTre {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        Secretlanguages sl = new Secretlanguages();

        System.out.println("Vill du översätta till rövarspråket eller all-språket?");
        String choice = scan.nextLine();

        if (choice.equals("rövarspråket")) {
            System.out.print("Skriv en text du vill översätta till rövarspråket: ");
            String input = scan.nextLine().toLowerCase();
            String endResult = sl.theRobberLanguage(input);
            System.out.println(endResult);
        }

        if (choice.equals("all-språket")) {
            System.out.print("Skriv en text du vill översätta till all-språket: ");
            String input = scan.nextLine().toLowerCase();
            String endResult = sl.allLanguage(input);
            System.out.println(endResult);
        }

    }
}
