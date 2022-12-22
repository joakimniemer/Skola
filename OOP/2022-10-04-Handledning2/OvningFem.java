import java.time.LocalDate;
import java.time.temporal.ChronoUnit;
import java.time.temporal.Temporal;
import java.time.temporal.TemporalUnit;
import java.util.Scanner;

public class OvningFem {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        System.out.println("Vilket år är du född?");
        int year = scan.nextInt();
        System.out.println("Vilken månad är du född?");
        int month = scan.nextInt();
        System.out.println("Vilken dag är du född?");
        int day = scan.nextInt();

        long daysBetween = ChronoUnit.DAYS.between(LocalDate.of(year, month, day), LocalDate.now());

        System.out.println("Du har levt i " + daysBetween + " dagar.");

    }
}
