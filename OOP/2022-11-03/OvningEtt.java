import java.util.ArrayList;
import java.util.Scanner;

public class OvningEtt {
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
        for (int i = 0; i < lista.size(); i++) {
            System.out.println(lista.get(i));
        }

    }
}