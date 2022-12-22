import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class OvningSju {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        String input = "a";

        Deck deck = new Deck();
        List<Card> d2 = deck.createDeck();

        while (!input.equals("")) {
            Card currentCard = deck.nextCard(d2);
            String colorOfCard = currentCard.getColor().toString();
            System.out.println("");
            System.out.print("Guess next suite (enter to quit): ");
            input = scan.nextLine();
            if (input.equalsIgnoreCase(colorOfCard)) {
                System.out.printf("Correct, the card was %s%n", currentCard);
            } else {
                System.out.println("Wrong.");
            }
        } 

    }
}
