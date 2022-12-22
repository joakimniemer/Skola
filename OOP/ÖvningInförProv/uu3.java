import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class uu3 {
    public static void main(String[] args) {

        List<Computer2> computers = new ArrayList<>();

        Computer2 c1 = new Computer2(2.6, 16_000, 1000_000);
        Computer2 c2 = new Computer2(2.2, 32_000, 1500_000);
        Computer2 c3 = new Computer2(2.4, 64_000, 1200_000);
        Computer2 c4 = new Computer2(2.2, 64_000, 1100_000);

        computers.add(c1);
        computers.add(c2);
        computers.add(c3);
        computers.add(c4);

        Collections.sort(computers);

        System.out.println(computers);

        Collections.reverse(computers);

        System.out.println(computers);

        CompComparator2 c = new CompComparator2();

        Collections.sort(computers, c);

        System.out.println(computers);

    }
}
