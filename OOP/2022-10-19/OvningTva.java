import java.util.Scanner;

public class OvningTva {

    public static VokalKonsonantAnnat typ(char c) {

        if (c == 'a' || c == 'o' || c == 'u' || c == 'å' || c == 'e' || c == 'i' || c == 'y' || c == 'ä'
                || c == 'ö') {
            return VokalKonsonantAnnat.VOKAL;
        } else if (c == 'b' || c == 'c' || c == 'd' || c == 'f' || c == 'g' || c == 'h' || c == 'j' || c == 'k'
                || c == 'l' || c == 'm' || c == 'n' || c == 'p' || c == 'q' || c == 'r' || c == 's' || c == 't'
                || c == 'v' || c == 'w' || c == 'x' || c == 'z') {
            return VokalKonsonantAnnat.KONSONANT;
        } else {
            return VokalKonsonantAnnat.ANNAT;
        }

    }

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        System.out.println("Skriv in en mening");
        String input = scan.nextLine().toLowerCase();

        int vokCounter = 0;
        int konCounter = 0;
        int annCounter = 0;

        for (int i = 0; i < input.length(); i++) {
            char c = input.charAt(i);
            
            if (typ(c) == VokalKonsonantAnnat.VOKAL) {
                vokCounter++;
            } else if (typ(c) == VokalKonsonantAnnat.KONSONANT) {
                konCounter++;
            } else if (typ(c) == VokalKonsonantAnnat.ANNAT) {
                annCounter++;
            }
        }

        System.out.printf("Meningen består av %d vokaler, %d konstanter och %d andra tecken.", vokCounter, konCounter,
                annCounter);
        scan.close();
    }
}
