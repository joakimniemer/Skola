import java.io.BufferedReader;
import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.TimeUnit;

public class QServer {

    // Starta upp och lyssna på port 7788
    // Ta emot en anslutning och skicka den till en egen tråd

    // I respektive tråd:
    // Skicka en fråga
    // Ta emot ett svar
    // Kontrollera korrekthet
    // Skicka tillbaka om det var rätt
    //
    // Om användare svarar "quit" avslutar vi
    //

    public static void main(String[] args) throws InterruptedException {
        ExecutorService es = Executors.newCachedThreadPool();
        
        try (ServerSocket ss = new ServerSocket(7788)) {
            Map<String, String> questions = readQuestions();
            
            Socket client = ss.accept();

            es.execute(new QSender(client, questions));

        } catch (IOException ex) {
            System.err.println("Ops");
        } finally {
            es.shutdown();
            es.awaitTermination(2,TimeUnit.SECONDS);
        }

    }

    private static Map<String, String> readQuestions() throws IOException{
        Map<String, String> questions = new HashMap<>();

        try (BufferedReader reader = Files.newBufferedReader(Path.of("questions.txt"))) {
          
            String line;
            while ((line = reader.readLine()) != null) {
                String[] splitLine = line.split("#");
                
                if (splitLine.length != 2) {
                    throw new RuntimeException("Unexpected input on line");
                }

            }
        } 

        return Collections.unmodifiableMap(questions);

    }

}