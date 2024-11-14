import java.util.ArrayList;

public class Dealer {
    private ArrayList<String> hand;
    private int score;

    public Dealer() {
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

    public void startOver(){
        // ".clear" removes all elements of the array "hand"
        hand.clear();
    }

    public void rules(Deck deck){
        while (score < 17)
        {
            deck.draw();
        }
    }
}
