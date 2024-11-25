import java.util.Scanner;

public class Game {

    public static void main(String[]args){
        //Introduction of the Game
        System.out.println("WELCOME TO BLACKJACK\n" +
                "------------------------------------------------------\n" +
                "In this game of blackjack, your overall goal is to obtain the card value(score) of 21. \n" +
                "If the dealer(the one who gives out the cards) obtains the value of 21, " +
                "you lose unless you also have a value of 21 (will be a tie).\n" +
                "However, if either you or the dealer goes above 21 the games ends in a tie. \n" +
                "If the dealer's value is lower than your value then you win. \n" +
                "Now Good luck!\n" +
                "------------------------------------------\n");

        Scanner s = new Scanner(System.in);
        Deck deck = new Deck();
        User user = new User();
        Dealer dealer = new Dealer();
        boolean game = true;
        boolean userTurn = true;

        user.drawInitialCards(deck);
        dealer.drawInitialCards(deck);

        System.out.println("User cards: " +  user);

        System.out.println("Dealer cards: Blank, " +  dealer.getHand().get(1));

        while (game && userTurn && user.getScore() <= 21) {
            if (user.getScore() == 21) {
                System.out.println("You got Blackjack!");
                userTurn = false;
            } else {
                System.out.println("\nDo you want to hit or stand? (h or s)");
                String input = s.nextLine().toLowerCase();
                if (input.equals("h")) {
                    user.drawCard(deck);
                    System.out.println("User cards: " + user.getHand() + ". Your score: " + user.getScore());

                    if (user.over21()) {
                        System.out.println("\nThe total value of your cards have reached over 21!\nYou Busted!");
                        System.out.println("Dealer's final cards: " + dealer.getHand() + ". Dealer's Score:  " + dealer.getScore());
                        System.out.println("Game is now over, You lost!");
                        game = false;
                    }
                } else if (input.equals("s")) {
                    System.out.println("\nYou decided to stand with: " + user.getHand());
                    userTurn = false;
                } else {
                    System.out.println("That move does not exist. Please use h for hit and s for stand.");
                }
            }
        }


        if (game && !userTurn && user.getScore() <= 21){
            System.out.println("\nDealer's Turn:");
            System.out.println("Dealer's cards: " + dealer.getHand() + " Dealer's score: " + dealer.getScore());

            dealer.rules(deck);
            System.out.println("Dealer's final cards: " + dealer.getHand() + " Dealer's score: " + dealer.getScore());

            if (dealer.over21()){
                System.out.println("\nThe dealer card value went over 21!");
                System.out.println("You win!");
            }

            else {
                System.out.println("\nFinal scores: ");
                System.out.println("Dealer's cards: " + dealer.getHand() + " Dealer's score: " + dealer.getScore());
                System.out.println("User's cards: " + user.getHand() + " User's score: " + user.getScore());

                if (user.getScore() > dealer.getScore()){
                    System.out.println("You won!");
                }
                else if (user.getScore() < dealer.getScore()){
                    System.out.println("Dealer won!");
                }

                else {
                    System.out.println("It's a tie!");
                }
            }
        }
        s.close();
    }
}
