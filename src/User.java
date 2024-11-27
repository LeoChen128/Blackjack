import java.util.ArrayList;

/**
 * The User class represents a player in a card game, holding a hand of cards and tracking the player's score.
 * The user can draw cards from a deck, with a score that updates based on the values of the drawn cards.
 * This class provides methods to manage the user's hand, score, and check if the score exceeds a specified limit.
 */
public class User {

    // List to store the user's hand of cards.
    private ArrayList<String> hand;

    // The user's score, which adds the values of the drawn cards.
    private int score;

    /**
     * Constructs a new User with an empty hand and a score of 0.
     */
    public User() {
        this.hand = new ArrayList<>();
        this.score = 0;
    }

    /**
     * Draws two initial cards from the deck and adds them to the user's hand.
     * The user's score is updated based on the values of the drawn cards.
     *
     * @param deck represents the Deck object from which the cards are drawn.
     */
    public void drawInitialCards(Deck deck) {
        for (int i = 0; i < 2; i++) {
            String card = deck.draw();
            // In case the card returned is null (deck is empty).
            if (card != null) {
                hand.add(card);
                score += CardValues.getValue(card);
            }
        }
    }

    /**
     * Draws a single card from the Deck and adds it to the user's hand.
     * The user's score is updated based on the value of the drawn card.
     *
     * @param deck represents the Deck object from which the card is drawn.
     */
    public void drawCard(Deck deck) {
        String card = deck.draw();
        if (card != null) {
            hand.add(card);
            score += CardValues.getValue(card);
        }
    }

    /**
     * Returns the user's current score.
     *
     * @return The score of the user.
     */
    public int getScore() {
        return score;
    }

    /**
     * Returns the user's current hand of cards.
     *
     * @return a arrayList containing the cards in the user's hand.
     */
    public ArrayList<String> getHand() {
        return hand;
    }

    /**
     * Checks if the user's score exceeds 21.
     *
     * @return true if the score is greater than 21, and returns false otherwise.
     */
    public boolean over21() {
        return score > 21;
    }

    /**
     * Returns a string representation of the user's hand and score.
     *
     * @return A string describing the user's hand and score.
     */
    public String toString() {
        return hand.toString() + " User's score: " + score;
    }
}

