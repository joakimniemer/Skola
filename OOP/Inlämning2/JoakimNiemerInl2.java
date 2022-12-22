import java.util.Scanner;

public class JoakimNiemerInl2 {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in); // Scanner to receive input value from user

        System.out.println("Skriv in ett positivt heltal:");
        int inputValue = scan.nextInt();
        int oddNumbersTotal = 0;
        int evenNumbersTotal = 0;

        for (int i = 1; i <= inputValue; i++) {
            if (i % 2 == 0) {
                evenNumbersTotal = evenNumbersTotal + i;

            } else {
                oddNumbersTotal = oddNumbersTotal + i;
            }
        }

        System.out.printf("Summan av udda tal: %d\nSumman av jämna tal: %d\n", oddNumbersTotal, evenNumbersTotal);

        scan.close();

    }
}