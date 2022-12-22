import java.time.Instant;
import java.time.LocalDate;

public class Ex1 {
    public static void main(String[] args) {
        


        LocalDate today = LocalDate.now();
        LocalDate inOneMonth = LocalDate.of(2023, 01, 5);
        LocalDate in30Days = LocalDate.now().plusDays(30);

        System.out.println("Today is: " + today.getDayOfWeek());
        
        System.out.println("In one month it will be: " + inOneMonth.getDayOfWeek());

        System.out.println("In 30 days it will be: " + in30Days.getDayOfWeek());

    }
}
