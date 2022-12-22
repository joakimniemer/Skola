import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

public class OvningEtt {
    public static void main(String[] args) {

        List<Person> person = new ArrayList<>();
        person.add(new Person("Joakim", "Niemer", "1992"));
        person.add(new Person("Bosse", "Bredsladd", "1908"));

        for (Person p : person) {
            System.out.println(p);
        }

        Collections.sort(person);
        System.out.println("");

        for (Person p : person) {
            System.out.println(p);
        }

    }
}
