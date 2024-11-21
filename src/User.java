import java.util.ArrayList;

/**
 * This is the User Class, and it represents the person using the console. This user would have a hand (of cards) and a score tracker.
 */
public class User {
    private ArrayList<String> hand;
    private int score;

    public User() {
        this.hand = new ArrayList<>();
        this.score = 0;
    }
    public void drawInitialCards(Deck deck) {
        for (int i = 0; i < 2; i++) {
            String card = deck.draw();
            //in case if card returns to null
            if(card != null)
            {
                hand.add(card);
                score += CardValues.getValue(card);
            }
        }
    }
    public void drawCard(Deck deck){
        String card = deck.draw();
        if(card != null)
        {
            hand.add(card);
            score += CardValues.getValue(card);
        }
    }

    public int getScore(){
        return score;
    }

    public ArrayList<String> getHand() {
        return hand;
    }

    public boolean over21(){
        if (score > 21)
        {
            return true;
        }
        return false;
    }

    public String toString() {

        return hand.toString() + " User's score: " + score;
    }



}
