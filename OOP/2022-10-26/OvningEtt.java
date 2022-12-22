import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;
import java.util.concurrent.ThreadLocalRandom;

public class OvningEtt {
    public static void main(String[] args) {

        Set<String> person = new HashSet<>();
        person.add("Joakim");
        person.add("Daniel");
        person.add("Mikael");
        person.add("Rasmus");
        person.add("David");

        int random = ThreadLocalRandom.current().nextInt(person.size());

        Iterator<String> it = person.iterator();

        for (int i = 0; i < random; i++) {
            it.next();
        }

        String winner = it.next();
        System.out.println("Vinnaren är: " + winner);

    }
}