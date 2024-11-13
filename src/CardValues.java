public class CardValues {
    public static int getValue(String card) {
        int space = card.indexOf(" ");
        String special = card.substring(0, space);
        if (special.equals("Ace"))
        {
            return 11;
        }

        else if (special.equals("Jack")|| special.equals("Queen")|| special.equals("King"))
        {
            return 10;
        }

        else
        {
            return Integer.parseInt(special);
        }
    }
}
