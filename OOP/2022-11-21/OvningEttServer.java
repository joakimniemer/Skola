import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.net.ServerSocket;
import java.net.Socket;

public class OvningEttServer {
    public static void main(String[] args) throws IOException {

        try (ServerSocket server = new ServerSocket(12345);
                Socket connectionToClient = server.accept();
                DataInputStream dis = new DataInputStream(connectionToClient.getInputStream());
                BufferedReader reader = new BufferedReader(new InputStreamReader(dis));
                DataOutputStream dos = new DataOutputStream(connectionToClient.getOutputStream());
                BufferedWriter writer = new BufferedWriter(new OutputStreamWriter(dos))) {

            int answer = reader.read();
            System.out.println("Input int: " + answer);
            answer = answer + 1;
            writer.write(answer);
            writer.flush();

        } catch (Exception e) {
            System.err.println("Ops" + e);
        }

    }
}