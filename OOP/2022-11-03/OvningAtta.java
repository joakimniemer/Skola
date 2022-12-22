import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class OvningAtta {

    public static void main(String[] args) {

        try {

            Path path = Path.of(args[0]);
            List<Path> javaFiles = getAllFilesNames(path);

            javaFiles.stream().filter(s -> s.toString().endsWith("java")).forEach(System.out::println);


        } catch (IOException ex) {
            System.err.println(ex);
        }

    }

    public static List<Path> getAllFilesNames(Path path) throws IOException {
        List<Path> list = new ArrayList<>();

        try (var walk = Files.walk(path)) {
            list = walk.filter(Files::isRegularFile).collect(Collectors.toList());
        }

        return list;
    }
}