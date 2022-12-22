import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.TimeUnit;

public class OvningEtt {

    public static void main(String[] args) throws InterruptedException {

        ExecutorService es = Executors.newFixedThreadPool(3);

        for (int i = 1; i <= 5; i++) {
            createJob(i, es);
        }

        es.shutdown();
        es.awaitTermination(1, TimeUnit.MINUTES);
    }

    private static void createJob(int i, ExecutorService es) {
        es.submit(() -> {
            for (int j = 0; j < 50; j++) {

                System.out.print("j" + i);

            }
        });
    }
}