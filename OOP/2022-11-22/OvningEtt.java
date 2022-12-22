import java.text.NumberFormat;
import java.util.Locale;
import java.util.Scanner;

public class OvningEtt {
    public static void main(String[] args) {

        try (Scanner scan = new Scanner(System.in)) {

            Locale locale = new Locale("en", "GB");
            scan.useLocale(locale);

            System.out.println("Skriv in tre decimaltal:");
            double one = scan.nextDouble();
            double two = scan.nextDouble();
            double three = scan.nextDouble();

            double median = (one + two + three) / 3;

            System.out.printf(locale, "%.3f,", median);

        } catch (Exception e) {
            System.out.println("Ops");
        }

    }
}