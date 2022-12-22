import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.HashMap;
import java.util.concurrent.ThreadLocalRandom;

import javax.management.openmbean.SimpleType;

@SuppressWarnings({"java:S106"})
public class OvningFyra {

    private static int getNumberOfLines(String filename) {
        Path path = Path.of(filename);
        int count = 0;

        try (BufferedReader reader = Files.newBufferedReader(path)) {

            String line;
            while ((line = reader.readLine()) != null) {
                count++;
            }

        } catch (Exception e) {
            System.err.println("ops" + e);
        }
        return count;
    }

    private static void createData(Path file) throws IOException {
        int lines = ThreadLocalRandom.current().nextInt(50) + 10000;
        try (BufferedWriter writer = new BufferedWriter(new FileWriter(file.toFile()))) {
            for (int i = 0; i < lines; ++i) {
                writer.append("hej\r\nhopp\r\n");
            }
        }
    }

    public static void main(String[] args) throws IOException {
        Path[] tempFiles = new Path[3];
        var map = new HashMap<String, Integer>();

        for (int i = 0; i < tempFiles.length; ++i) {
            tempFiles[i] = Files.createTempFile("temp", ".txt");
            tempFiles[i].toFile().deleteOnExit();

            createData(tempFiles[i]);
            map.put(tempFiles[i].toString(), getNumberOfLines(tempFiles[i].toString()));
        }

        System.out.println("Done creating data.");
        for (int i = 0; i < 1000; ++i) {
            String filename = tempFiles[i % 3].toString();
            int oldCount = map.get(filename);
            System.out.println(oldCount); //Test med denna gav mycket snabbare resultat.
            if (oldCount != map.get(filename)) {
                System.out.println("Oops, something went wrong!");
                System.exit(-1);
            }
        }
        System.out.println("Done!");
    }

}
