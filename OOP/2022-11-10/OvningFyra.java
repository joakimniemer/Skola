import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.Period;
import java.time.temporal.ChronoUnit;

public class OvningFyra {
    public static void main(String[] args) {

        LocalDate today = LocalDate.now();
        LocalDate newYear = LocalDate.of(today.getYear(), 12, 31);
    
        long daysToNewYear = ChronoUnit.DAYS.between(today, newYear);

        System.out.println(daysToNewYear);

    }
}
