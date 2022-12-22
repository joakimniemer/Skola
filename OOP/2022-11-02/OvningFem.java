import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.stream.Collector;
import java.util.stream.Collectors;

public class OvningFem {
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
        list2.add(new Pair<Integer>(-5, 4));

        var list5 = new ArrayList<Pair<Integer>>();
        list5.add(new Pair<Integer>(-5, 3));
        list5.add(new Pair<Integer>(1, -20));
        list5.add(new Pair<Integer>(2, 5));
        list5.add(new Pair<Integer>(2, 5));
        list5.add(new Pair<Integer>(10, -20));

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

        System.out.println("");
        System.out.println("");

        System.out.println(objectsIsUnique(list));
        System.out.println(objectsIsUnique(list2));
        System.out.println(objectsIsUnique(list3));

        System.out.println("");
        System.out.println("");

        System.out.println(trueIfComparedTo(1, 3, 2));
        System.out.println(trueIfComparedTo(1, 1, 1));
        System.out.println(trueIfComparedTo("null", "null", "null"));
        System.out.println(trueIfComparedTo("hej", "heej", "asd"));

        System.out.println("");
        System.out.println("");

        System.out.println(isSorted(list2));
        System.out.println(isSorted(list5));

    }

    private static <t> boolean returnIfOddAmountOfObjects(List<t> list) {
        if (list.size() % 2 == 0) {
            return true;
        }
        return false;
    }

    private static <t> boolean objectsIsUnique(List<t> list) {
        Set<t> compList = new HashSet<>();
        for (t l : list) {
            compList.add(l);
        }
        if (compList.size() == list.size()) {
            return true;
        }
        return false;
    }

    private static <t extends Comparable<t>> boolean trueIfComparedTo(t one, t two, t three) {
        if (one.compareTo(two) == 0 && two.compareTo(three) == 0) {
            return true;
        }
        return false;
    }

    private static <t extends Comparable<t>> boolean isSorted(List<t> list) {
        List<t> sortedList = list.stream().sorted().collect(Collectors.toList());

        for (int i = 0; i < list.size(); i++) {
            if (list.get(i).compareTo(sortedList.get(i)) != 0) {
                return false;
            }
        }
        return true;
    }
}
