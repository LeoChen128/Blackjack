import java.util.List;
import java.util.ArrayList;
public class Deck {
    public deckOfCards(){
        List<String> cards = new ArrayList<>();
        String[] suit = {"Diamonds", "Hearts", "Clubs", "Spades"};
        String[] order = {"Ace", "2", "3","4","5","6","7","8","9","10","Jack","Queen","King"};
        ArrayList<String> deckOfCards = new ArrayList<String>();
        for (int i = 0; i < order.length; i++) {
            for (int j = 0; j < suit.length; j++) {
                deckOfCards.add(order[i] + suit[j]);
            }
        }
        return deckOfCards;
    }
}


