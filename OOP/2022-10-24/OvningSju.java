import java.io.BufferedReader;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class OvningSju {
    public static void main(String[] args) {

        Path file = Path.of("text.txt");

        try (BufferedReader reader = Files.newBufferedReader(file)) {

            List<String> lista = new ArrayList<>();

            String line;
            while ((line = reader.readLine()) != null) {
                lista.add(line);
            }

            for (String s : lista){
                System.out.println(s);
            }


            //behöver dela upp datum och namn och spara ner som enskilda objekt.
            

            

            

        } catch (Exception e) {
            System.out.println(e);
        }
    }

    private static void splitDateAndName(String s) {
        
    }


    // private static Set<String> splitInToWords(String line) {
    //     Set<String> listOfWords = new HashSet<>();

    //     String[] rawWords = line.split("\\s");
    //     for (String word : rawWords) {
    //         if (word.length() > 5) {
    //             listOfWords.add(cleanWord(word));
    //         }
    //     }
    //     return listOfWords;
    // }
}
