import java.util.Locale;
import java.util.ResourceBundle;
import java.util.Scanner;

public class OvningFyra {
    public static void main(String[] args) {

        Locale locale = Locale.forLanguageTag(args[0]);
        // ex: java OvningFyra sv-SE
        // ex: java OvningFyra en-GB

        ResourceBundle bundle = ResourceBundle.getBundle("translations", locale);
    
        try (Scanner scan = new Scanner(System.in).useLocale(locale)) {

            System.out.println("Skriv in tre decimaltal:");
            double one = scan.nextDouble();
            double two = scan.nextDouble();
            double three = scan.nextDouble();

            double mean = (one + two + three) / 3;

            System.out.printf(locale, bundle.getString("mean"), mean);

        } catch (Exception e) {
            System.out.println("Ops");
        }

    }
}
