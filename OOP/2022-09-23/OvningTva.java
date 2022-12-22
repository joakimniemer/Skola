import java.util.Scanner;

public class OvningTva {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Skriv in två siffror");

        int answerOne = scan.nextInt();
        int answerTwo = scan.nextInt();

        if (answerOne < answerTwo) {
            for (int i = answerOne +1; i < answerTwo; i++) {
                if ((i % 2) == 0) {
                    System.out.print(i + " ");
                }
            }
        } else if (answerTwo < answerOne) {
            for (int i = answerTwo + 1; i < answerOne; i++) {
                if ((i % 2) == 0) {
                    System.out.print(i + " ");
                }

            }
        }
    }
}