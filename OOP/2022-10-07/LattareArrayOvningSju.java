import java.util.Scanner;

public class LattareArrayOvningSju {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        System.out.print("Skriv in ett ord: ");
        StringBuilder build = new StringBuilder();
        String word = scan.nextLine();

        for (int i = 0; i < word.length(); i++) {
            build.append(word.charAt(i));
            System.out.println(build.toString());
        }
    }
}
