import java.util.Scanner;

public class OvningFem {
    public static void main(String[] args) {
        GameDie[] theDie = { new RegularD6(), new LoadedDie(), new RegularD12() };

        try (Scanner scan = new Scanner(System.in)) {
            System.out.println("Välj vilket tärning du vill spela med.");
            for (GameDie die : theDie) {
                System.out.println(die.getName());
            }
            int dieChoice = scan.nextInt(); scan.nextLine();

            int p1 = playerTurn(scan, "spelare ett", theDie[dieChoice]);
            int p2 = playerTurn(scan, "spelare två", theDie[dieChoice]);
            if (p1 > p2) {
                System.out.println("Spelare ett vann!");
            } else if (p2 > p1) {
                System.out.println("Spelare två vann!");
            } else {
                System.out.println("Det blev oavgjort!");
            }
        }
    }

    private static int playerTurn(Scanner scan, String name, GameDie die) {
        int roll = die.roll();
        System.out.printf("Nu skall %s slå med %s.%n", name,
                die.getDescription());
        System.out.printf("Du slog %d.%n", roll);
        System.out.println("Vill du slå om? J/N");
        String answer = scan.nextLine();
        if (answer.trim().toLowerCase().equals("j")) {
            roll = die.roll();
            System.out.printf("Du slog nu %d.%n", roll);
        }
        return roll;
    }
}