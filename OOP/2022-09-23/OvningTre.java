import java.util.Scanner;

public class OvningTre {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        System.out.println("Vad vill du äta? \n1.Förrätt\n2.Varmrätt\n3.Fika");
        int answer = scan.nextInt();

        switch (answer) {
            case 1:
                System.out.println("Soppa");
                break;
            case 2:
                System.out.println("Korv med bröd");
                break;
            case 3:
                System.out.println("Bulla");
                break;
            default:
                System.out.println("Detta är inte ett alternativ");

        }
    }
}
