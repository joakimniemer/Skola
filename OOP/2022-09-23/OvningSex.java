import java.util.Scanner;

public class OvningSex {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        Company theCompany = new Company("NiemerAB", "13-37", "Joakim Niemer");

        String answer;
        double debt = 0;
        double assets = 0;

        do {
            System.out.println(theCompany);

            System.out
                    .println("Meny:\n1.Lägg till skuld.\n2.Lägg till tillgång.\n3.Byt ut VD:n.\nExit meny (\"close\")");
            answer = scan.next();
            if (answer.equals("1")) {
                System.out.println("Lägg till föränding i total skuld: ");
                debt = debt + scan.nextDouble();
                theCompany.setTotalDebt(debt);
            }
            if (answer.equals("2")) {
                System.out.println("Lägg till föränding i totala tillgångar: ");
                assets = assets + scan.nextDouble();
                theCompany.setTotalAssets(assets);
            }
            if (answer.equals("3")) {
                System.out.println("Skriv in namnet på den nya VD:n: ");
                theCompany.setNameCEO(scan.next());
            }

        } while (!answer.equals("close"));
    }
}