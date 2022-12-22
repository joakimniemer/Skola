import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.io.OutputStreamWriter;
import java.net.Socket;

public class OvningTvaClient {
    public static void main(String[] args) {

        try (Socket socket = new Socket("aftonbladet.se", 80);
                InputStream is = socket.getInputStream();
                OutputStream os = socket.getOutputStream();
                BufferedReader reader = new BufferedReader(new InputStreamReader(is));
                BufferedWriter writer = new BufferedWriter(new OutputStreamWriter(os))) {

            writer.write("GET / HTTP/1.1\nHost: aftonbladet.se\nConnection: close\n\n");
            writer.flush();

           System.out.println(reader.readLine());

        } catch (Exception e) {
            System.out.println("Ops " + e);
        }

    }
}
