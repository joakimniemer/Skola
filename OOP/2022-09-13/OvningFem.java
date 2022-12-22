import java.util.Scanner;

public class OvningFem {
    public static void main(String[] args) {

        int maxL = 600;
        int maxW = 100;
        int maxTotal = 900;

        int minL = 140;
        int minW = 90;

        Scanner scan = new Scanner(System.in);

        System.out.println("Skriv in längd av brev.");
        int length = scan.nextInt();
        System.out.println("Skriv in bredd av brev.");
        int width = scan.nextInt();
        System.out.println("Skriv in tjocklek av brev.");
        int thickness = scan.nextInt();

        boolean req1 = (length <= maxL) && (length >= minL);
        boolean req2 = (width <= maxW) && (width >= minW);
        boolean req3 = ((length + width + thickness) <= maxTotal);

        if (req1 && req2 && req3) {
            System.out.println("Packetet är ok storlek");
        }
        else{
            System.out.println("Detta är inte ett brev av standard storlek");
        }


        scan.close();
    }

}