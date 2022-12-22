import java.util.Comparator;

public class BirthYearComparator implements Comparator<Person> {

    @Override
    public int compare(Person p1, Person p2) {
        String bYear1 = p1.getBirthYear();
        String bYear2 = p2.getBirthYear();

        return bYear1.compareTo(bYear2);
    }

}
