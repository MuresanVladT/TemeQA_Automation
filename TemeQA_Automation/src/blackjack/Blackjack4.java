package blackjack;

public class Blackjack4 {
    public static void main(String[] args) {
        int handScore = 15;
        int dealerScore = 12;
        String decision = smallHand(handScore, dealerScore);
        System.out.println("Decizia pentru mâna mică: " + decision);
    }

    public static String smallHand(int handScore, int dealerScore) {
        if (handScore >= 17) {
            return "S";
        } else if (handScore <= 11) {
            return "H";
        } else {
            if (dealerScore >= 7) {
                return "H";
            } else {
                return "S";
            }
        }
    }
}
