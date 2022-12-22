import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class OvningTre {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        List<String> listVersion = new ArrayList<>();

        for (int i = 0; i < 3; i++) {
            System.out.println("Skriv in en mening text.");
            listVersion.add(scan.next());
        }

        System.out.println(mostOf(listVersion, 'e') + " har mest antal \"e\"");

    }

    public static String mostOf(List<String> list, char ch) {

        int mostOfSameChar = 0;
        int chartCounter = 0;
        String stringWithMostCommonChars = "";

        for (int i = 0; i < list.size(); i++) {

            for (int k = 0; k < list.get(i).length(); k++) {

                if (list.get(i).charAt(k) == ch) {
                    chartCounter++;

                    if (chartCounter > mostOfSameChar) {
                        mostOfSameChar = chartCounter;
                        stringWithMostCommonChars = list.get(i);
                    }

                }

            }
            chartCounter = 0;

        }

        return stringWithMostCommonChars;
    }

}
