import java.util.Scanner;

public class LattareArrayerOvningNio {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        String[] values = new String[10];
        //Gör om med lista istället?

        System.out.println("Skriv in några namn (max 10 st), för sluta mata in tal skriv \"avsluta\"");
        for (int i = 0; i < values.length; i++) {
            System.out.print("Skriv in ett namn: ");
            String name = scan.nextLine();
            values[i] = name;
            if (name.equals("avsluta")) {
                break;
            }
        }

        int maxLength = 0;
        int minLength = Integer.MAX_VALUE;
        int lengthCounter = 0;
        String longestWord = "";
        String shortesWord = "";

        for (int k = 0; k < values.length; k++) {
            for (int j = 0; j < values[k].length(); j++) {
                lengthCounter++;
            }
            if (lengthCounter > maxLength){
                longestWord = values[k];
            }
            if (lengthCounter < minLength){
                shortesWord = values[k];
            }
        }

        System.out.println("Det längsta namnet du skrev in är " + longestWord);
        System.out.println("Det kortaste namnet du skrev in är " + shortesWord);
    }
}
