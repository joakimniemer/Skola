import java.io.BufferedWriter;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Path;

public class Ovning5 {
    public static void main(String[] args) {
        
        String text = "\u2661\u2665\u2661";



        try (BufferedWriter w = Files.newBufferedWriter(Path.of("ut.txt"), StandardCharsets.UTF_8)) {

            w.write(text);


        } catch (Exception e) {
            // TODO: handle exception
        }


    }
}
