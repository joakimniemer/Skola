import java.io.BufferedReader;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.Arrays;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.TimeUnit;

public class Ex3 {
    public static void main(String[] args) throws InterruptedException {

        // Borde nog ha en CatchedThreadPool?
        // ExecutorService es = Executors.newFixedThreadPool(args.length);
        ExecutorService es = Executors.newCachedThreadPool();
        var files = Arrays.asList(args);

        for (String string : files) {
            readFiles(string, es);
        }
        es.shutdown();
        es.awaitTermination(5, TimeUnit.SECONDS);

    }

    private static void readFiles(String fileName, ExecutorService es) {

        es.submit(() -> {
            try (BufferedReader reader = Files.newBufferedReader(Path.of(fileName))) {
                int aCounter = 0;
                String file;
                while ((file = reader.readLine()) != null) {

                    for (char c : file.toLowerCase().toCharArray()) {
                        if (c == 'a') {
                            aCounter++;
                        }
                    }
                }
                System.out.println(fileName + ": " + aCounter + " st A");
            } catch (Exception e) {
                System.err.println("Ops");
            }
        });
    }

}
