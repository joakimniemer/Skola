import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class OvningFyra {
    public static void main(String[] args) {

        Pair p = new Pair<String>("String", "hej");
        Pair<Integer> p2 = new Pair<Integer>(2, 3);
        Pair<Integer> p3 = new Pair<Integer>(55, 15);
        Pair<String> p4 = new Pair<String>("String", "hej");

        System.out.printf("%s %s%n", p.getValue1(), p.getValue2());

        System.out.printf("%d %d%n", p2.getValue1(), p2.getValue2());

        System.out.println(p2.equals(p3));

        System.out.println(p.equals(p2));

        System.out.println(p.equals(p));

        System.out.println("HashCode");
        System.out.println(p2.hashCode() == p3.hashCode());
        System.out.println(p.hashCode() == p4.hashCode());

        System.out.println("compare");
        System.out.println(p.compareTo(p4));
        System.out.println(p2.compareTo(p3));

        System.out.println(p.compareTo(p4));
        System.out.println(p2.compareTo(p3));

        var list = new ArrayList<Pair<Integer>>();
        list.add(new Pair<Integer>(2, 5));
        list.add(new Pair<Integer>(10, -20));
        list.add(new Pair<Integer>(1, -20));
        list.add(new Pair<Integer>(-5, 3));

        var list2 = new ArrayList<Pair<Integer>>();
        list2.add(new Pair<Integer>(2, 5));
        list2.add(new Pair<Integer>(10, -20));
        list2.add(new Pair<Integer>(1, -20));
        list2.add(new Pair<Integer>(-5, 3));
        list2.add(new Pair<Integer>(-5, 3));

        var list3 = new ArrayList<Pair<String>>();
        list3.add(new Pair<String>("hej", "hej"));
        list3.add(new Pair<String>("hej", "hej"));
        

        for (Pair<Integer> i : list) {
            System.out.println(i);
        }

        Collections.sort(list);
        System.out.println("");

        for (Pair<Integer> i : list) {
            System.out.println(i);
        }

        System.out.println(returnIfOddAmountOfObjects(list));
        System.out.println(returnIfOddAmountOfObjects(list2));
        System.out.println(returnIfOddAmountOfObjects(list3));

    }

    private static <t> boolean returnIfOddAmountOfObjects(List<t> list) {
        if (list.size() % 2 == 0) {
            return true;
        }
        return false;
    }
}
