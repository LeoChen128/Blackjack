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

        //user cannot see the one of the cards of the dealer
        //test
        System.out.println("Dealer cards: " + dealer.getHand());

        System.out.println("Dealer cards: Blank, " +  dealer.getHand().get(1));
        while (game){
            if (user.getScore() == 21){
                if (dealer.getScore() == 21){
                    System.out.println("");
                }
            }
//            System.out.println("Do you want to hit or stand? (h or s)");
//            String input = s.nextLine().toLowerCase();
//            if (input.equals("h"))
//            {
//                user.drawCard(deck);
//                System.out.println("User cards: " +  user);
//
//                if (user.over21())
//                    {
//                        System.out.println("Dealer cards: " + dealer.getHand());
//                        System.out.println("The total value of your cards have reached over 21!\nYou Lost!");
//                        return;
//                    }
//            }
//
//            if (input.equals("s")) {
//                System.out.println("You decided to stand! Now lets see if that was the right choice...");
//            }
//
//            else{
//                System.out.println("That move does not exist. Please use h for hit and s for stand.");
//                continue;
//            }
//
//            System.out.println("Dealer cards: " + dealer.getHand());
//            dealer.rules(deck);
//
//            if (user.getScore() == 21){
//                System.out.println("Congrats you got a value of 21!");
//                game = false;
//            }
//
//            if (dealer.over21()){
//                System.out.println("The dealer card value went over 21!");
//            }
//
//            else{
//                System.out.println("Dealer's final cards: " + dealer.getHand());
//                System.out.println("Dealer's final score: " + dealer.getScore());
//            }
//
//            if (user.getScore() > dealer.getScore()){
//                System.out.println("User final cards: " +  user);
//                System.out.println("You won!");
//                game = false;
//            }
//
//            else if (user.getScore() < dealer.getScore()){
//                System.out.println("User final cards: " +  user);
//                System.out.println("You lost!");
//                game = false;
//            }
//
//            else{
//                System.out.println("User final cards: " +  user);
//                System.out.println("It is a tie!");
//                game = false;
//            }

        }
    }
}
