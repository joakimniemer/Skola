import java.time.Instant;
import java.time.LocalTime;

public class OvningSju {
    public static void main(String[] args) {

        // while (true) {
        LocalTime nu = LocalTime.now();

        int min = nu.getMinute();
        int sec = nu.getSecond();

        System.out.println(min);
        System.out.println(sec);

        int minsLeftCounter = 0;

        while (true) {

            if (min % 5 == 0) {
                break;

            }

            minsLeftCounter++;
            min++;
        }

        int msToSleep = (minsLeftCounter * 60 - sec) * 1000;

        System.out.println(msToSleep);

        try {

            Thread.sleep(msToSleep);
            LocalTime newtime = LocalTime.now();
            System.out.println("En ny 5 minutare: " + newtime);

        } catch (InterruptedException ex) {
            Thread.currentThread().interrupt();
        }

    }
}
