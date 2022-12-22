import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

public class Exercise1 {
    public static void main(String[] args) {

        List<String> firstName = new ArrayList<>();
        firstName.add("Joakim");
        firstName.add("Daniel");
        firstName.add("Jessica");
        firstName.add("Hugo");
        firstName.add("Hampus");

        List<String> lastName = List.of("Andersson", "Johansson", "Pettersson", "Svensson", "Gustavsson");

        List<Person> fullName = Person.generateAllCombinations(firstName, lastName);

        for (Person name : fullName) {
            System.out.println(name);
        }
    }
}
