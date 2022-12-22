import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.net.Socket;
import java.net.UnknownHostException;
import java.util.Scanner;

public class QClient {

    // Anslut till server, port 7788
    // Ta emot en fråga
    // Läsa in ett svar från användaren
    // Skicka svaret till servern
    // Ta emot om det är rätt eller fel
    // Visa det för användaren

    public static void main(String[] args) throws UnknownHostException, IOException {

        try (Scanner scan = new Scanner(System.in);
                Socket socket = new Socket("localhost", 7788);
                BufferedReader input = new BufferedReader(new InputStreamReader(socket.getInputStream()));
                BufferedWriter output = new BufferedWriter(new OutputStreamWriter(socket.getOutputStream()))) {


            String q = input.readLine();
            System.out.println(q);

            handleAnswer(scan, output);

            String isCorrectString = input.readLine();
            Boolean isCorrect = Boolean.valueOf(isCorrectString);

            if (isCorrect){
                System.out.println("Du hade rätt!");
            } else {
                System.out.println("Du hade fel.");
            }

        } catch (Exception e) {
            e.getStackTrace();
        }

    }

    private static void handleAnswer(Scanner scan, BufferedWriter output) throws IOException {
        String answer = scan.nextLine();
        output.write(answer);
        output.write("\n");
        output.flush();
    }
}
