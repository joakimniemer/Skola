
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.ThreadLocalRandom;

public class OvningTre {
    public static void main(String[] args) {

        //behöver nu bara byta ut arraylist mot hashset
        Collection<String> person = new ArrayList<>();
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