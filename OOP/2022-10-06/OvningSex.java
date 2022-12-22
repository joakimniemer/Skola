import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class OvningSex {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        Exchange e = new Exchange();

        List<Exchange> rates = new ArrayList<>();
        rates.add(new Exchange("EUR", 1));
        rates.add(new Exchange("NOK", 9.5));
        rates.add(new Exchange("SEK", 10));
        rates.add(new Exchange("DKK", 6));
        rates.add(new Exchange("GBP", 0.7));

        System.out.println("Vi hanterar växling i: EUR, SEK, NOK, DKK, GBP.");
        System.out.println("Vad vill du växla från?");
        String exchangeFrom = scan.nextLine();

        System.out.println("Vad vill du växla till?");
        String exchangeTo = scan.nextLine();

        System.out.printf("Hur många %s vill du växla?%n", exchangeFrom.toUpperCase());
        double amount = scan.nextDouble();

        double rateToEur = 0;
        double rateFromEur = 0;
        for (Exchange ex : rates) {
            if (ex.getCurrancy().equalsIgnoreCase(exchangeFrom)) {
                rateToEur = ex.getRate();
            }
            if (ex.getCurrancy().equalsIgnoreCase(exchangeTo)) {
                rateFromEur = ex.getRate();
            }
        }

        double newAmount = e.exchangeCurrancy(rateToEur, rateFromEur, amount);

        System.out.printf("Det blir %.2f %s%n", newAmount, exchangeTo.toUpperCase());

        scan.close();
    }
}
