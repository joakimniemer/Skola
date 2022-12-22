import java.util.Comparator;

public class CompComparator implements Comparator<Computer> {

    @Override
    public int compare(Computer o1, Computer o2) {
        return o2.gethDrive() - o1.gethDrive();
    }

}
