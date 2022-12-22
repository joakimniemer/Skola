import java.util.Scanner;

public class OvningEtt {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Skriv in rektangelns bredd");
        double bredd = scanner.nextInt();
        System.out.println("Skriv in rektangelns höjd");
        double hojd = scanner.nextInt();

        double omkrets = 2 * bredd + 2 * hojd;
        double area = bredd * hojd;

        System.out.printf("Rektangelns omkrets är %.2f.%nRektangelns är %.2f.%n", omkrets, area); // %d för int och %.för double?
                                                                                                   

        scanner.close();

    }
}
