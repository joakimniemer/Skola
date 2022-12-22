import java.io.BufferedWriter;
import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.StandardOpenOption;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class u1 {
    public static void main(String[] args) {

        // 2 fil namn som argument
        // De första skall vara en befintlig text fil
        // Den andra skall inte finnas

        // Räkna antalet unika ord i den givna textfilen (ord som bara förekommer en
        // gång)
        // Skriv till fil nummer två som inte finns (argument 2)
        // tillsammans med information om absolut sökväg till infilen
        // datum och tid samt totalt antal ord.

        // Hantera undantag på bra sätt.

        if (args.length != 2) {
            System.out.println("Skicka in två filnamn.");
            System.exit(-1);
        }

        if (!Files.exists(Path.of(args[0]))) {
            System.out.println("Filen finns inte.");
            System.exit(-1);
        }

        if (Files.exists(Path.of(args[1]))) {
            System.out.println("Filen finns redan");
            System.exit(-1);
        }

        Path inFile = Path.of(args[0]);
        Path outFile = Path.of(args[1]);

        try {

            String text = Files.readString(inFile);

            int uniqueWords = countUniqWords(text);

            var list = combineOutData(uniqueWords, inFile, text);

            list.stream().forEach(System.out::println);

            Files.write(outFile, list, StandardCharsets.UTF_8, StandardOpenOption.CREATE);
            // Files.write funkar om jag har en Iterabel, tex en lista.

        } catch (Exception e) {
            System.out.println("Ett fel uppstod.");
            e.printStackTrace();
        }

    }

    private static List<String> combineOutData(int uniqueWords, Path inFile, String text) throws IOException {
        LocalDateTime ldt = LocalDateTime.now();
        int totaltWords = countTotalWords(text);
        var list = new ArrayList<String>();
        list.add("Filename: " + inFile.toAbsolutePath());
        list.add("Date: " + ldt.format(DateTimeFormatter.ISO_DATE_TIME));
        list.add("Words processed: " + totaltWords);
        list.add("Total unique words: " + uniqueWords);

        return list;
    }

    private static int countTotalWords(String text) {
        var words = text.split("\\W");

        return words.length;
    }

    private static int countUniqWords(String text) {

        int uniqWords = 0;
        var mapCounter = new HashMap<String, Integer>();
        var words = text.split("\\W");

        for (String string : words) {
            // mapCounter.put(string, mapCounter.getOrDefault(string.toLowerCase().trim(),
            // 0) + 1);
            // Kolla mer på hur
            // getOrDefault fungerar!!

            // int value = map.getOrDefault(string, 0);
            // map.put(word, value+1);

            mapCounter.merge(string.trim().toLowerCase(), 1, Integer::sum);

        }

        for (var map : mapCounter.values()) {
            if (map == 1) {
                uniqWords++;
            }
        }

        // Borde retunera string med både total och unik antal ord.

        return uniqWords;
    }
}
