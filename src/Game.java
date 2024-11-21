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

        while (game){

            if (user.getScore() == 21){
                if (dealer.getScore() == 21){
                    System.out.println("Dealer cards: " + dealer.getHand());
                    System.out.println("The dealer has tied with the Player!");
                }
                else{
                    System.out.println("You won!");
                }
                game = false;
                userTurn = false;
            }

            if (userTurn) {
                System.out.println("Do you want to hit or stand? (h or s)");
                String input = s.nextLine().toLowerCase();

                if (input.equals("h")) {
                    user.drawCard(deck);
                    System.out.println("User cards: " + user);

                    if (user.over21()) {
                        System.out.println("Dealer cards: " + dealer.getHand());
                        System.out.println("The total value of your cards have reached over 21!\nYou Lost!");
                        userTurn = false;
                        game = false;
                    }
                }

                else if (input.equals("s")) {
                    System.out.println("You decided to stand! Now lets see if that was the right choice...");
                    userTurn = false;
                }

                else {
                    System.out.println("That move does not exist. Please use h for hit and s for stand.");
                    continue;
                }
            }

            if(dealer.getScore() < 21){
                System.out.println("Dealer cards: " + dealer.getHand() + " Dealer's score: " + dealer.getScore());
                dealer.rules(deck);
                if (dealer.over21()){
                    System.out.println("The dealer card value went over 21!");
                    System.out.println("Dealer has lost!");
                }
                else{
                    if (user.getScore() > dealer.getScore()){
                        System.out.println("Dealer's final cards: " + dealer.getHand() + " Dealer's score: " + dealer.getScore());
                        System.out.println("User's final cards: " + user.getHand() + " User's score: " + user.getScore());
                        System.out.println("You won!");
                    }

                    else if (user.getScore() < dealer.getScore()){
                        System.out.println("Dealer's final cards: " + dealer.getHand() + " Dealer's score: " + dealer.getScore());
                        System.out.println("User's final cards: " + user.getHand() + " User's score: " + user.getScore());
                        System.out.println("You lost!");
                    }

                    else{
                        System.out.println("Dealer's final cards: " + dealer.getHand() + " Dealer's score: " + dealer.getScore());
                        System.out.println("User's final cards: " + user.getHand() + " User's score: " + user.getScore());
                        System.out.println("It is a tie!");
                    }
                }

                game = false;
            }
        }
        s.close();
    }
}
