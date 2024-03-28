package blackjack;

public class Blackjack3 {
    public static void main(String[] args) {
        boolean isBlackJack =true;
        int dealerScore = 7;
        String decision = largeHand(isBlackJack, dealerScore);
        System.out.println(("Decizia pentru mâna mare: " + decision));
    }

    public static String largeHand(boolean isBlackJack, int dealerScore) {
        if (isBlackJack) {
            if (dealerScore < 7) {
                return "W";
            } else {
                return "S";
            }
        } else {
            return "S";
        }
    }
}