import java.io.BufferedReader;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.ArrayList;
import java.util.List;
import java.util.SortedMap;
import java.util.TreeMap;

public class Exercise2 {
    public static void main(String[] args) {

        Path file = Path.of("text.txt");

        try (BufferedReader reader = Files.newBufferedReader(file)) {
            var listOfLines = new ArrayList<String>();

            String line;
            while ((line = reader.readLine()) != null) {
                listOfLines.add(line);
            }

            var mapWithAuthorAndBooks = addBooksToAuthor(listOfLines);

            for (var entry : mapWithAuthorAndBooks.entrySet()) {
                System.out.println(entry.getKey() + ": " + entry.getValue());
            }
            System.out.println("----------");
            for (var entry2 : mapWithAuthorAndBooks.entrySet()) {
                String authors = entry2.getKey();
                List<String> books = entry2.getValue();

                books.sort(null);

                System.out.printf("%s: %s%n", authors, String.join(", ", books));
            }

        } catch (IOException e) {
            System.err.println("Ops" + e);
        }

    }

    private static SortedMap<String, List<String>> addBooksToAuthor(List<String> listOfLines) {
        SortedMap<String, List<String>> authorAndBooks = new TreeMap<>();

        for (int i = 0; i < listOfLines.size(); i++) {

            String[] split = listOfLines.get(i).split(":");
            String author = split[0];
            String book = split[1];

            List<String> books = authorAndBooks.get(author);
            if (books == null) {
                books = new ArrayList<>();
                authorAndBooks.put(author, books);
            }

            books.add(book);
        }
        return authorAndBooks;
    }

}
