import java.util.Scanner;

public class OvningEtt {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        int[] numberArray = new int[10];
        
        for (int i = 0; i < numberArray.length; i++){
            System.out.println("Skriv in ett heltal");
            numberArray[i] = scan.nextInt();
        }
        System.out.println(arrayTest(numberArray));
        
    }

    public static int arrayTest(int[] input) {
        int result = 0;
        for (int value : input) {
            result += value;
        }
        return result;
    }

}
