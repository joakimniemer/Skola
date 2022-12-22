import java.util.Scanner;

public class OvningTva {
    public static void main(String[] args) throws RuntimeException, IllegalArgumentException {

        Scanner scan = new Scanner(System.in);
        int userInput;

        System.out.println("Skriv in ett värde mellan 0-10 ");
        try {
            userInput = scan.nextInt();

            if (userInput > 10) {
                throw new RuntimeException();
            } else if (userInput < 0) {
                throw new IllegalArgumentException();
            } else {
                System.out.printf("Du skrev in %d", userInput);
            }

        }

        // IllegalArgumentException är en sub-klass till RuntimeException så därför
        // måste den ligga först??
        // RuntimeException kan även fånga upp IllegalArgumentException eftersom den är
        // basklassen??
        catch (IllegalArgumentException ex1) {
            System.err.println("Opps fel igen: " + ex1.getMessage());
        } catch (RuntimeException ex) {
            System.err.println("Opps något gick fel: " + ex.getMessage());
        }

        // Multi-catch, i detta fallet tar den båda men annars skriver man "or" |
        // } catch (RuntimeException ex) {
        // System.err.println("Opps något gick fel: " + ex.getMessage());
        // }

    }
}
