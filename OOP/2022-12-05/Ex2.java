import java.time.Duration;
import java.time.LocalDate;
import java.time.Period;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;

public class Ex2 {
    public static void main(String[] args) {

        try (Scanner scan = new Scanner(System.in)) {

            DateTimeFormatter df = DateTimeFormatter.ofPattern("yyyy-dd-MM");
            System.out.println("Vilket datum är du född? yyyy-dd-mm");

            String answer = scan.nextLine();

            LocalDate bDay = LocalDate.parse(answer, df);
            LocalDate today = LocalDate.now();
            Period p = Period.between(bDay, today);

            System.out.println("Du är " + p.getYears() + " år gammla.");
            if (bDay.isLeapYear()) {
                System.out.println("Du är född på ett skottår.");
            }

        } catch (Exception e) {

            System.err.println("asdasd" + e.getStackTrace());
        }

    }
}
