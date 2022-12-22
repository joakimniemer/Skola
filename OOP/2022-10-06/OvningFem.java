import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class OvningFem {
    public static void main(String[] args) {

        System.out.println(fibNumbers());

    }

    public static List<Integer> fibNumbers() {
        List<Integer> fibList = new ArrayList<>();
        Scanner scan = new Scanner(System.in);
        System.out.print("Hur många fib-tal vill du skriva ut? ");
        int numberOfFibs = scan.nextInt();

        int previusFib = 0;
        int secondPreviusFib = 0;

        for (int i = 0; i < numberOfFibs; i++) {
            if (previusFib == 0) {
                fibList.add(1);
                previusFib = 1;
            } else if (secondPreviusFib == 0) {
                fibList.add(1);
                secondPreviusFib = 1;
            } else {
                fibList.add(previusFib + secondPreviusFib);
                previusFib = previusFib + secondPreviusFib;
                secondPreviusFib = previusFib - secondPreviusFib;

            }

        }
        Collections.reverse(fibList);

        return fibList;
    }
}
