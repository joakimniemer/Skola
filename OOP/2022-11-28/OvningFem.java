import java.util.Queue;
import java.util.concurrent.ConcurrentLinkedQueue;

public class OvningFem {

    private static final Queue<Integer> q = new ConcurrentLinkedQueue<>();

    public static void main(String[] args) throws InterruptedException {

        Thread producer = new Thread(OvningFem::primeProducer);
        Thread consumer = new Thread(OvningFem::primeConsumer);

        producer.start();
        consumer.start();

        producer.join();
        consumer.interrupt();
        consumer.join();

    }

    private static void primeProducer() {

        for (int i = 2; i < 10_000; i++) {
            if (isPrime(i)) {
                q.add(i);
            }
        }
    }

    private static void primeConsumer() {
        while (!Thread.currentThread().isInterrupted()) {
            Integer i = q.poll();
            if (i != null && containsEigth(i)) {
                System.out.println(i);
            }
        }

        while (true) {
            Integer i = q.poll();
            if (i == null) {
                break;
            } else if (containsEigth(i)) {
                System.out.println(i);
            }
        }

    }

    private static boolean containsEigth(Integer i) {
        // Funkar men inte lika bra?
        // return i.toString().indexOf("8") != -1;
        while (i != 0) {
            if (i % 10 == 8) {
                return true;
            }

            i = i / 10;
        }
        return false;
    }

    private static boolean isPrime(Integer num) {
        for (int i = 2; i <= num / 2; ++i) {
            if (num % i == 0) {
                return false;
            }
        }
        return true;
    }

}
