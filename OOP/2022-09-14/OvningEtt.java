import java.util.Scanner;

public class OvningEtt {
    public static void main(String[] args) {

       Scanner scan = new Scanner(System.in);

       System.out.println("Skriv in startvärde för fakulteten:");
       int valueOne = scan.nextInt();
       int fac = 1;

       for (int i = 1; i <= valueOne; i++){
            fac = fac * i;

       }
       System.out.printf("Fakulteten för %d är %d\n", valueOne, fac);

       scan.close();

    }
}

