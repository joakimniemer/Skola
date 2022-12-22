import java.io.DataInputStream;
import java.io.FileInputStream;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.ServerSocket;
import java.net.Socket;
import java.nio.file.Files;

public class OvningTreServer {
    public static void main(String[] args) {

        try (ServerSocket server = new ServerSocket(1234);
                Socket connectionToClient = server.accept();
                InputStream is = connectionToClient.getInputStream()) {






        } catch (Exception e) {
            System.out.println("Ops" + e);
        }

    }
}
