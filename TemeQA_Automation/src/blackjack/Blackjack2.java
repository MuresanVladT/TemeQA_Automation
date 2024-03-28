package blackjack;

public class Blackjack2 {
    public static void main(String[] args) {
        String card1 = "queen";
        String card2 = "ace";
        boolean result = isBlackjack(card1, card2);
        System.out.println("Cele două cărți formează Blackjack: " + result);
    }

    public static boolean isBlackjack(String card1, String card2) {
        if ((card1.equals("ten") || card1.equals("jack") || card1.equals("queen") || card1.equals("king")) && card2.equals("ace")) {
            return true;
        } else if ((card2.equals("ten") || card2.equals("jack") || card2.equals("queen") || card2.equals("king")) && card1.equals("ace")) {
            return true;
        } else {
            return false;
        }
    }
}
