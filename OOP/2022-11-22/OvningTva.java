import java.util.Locale;
import java.util.Scanner;

public class OvningTva {
    public static void main(String[] args) {

        try (Scanner scan = new Scanner(System.in)) {

            Locale locale = new Locale("sv", "SE");
            // Alternativt sätt att skriva det på.
            // Locale l = Locale.forLanguageTag("sv-SE");
            
            scan.useLocale(locale);
            //Går även lägga den direkt i scannern.
            //Scanner scan = new Scanner(System.in).useLocale(locale);

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
