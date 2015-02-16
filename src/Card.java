/**
 * Created by matulik on 16.02.15.
 * Class describes single card that will be assigned to the player.
 * Suits: 0 - not set, 1 - Pik, 2 - Kier, 3 - Karo, 4 - Trefl
 * Values: 0 - not set,  2-9, T(10), J, Q, K, A
 */
public class Card {
    private char symbol;
    private char suit;

    Card() {
        this.symbol = '0';
        this.suit = '0';
    }

    public void setSymbol(char symbol) {
        if (symbol == '0' || symbol == '2' || symbol == '3' || symbol == '4' || symbol == '5' || symbol == '6' || symbol == '7' || symbol == '8' || symbol == '9' || symbol == 'T' || symbol == 'J' || symbol == 'Q' || symbol == 'K' || symbol == 'A') {
            this.symbol = symbol;
        } else {
            System.out.println("Zła wartość symbolu.");
        }
    }

    public char getSymbol() {
        return this.symbol;
    }

    public void setSuit(char suit) {
        if (suit == '1' || suit == '2' || suit == '3' || suit == '4') {
            this.suit = suit;
        } else {
            System.out.println("Zła wartość koloru.");
        }
    }

    public char getSuit() {
        return this.suit;
    }

    public String toString() {
        return this.symbol + "" + this.suit;
    }
}
