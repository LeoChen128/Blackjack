import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        ArrayList<String> user = new ArrayList<>();
       //test to see if the whole deck is printed out
        Deck deck = new Deck();
        System.out.println(deck.getDeck());

        //sets up the User's hand
        User userCards = new User();
        user.add(userCards.getInitialCards());
        System.out.println(user);





    }
}