import java.util.concurrent.ThreadLocalRandom;
import java.util.stream.IntStream;

public class Exercise4 {

    public static void main(String[] args) {
        
        long time = System.nanoTime();

        randomStream().map(Exercise4::fib).filter(s -> s > 3000).limit(10).toArray();

        System.out.printf("map then filter took %d ns.%n", System.nanoTime() - time);

        time = System.nanoTime();

        randomStream().filter(s -> s > 18).map(Exercise4::fib).limit(10).toArray();

        System.out.printf("filter then map took %d ns.%n", System.nanoTime() - time);


    }

    private static int fib(int n) {
        if (n <= 1) {
            return n;
        }
        return fib(n - 1) + fib(n - 2);
    }

    private static IntStream randomStream() {
        return IntStream.generate(() -> ThreadLocalRandom.current().nextInt(20));
    }
}