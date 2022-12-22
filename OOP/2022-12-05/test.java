import java.time.Instant;
import java.time.LocalDateTime;

public class test {
    public static void main(String[] args) {
        

        LocalDateTime l = LocalDateTime.now();
        String send = String.format("%d:%d:%d", l.getHour(), l.getMinute(), l.getSecond());

        System.out.println(send);


    }
}
