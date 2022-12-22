import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.net.Socket;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Map;

public class QSender implements Runnable {
    private Socket client;
    private List<Map.Entry<String, String>> questions;
    private BufferedReader input;
    private BufferedWriter output;

    public QSender(Socket client, Map<String, String> questions) throws IOException {
        this.client = client;
        this.input = new BufferedReader(new InputStreamReader(client.getInputStream()));
        this.output = new BufferedWriter(new OutputStreamWriter(client.getOutputStream()));
        this.questions = new ArrayList<>();
        for (Map.Entry<String, String> entry : questions.entrySet()) {
            this.questions.add(entry);
        }
        Collections.shuffle(this.questions);
    }

    // I respektive tråd:
    // Skicka en fråga
    // Ta emot ett svar
    // Kontrollera korrekthet
    // Skicka tillbaka om det var rätt
    //

    @Override
    public void run() {

        try {

            var q = nextQuestion();
            output.write(q.getKey());
            output.write("\n");
            output.flush();

            String answer = input.readLine();
            answer = answer.trim().toLowerCase();

            String correctAnswer = q.getValue().trim().toLowerCase();
            output.write(Boolean.toString(q.equals(correctAnswer)));

        } catch (IOException e) {

            e.printStackTrace();
            
        } finally {
            try {

                client.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }

    }

    private Map.Entry<String, String> nextQuestion() {
        if (questions.isEmpty()) {
            return null;
        }

        return questions.remove(questions.size() - 1);
    }

}
