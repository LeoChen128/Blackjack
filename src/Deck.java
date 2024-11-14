import java.util.List;
import java.util.ArrayList;
import java.util.Collections;

public class Deck {

    public String drawInitialCards;
    private ArrayList<String> deckOfCards;

    public Deck() {
        List<String> cards = new ArrayList<>();
        String[] suit = {"Diamonds", "Hearts", "Clubs", "Spades"};
        String[] order = {"Ace", "2", "3", "4", "5", "6", "7", "8", "9", "10", "Jack", "Queen", "King"};
        deckOfCards = new ArrayList<String>();
        for (int i = 0; i < order.length; i++) {
            for (int j = 0; j < suit.length; j++) {
                deckOfCards.add(order[i] + " of " + suit[j]);
            }
        }
        //This allows the deck to be randomized, so it wouldn't have a rigid order.
        Collections.shuffle(deckOfCards);
    }

    public ArrayList<String> getDeck() {
        return deckOfCards;
    }

    public String draw() {
        // .size gets the size of the list
        if (deckOfCards.size() > 0) {
            return deckOfCards.remove(deckOfCards.size() - 1);
        }
        return null;
    }

    public int getSizeDeck()
    {
        return deckOfCards.size();
    }

}

