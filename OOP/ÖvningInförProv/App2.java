import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class App2 {
    public static void main(String[] args) {

        List<Computer> list = new ArrayList<>();

        Computer c1 = new Computer("dator1", 2.3, 16_000, 500_000);
        Computer c2 = new Computer("dator2", 2.3, 32_000, 1500_000);
        Computer c3 = new Computer("dator3", 3.2, 64_000, 1000_000);

        list.add(c1);
        list.add(c2);
        list.add(c3);

        for (Computer computer : list) {
            System.out.println(computer);

        }

        System.out.println("------------");

        Collections.reverse(list);

        for (Computer computer : list) {
            System.out.println(computer);

        }

        System.out.println("-----------");

        CompComparator c = new CompComparator();

        Collections.sort(list, c);

        for (Computer computer : list) {
            System.out.println(computer);
        }
    }
}
