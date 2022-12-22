import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;

public class OvningTre {
    public static void main(String[] args) throws IOException {

        
        
        Path fileIn = Path.of(args[0]);
        Path fileOut = Path.of(args[0] + ".new.txt");

        long size = Files.size(fileIn);

        if (Files.size(fileOut) > 1000000){
            System.out.printf("Filen är för stor: %d", size);
            System.exit(-1);
        }

        try (BufferedReader reader = Files.newBufferedReader(fileIn);
                BufferedWriter writer = Files.newBufferedWriter(fileOut)) {

            StringBuilder builder = new StringBuilder();

            String line;
            while ((line = reader.readLine()) != null) {
                builder.append(line + "\n");
                
            }

            writer.write(builder.reverse().toString());

        } catch (IOException ex) {
            System.out.println(ex);
        }
    }
}
