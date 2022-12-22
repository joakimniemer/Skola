
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class OvningFyra {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        /*
         * Lösning med lista
         */
        List<Integer> listTest = new ArrayList<>();

        while (true) {
            System.out.println("Lägg till ett tal i listen eller avsluta med 0 \"noll\":");
            int userInput = scan.nextInt();
            listTest.add(userInput);
            if (userInput == 0) {
                break;
            }
        }
        System.out.println("Totalen för alla värden blir: " + arrayTestTwo(listTest));
        

        /*
         * Lösning med array
         */
        System.out.println("Hur många tal vi du addera?");
        int[] numberArray = new int[scan.nextInt()];

        for (int i = 0; i < numberArray.length; i++) {
            System.out.println("Skriv in ett heltal att addera.");
            numberArray[i] = scan.nextInt();
        }
        System.out.println("Totalen för alla värden blir: " + arrayTest(numberArray));

    }
    //metod med array
    public static int arrayTest(int[] input) {
        int result = 0;
        for (int value : input) {
            result += value;
        }
        return result;
    }
    //metod med lista
    public static int arrayTestTwo(List<Integer> list) {
        int result = 0;
        for (int value : list) {
            result += value;
        }
        return result;
    }

}
