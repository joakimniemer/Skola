import java.util.Scanner;

public class testOnvingTre {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        Integer i, j;
        do {
            System.out.println("Skriv in två tal som är olika:");
            i = scan.nextInt();
            j = scan.nextInt();
        } while (i == j);


        System.out.println("");
        System.out.println(i);
        System.out.println(j);

    }
}
