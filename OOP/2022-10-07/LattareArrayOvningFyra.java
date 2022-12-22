
import java.util.Scanner;

public class LattareArrayOvningFyra {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        System.out.println("Skriv in ett ord.");
        String answer = scan.nextLine();

        StringBuilder build = new StringBuilder(answer); // En string är alltid ett objekt. Även i detta fall med StringBuilder.
        //StringBuilder gör det möjligt att ändra i en String istället för att skapa en ny.
        //build.append(answer); append för att lägga till text.

        System.out.println(build); 

        System.out.println(build.reverse()); //to.String() hade behövs om det var siffror i stringen?    

    }
}
