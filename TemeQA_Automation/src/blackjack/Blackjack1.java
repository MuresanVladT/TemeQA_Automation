package blackjack;

public class Blackjack1 {
    public static void main(String[] args) {
        String card = "ace";
        int cardValue = parseCard(card);
        System.out.println("Valoarea cărții \"" + card + "\" este: " + cardValue);
    }

    public static int parseCard(String card) {
        switch (card) {
            case "ace":
                return 11;
            case "two":
                return 2;
            case "three":
                return 3;
            case "four":
                return 4;
            case "five":
                return 5;
            case "six":
                return 6;
            case "seven":
                return 7;
            case "eight":
                return 8;
            case "nine":
                return 9;
            case "ten":
            case "jack":
            case "queen":
            case "king":
                return 10;
            default:
                return 0; // numele cărții nu este valid
        }
    }
}
