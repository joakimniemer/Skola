import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Deck {

    public Deck() {
    }

    public static List<Card> createDeck() {
        List<Card> deck = new ArrayList<>();
        deck.add(new Card(2, Color.HEARTS));

        for (int i = 2; i <= 14; i++) {
            deck.add(new Card(i, Color.HEARTS));
            deck.add(new Card(i, Color.DIAMONDS));
            deck.add(new Card(i, Color.SPADES));
            deck.add(new Card(i, Color.CLUBS));
        }

        Collections.shuffle(deck);
        return deck;
    }

    public Card nextCard(List<Card> list) {
        Card cardToReturn = list.get(0);
        int counter = 0;

        for (int i = 0; i < list.size(); i++) {
            cardToReturn = list.get(i);
            counter++;
        }
        list.remove(counter - 1);

        return cardToReturn;
    }
}
