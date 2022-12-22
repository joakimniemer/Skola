import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class OvningTva {
    public static void main(String[] args) {

        List<Person> person = new ArrayList<>();
        person.add(new Person("Joakim", "Niemer", "1992"));
        person.add(new Person("Bosse", "Bredsladd", "1908"));
        person.add(new Person("Roffe", "Gustavsson", "1888"));

        //ingen sortering
        for (Person p : person) {
            System.out.println(p);
        }

        //sortera efter efternamn
        Collections.sort(person);
        System.out.println("");

        for (Person p : person) {
            System.out.println(p);
        }

        //sortera efter födelseår.
        System.out.println("");
        BirthYearComparator compB = new BirthYearComparator();
        Collections.sort(person, compB);

        for (Person p : person) {
            System.out.println(p);
        }


        //Övning tre. sorta på födelseår genom att använda en statisk metod av Compatator
        System.out.println("");
        Comparator<Person> comp3 = Comparator.comparing(Person::getBirthYear,
        Comparator.naturalOrder());

        Collections.sort(person, comp3);

        for (Person p : person) {
            System.out.println(p);
        }

    }
}
