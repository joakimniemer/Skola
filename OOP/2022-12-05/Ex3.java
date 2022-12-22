import java.io.BufferedWriter;
import java.io.IOException;
import java.io.OutputStreamWriter;
import java.net.ServerSocket;
import java.net.Socket;
import java.time.LocalDateTime;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.TimeUnit;

@SuppressWarnings({ "java:S2189" })
public class Ex3 {

    public static void main(String[] args) throws IOException {
        ExecutorService es = Executors.newCachedThreadPool();
        termination(es);

        System.out.println("Start server");

        try (ServerSocket ss = new ServerSocket(9955)) {

            while (!Thread.currentThread().isInterrupted()) {

                final Socket client = ss.accept();
                System.out.println("Accepted new client.");

                es.submit(() -> {
                    try {
                        writer(client);
                    } catch (Exception e) {
                        System.err.println(e.getMessage());
                    }
                });
            }
            es.shutdown();
            es.awaitTermination(5, TimeUnit.SECONDS);

        } catch (Exception e) {
            System.err.println("Ops " + e);
        }

    }

    private static void writer(Socket client) throws IOException, InterruptedException {

        try (BufferedWriter output = new BufferedWriter(new OutputStreamWriter(client.getOutputStream()))) {

            while (!Thread.currentThread().isInterrupted()) {

                Thread.sleep(1000);
                LocalDateTime l = LocalDateTime.now();
                String send = String.format("%d:%d:%d", l.getHour(), l.getMinute(), l.getSecond());
                output.write(send);
                output.write("\n");
                output.flush();
            }
            output.write("terminated\n");
            output.flush();
            System.out.println("Terminating client...");

        }
    }

    private static void termination(ExecutorService es) {
        Runtime.getRuntime().addShutdownHook(new Thread(() -> {
            try {
                es.shutdownNow();
                es.awaitTermination(3, TimeUnit.SECONDS);
            } catch (Exception e) {
            }
        }));

    }

}