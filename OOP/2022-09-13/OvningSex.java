import java.util.Scanner;

public class OvningSex {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        System.out.println("Skriv in ett heltal.");
        int answerOne = scan.nextInt();

        System.out.println("Skriv in ett heltal till.");
        int answerTwo = scan.nextInt();

        System.out.println("Vad vill du veta mer om talen (min/max)?");
        String minOrMax = scan.next();

        switch (minOrMax.toLowerCase()) {
            case "min":
                if (answerOne < answerTwo) {
                    System.out.printf("%d är de minsta talet", answerOne);
                } else {
                    System.out.printf("%d är de minsta talet\n", answerTwo);
                }
                break;
            case "max":
                if (answerOne > answerTwo) {
                    System.out.printf("%d är de största talet\n", answerOne);
                } else {
                    System.out.printf("%d är de största talet\n", answerTwo);
                }
                break;
            default:
                System.out.println("Nu förstår jag inte\n");
        }

        scan.close();
    }
}
