import java.util.List;

public final class MathUtils {

    public static int lowestNumber(List<Integer> list) {

        int lowestNumber = Integer.MAX_VALUE;
        for (int value : list) {
            if (value < lowestNumber && value > 0) {
                lowestNumber = value;
            }
        }
        return lowestNumber;
    }

    public static int sumOfNumbers(List<Integer> list){

        int sum = 0;
        for(int i = 0; i < list.size(); i++){
            for(int k = 0; k < list.size(); k++){
                System.out.println(k);
            }
        }

        return sum;
    }

}
