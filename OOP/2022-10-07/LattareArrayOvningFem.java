import java.util.Scanner;

public class LattareArrayOvningFem {

    public static void main(String[] args) {

        System.out.println("Skriv in ett ord.");
        Scanner scan = new Scanner(System.in);
        String answer = scan.nextLine();

        StringBuilder build = new StringBuilder(answer);
        StringBuilder buildReverse = new StringBuilder(answer);
        String compOne = build.toString();
        String compTwo = buildReverse.reverse().toString();

        if (compOne.equals(compTwo)){
            System.out.println("Du skrev in ett palindrom.");
        } else {
            System.out.println("Detta är inte ett palindom.");
        }

    }
}
