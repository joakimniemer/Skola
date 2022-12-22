import java.util.Scanner;

public class LattOvningFem {
    public static void main(String[] args) {
        
        Scanner scan = new Scanner(System.in);
        System.out.print("Vilket är ditt favorit djur? ");
        String svar = scan.nextLine();

        svar = svar.toLowerCase();
        
        if (svar.equals("hund")){
            System.out.println("Voff! Det är ett bra djur det!");
        }


        scan.close();
    }
}
