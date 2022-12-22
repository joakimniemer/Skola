import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.time.temporal.ChronoUnit;
import java.util.Scanner;

public class OvningSex {
    public static void main(String[] args) {

        try (Scanner scan = new Scanner(System.in)) {

            System.out.println("Skriv in födelsedatum: yyyy-mm-dd");
            LocalDate bDay = LocalDate.parse(scan.next(), DateTimeFormatter.ISO_DATE);
    
            LocalDate today = LocalDate.now();

            if (bDay.isAfter(today)){
                System.out.println("Du är inte född än.");
                System.exit(-1);
            }

            long daysAlive = ChronoUnit.DAYS.between(bDay, today);

            System.out.printf("Du har levt i %d dagar!", daysAlive);

        } catch (Exception e) {
            System.err.println("Ops" + e);
        }

    }
}
