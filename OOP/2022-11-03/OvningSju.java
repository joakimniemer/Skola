
import java.util.ArrayList;
import java.util.Scanner;
import java.util.stream.Collectors;

public class OvningSju {
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
        var newList = lista.stream().filter(s -> s.length() > 2).filter(s -> s.charAt(1) != 'a').map(String::trim).map(String::toLowerCase)
                .collect(Collectors.toList());

        for (int i = 0; i < newList.size(); i++) {
            System.out.println(newList.get(i));
        }
    }
}
