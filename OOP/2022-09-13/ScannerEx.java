import java.util.Scanner;

public class ScannerEx {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Vad heter du?");
        String name = scanner.nextLine();

        System.out.println("Hur gammal är du?");
        int age = scanner.nextInt();

        System.out.printf("Hej %s, du är %d år gammal.", name, age);  // d står för decimal och är ett int värde. // s står för string?
   

        scanner.close();
   
   
    }
}