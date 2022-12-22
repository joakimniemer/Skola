import java.util.Scanner;

public class LattareArrayOvningTva {
    
    public static void main(String[] args) {
        
        Scanner scan = new Scanner(System.in);
        System.out.println("Vilken är huvudstaden i Japan?");
        String answer = scan.nextLine();

        if(answer.equalsIgnoreCase("tokyo")){
            System.out.println("Rätt svar!");
        } else {
            System.out.println("Fel.");
        }

    }
}
