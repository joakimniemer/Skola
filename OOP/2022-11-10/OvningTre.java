import java.time.Instant;
import java.time.LocalDate;
import java.time.LocalTime;
import java.time.ZoneId;
import java.time.ZonedDateTime;

public class OvningTre {
    public static void main(String[] args) {
        
        Instant today = Instant.now();

        ZonedDateTime gotTime = ZonedDateTime.now(ZoneId.of("Europe/Stockholm"));
        ZonedDateTime nyTime = ZonedDateTime.now(ZoneId.of("America/New_York"));


        System.out.println("UTC: " + today);
        System.out.println("Tid i Göteborg: " + gotTime.getHour()+":"+gotTime.getMinute());
        System.out.println("Tid i NewYork: " + nyTime.getHour()+":"+nyTime.getMinute());


    }
}
