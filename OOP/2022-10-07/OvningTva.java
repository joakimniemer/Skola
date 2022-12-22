import java.util.ArrayList;
import java.util.Scanner;

public class OvningTva {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        String[] textArray = new String[3];

        for (int i = 0; i < textArray.length; i++) {
            System.out.println("Skriv in en mening text.");
            textArray[i] = scan.next();
        }

        System.out.println(mostOf(textArray, 'e') + " har mest antal....");

    }

    public static String mostOf(String[] textLines, char ch) {

        int mostOfSameChar = 0;
        int chartCounter = 0;
        String stringWithMostCommonChars = "";

        for (int i = 0; i < textLines.length; i++) {

            for (int k = 0; k < textLines[i].length(); k++) {

                if (textLines[i].charAt(k) == ch) {
                    chartCounter++;

                    if (chartCounter > mostOfSameChar) {
                        mostOfSameChar = chartCounter;
                        stringWithMostCommonChars = textLines[i];
                    }

                }

            }
            chartCounter = 0;

        }

        return stringWithMostCommonChars;
    }

}
