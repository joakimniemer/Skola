import java.util.Scanner;

public class OvningEtt {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        System.out.print("Hur många prim tal skall skrivas ut?");
        int amountOfPrimes = scan.nextInt();
        int primCounter = 0;

        for (int i = 2; i <= 99; i++) {
            if (isPrime(i)) {
                System.out.println(i);
                primCounter++;
                if (primCounter == amountOfPrimes) {
                    break;
                }
            }

        }

    }

    /**
     * check if value is prim.
     * @param number input number to check if prim.
     * @return true if prim.
     */
    private static boolean isPrime(int number) {

        for (int i = 2; i <= number / 2; i++) {
            if (number % i == 0) {
                return false;
            }

        }
        return true;
    }

}