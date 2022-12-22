import java.util.Comparator;

public class CompComparator2 implements Comparator<Computer2> {

    @Override
    public int compare(Computer2 o, Computer2 o2) {
        return o2.gethDrive() - o.gethDrive();
    }

}
