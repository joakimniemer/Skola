import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.Socket;
import java.net.UnknownHostException;

@SuppressWarnings({ "java:S2189" })
public class Ex3Client {
    public static void main(String[] args) throws UnknownHostException, IOException {

        try (Socket socket = new Socket("localhost", 9955);
                BufferedReader input = new BufferedReader(new InputStreamReader(socket.getInputStream()))) {

            while (true) {
                if (input.readLine().equals("terminated")){
                    break;
                }
                String time = input.readLine();
                System.out.println(time);
            }

        } catch (Exception e) {
            e.printStackTrace();
        }
        System.out.println("Server shutdown.");

    }
}
