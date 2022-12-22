import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class OvningFem {
    public static void main(String[] args) {

        List<Person> person = new ArrayList<>();
        person.add(new Person("Joakim", "Niemer", "1992"));
        person.add(new Person("Joakim", "Niemer", "1990"));
        person.add(new Person("Roffe", "Gustavsson", "1888"));


        //Jämför bara för och efternamn och därför är index 0 och 1 samma;
        System.out.println(person.get(0).equals(person.get(1)));

        //Jämför hashCode, styr även här vad jag vill skall jämföras genom att ändra i metoden, blir false eftersom det inte är samma birthyear
        System.out.println(person.get(0).hashCode() == person.get(1).hashCode());

    }
}
