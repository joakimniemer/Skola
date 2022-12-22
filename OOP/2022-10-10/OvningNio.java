import java.util.ArrayList;
import java.util.List;

public class OvningNio {
    public static void main(String[] args) {

        MathUtils mu = new MathUtils();

        List<Integer> list = new ArrayList<>();
        list.add(123);
        list.add(333);

        System.out.println(mu.sumOfNumbers(list));

    }

}
