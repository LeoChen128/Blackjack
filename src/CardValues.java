/**
 * The CardValues class provides the value of a card based on its rank.
 * The value of an Ace is 1, royals cards (Jack, Queen, King) are valued at 10, and numeric cards return their respective integer values.
 */
public class CardValues {

    /**
     * Returns the value of a card based on its rank.
     *
     * @param card represents a string of the card (ex: "Ace of Hearts").
     * @return the value of the card as an int.
     */
    public static int getValue(String card) {
        int space = card.indexOf(" ");
        String special = card.substring(0, space);

        if (special.equals("Ace")) {
            return 1;
        } else if (special.equals("Jack") || special.equals("Queen") || special.equals("King")) {
            return 10;
        } else {
            return Integer.parseInt(special);
        }
    }
}
