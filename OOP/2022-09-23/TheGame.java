import java.util.Scanner;

public class TheGame {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        System.out.println("Vad heter spelare 1? ");
        String playerOneName = scan.next();
        Player playerOne = new Player(playerOneName);

        System.out.println("Vad heter spelare 2? ");
        String playerTwoName = scan.next();
        Player playerTwo = new Player(playerTwoName);

        NumberGame game = new NumberGame(playerOne, playerTwo);


        System.out.println("");


    }

}
