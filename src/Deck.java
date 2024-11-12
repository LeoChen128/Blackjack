import java.util.AbstractList;
import java.util.List;
import java.util.ArrayList;
public class Deck {

    private ArrayList<String> deckOfCards;

    public Deck(){
        List<String> cards = new ArrayList<>();
        String[] suit = {"Diamonds", "Hearts", "Clubs", "Spades"};
        String[] order = {"Ace", "2", "3","4","5","6","7","8","9","10","Jack","Queen","King"};
        deckOfCards = new ArrayList<String>();
        for (int i = 0; i < order.length; i++) {
            for (int j = 0; j < suit.length; j++) {
                deckOfCards.add(order[i] + " of " + suit[j]);
            }
        }
    }

    public ArrayList<String> getDeck() {
        return deckOfCards;
    }

    public void draw(){

    }

    public void checkAce(){

    }
}


