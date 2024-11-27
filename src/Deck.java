import java.util.List;
import java.util.ArrayList;
import java.util.Collections;

/**
 * The Deck class represents a standard deck of playing cards.
 * It initializes the deck with 52 cards, consisting of 13 ranks (Ace through King)
 * and 4 suits (Diamonds, Hearts, Clubs, and Spades). The deck is shuffled
 * upon creation to ensure the cards are randomized.
 */
public class Deck {

    // List to hold the deck of cards.
    private ArrayList<String> deckOfCards;

    /**
     * Constructs a new  Deck object and initializes it with a 52-card deck.
     * The deck consists of 13 ranks (Ace, 2-10, Jack, Queen, King) in 4 suits
     * (Diamonds, Hearts, Clubs, Spades). The deck is then shuffled.
     */
    public Deck() {
        List<String> cards = new ArrayList<>();
        String[] suit = {"Diamonds", "Hearts", "Clubs", "Spades"};
        String[] order = {"Ace", "2", "3", "4", "5", "6", "7", "8", "9", "10", "Jack", "Queen", "King"};
        deckOfCards = new ArrayList<String>();

        // Add each combination of rank and suit to the deck
        for (int i = 0; i < order.length; i++) {
            for (int j = 0; j < suit.length; j++) {
                deckOfCards.add(order[i] + " of " + suit[j]);
            }
        }

        //Shuffles the deck to randomize the order of cards
        Collections.shuffle(deckOfCards);
    }

    /**
     * Draws (removes and returns) the top card from the deck.
     * If the deck is empty, it returns null.
     *
     * @return The top card from the deck as a String, or null if the deck is empty.
     */
    public String draw() {
        //If there are cards left in the deck, remove and return the last card
        if (deckOfCards.size() > 0) {
            return deckOfCards.remove(deckOfCards.size() - 1);
        }
        //If the deck is empty, return null
        return null;
    }
}
