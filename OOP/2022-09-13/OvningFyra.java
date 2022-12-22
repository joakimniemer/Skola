import java.util.Scanner;

public class OvningFyra {
    public static void main(String[] args) {
        
        Scanner scan = new Scanner(System.in);

        System.out.println("Hur många poäng fick du på provet?");
        int points = scan.nextInt();

        if(points < 20){
            System.out.println("Du är underkänd.");
        }
        else if(points > 19 && points <35) {
            System.out.println("Du är godkänd.");
        }
        else if (points >34 && points <44){
            System.out.println("Du är väl godkänd!");
        }
        else if (points >33){
            System.out.println("Du är mycket väl godkänd!!");
        }

        scan.close();
    }
}
