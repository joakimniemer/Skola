import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class OvningSex {
    public static void main(String[] args) {

        List<Person> person = new ArrayList<>();
        person.add(new Person("Joakim", "Niemer", "1992"));
        person.add(new Person("Joakim", "Niemer", "1990"));
        person.add(new Person("Roffe", "Gustavsson", "1888"));

        //kopierar första instansen av person.
        Person copy = new Person(person.get(0));
        
        System.out.println(copy);

        //testar om det är olika objekt, kollar vilket objekt den pekar på.
        System.out.println(person.get(0) == copy);

        //använder man istället .equals så kollar det bara värdena i objektet
        System.out.println(person.get(0).equals(copy));

    }
}
