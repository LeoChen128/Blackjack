import java.util.ArrayList;

/**
 * The Dealer class represents a dealer in a card game, and it manages the dealer's hand of cards,
 * score, and the rules for drawing additional cards. The dealer draws cards from a deck and follows specific game rules,
 * such as drawing cards until the score reaches 17.
 */
public class Dealer {

    //List to store the dealer's hand of cards.
    private ArrayList<String> hand;

    //The dealer's score, which adds the values of the drawn cards.
    private int score;

    /**
     * Constructs a new Dealer with an empty hand and a score of 0.
     */
    public Dealer() {
        this.hand = new ArrayList<>();
        this.score = 0;
    }

    /**
     * Draws the two initial cards from the Deck and adds them to the dealer's hand.
     * The dealer's score is updated based on the values of the drawn cards.
     *
     * @param deck represents the Deck} object from which the cards are drawn.
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
     * Returns the dealer's current score.
     *
     * @return the score of the dealer.
     */
    public int getScore() {
        return score;
    }

    /**
     * Returns the dealer's current hand of cards.
     *
     * @return An {@code ArrayList} containing the cards in the dealer's hand.
     */
    public ArrayList<String> getHand() {
        return hand;
    }

    /**
     * Checks if the dealer's score exceeds 21.
     *
     * @return true if the score is greater than 21 and false otherwise.
     */
    public boolean over21() {
        return score > 21;
    }

    /**
     * Draws a single card from the Deck and adds it to the dealer's hand.
     * The dealer's score is updated based on the value of the drawn card.
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
     * Follows the dealer's rules for drawing additional cards.
     * The dealer draws cards until their score reaches at least 17.
     *
     * @param deck represents the deck object from which the cards are drawn.
     */
    public void rules(Deck deck) {
        // The dealer draws cards until the score is at least 17.
        while (score < 17) {
            drawCard(deck);
        }
    }
}
