import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.io.OutputStreamWriter;
import java.net.Socket;
import java.util.concurrent.ThreadLocalRandom;

public class OvningEttClient {
    public static void main(String[] args) {

        try (Socket socket = new Socket("localhost", 12345);
                DataInputStream dis = new DataInputStream(socket.getInputStream());
                DataOutputStream dos = new DataOutputStream(socket.getOutputStream());
                BufferedReader reader = new BufferedReader(new InputStreamReader(dis));
                BufferedWriter writer = new BufferedWriter(new OutputStreamWriter(dos))) {

            int randomNumber = ThreadLocalRandom.current().nextInt(10) + 1;
            writer.write(randomNumber);
            writer.flush();

            int answer = reader.read();

            System.out.println("Skickat: " + randomNumber + "   Mottaget: " + answer);
            if (randomNumber < answer) {
                System.out.println("Returen är större");
            } else {
                System.out.println("Fel, returen är mindre.");
            }

        } catch (Exception e) {
            System.err.println("Ops" + e);
        }

    }
}
