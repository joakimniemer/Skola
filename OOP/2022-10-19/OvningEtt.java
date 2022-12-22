import java.util.ArrayList;
import java.util.List;

public class OvningEtt {

    public static int evenSum(List<Integer> numbers) {
        int sum = 0;

        for (int num : numbers) {
            if (num % 2 == 0) {
                sum += num;
            }
        }
        return sum;
    }

    public static void main(String[] args) {

        List<Integer> intList = new ArrayList<>();
        intList.add(2);
        intList.add(3);
        intList.add(4);
        intList.add(5);
        intList.add(6);

        System.out.println(evenSum(intList));
    }
}
