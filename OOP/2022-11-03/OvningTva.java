import java.util.ArrayList;
import java.util.Scanner;

public class OvningTva {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        var lista = new ArrayList<String>();
        String answer = "asdasdasda";

        while (!answer.equalsIgnoreCase("")) {
            System.out.println("Skriv in ett namn");
            answer = scan.nextLine();
            if (!answer.equalsIgnoreCase("sluta")) {
                lista.add(answer);
            }

        }
        System.out.println("");
        lista.stream().forEach(System.out::println);

    }
}
