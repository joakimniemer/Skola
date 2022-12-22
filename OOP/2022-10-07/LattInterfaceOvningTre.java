import java.util.Scanner;

public class LattInterfaceOvningTre {
    public static void main(String[] args) {
        Operation[] ops = { new MinimumValue(), new MaximumValue(), new MedianValue(), new SumValue() };
        Scanner scan = new Scanner(System.in);

        System.out.println("Vi spelar nu min max uträknaren.");
        int[] values = new int[3];
        for (int i = 0; i < values.length; i++) {
            System.out.print("Skriv in ett tal: ");
            values[i] = scan.nextInt();
            scan.nextLine();
        }

        String answer;
        do {
            System.out.println("Vad vill du räkna ut? (skriv \"stop\" för att avsluta).");
            for (Operation choice : ops) {
                System.out.println(choice.getName());
            }

            answer = scan.nextLine();

            for (Operation choice : ops) {
                if (choice.getName().equals(answer)) {
                    System.out.println(choice.getName() + ": " + choice.operation(values));
                }
            }
        } while (!answer.equals("stop"));
    }
}