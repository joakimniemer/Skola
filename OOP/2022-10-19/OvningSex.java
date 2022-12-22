import java.util.ArrayList;
import java.util.List;

public class OvningSex {
    public static void main(String[] args) {

        List<Card> deck = new ArrayList<>();
        deck.add(new Card(2, Color.HEARTS));

        for (int i = 2; i <= 14; i++) {
            deck.add(new Card(i, Color.HEARTS));
            deck.add(new Card(i, Color.DIAMONDS));
            deck.add(new Card(i, Color.SPADES));
            deck.add(new Card(i, Color.CLUBS));
        }

        for (Card c : deck) {
            System.out.println(c);
        }
    }
}
