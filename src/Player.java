/**
 * Created by matulik on 16.02.15.
 */
public class Player {
    private Card[] card = new Card[2];
    private float percent;
    private boolean is_virtual;

    Player() {
        this.percent = 0;
        this.is_virtual = false;
    }

    public void setPercent(float percent) {
        this.percent = percent;
    }

    public float getPercent() {
        return this.percent;
    }

    public void setIs_virtual(boolean is_virtual) {
        this.is_virtual = is_virtual;
    }

    public boolean getIs_virtual() {
        return this.is_virtual;
    }

    public void setCard(Card c1, Card c2) {
        this.card[0] = c1;
        this.card[1] = c2;
    }

    public Card getCard1() {
        return this.card[0];
    }

    public Card getCard2() {
        return this.card[1];
    }

    public String toString() {
        return this.card[0].toString() + "|" + this.card[1].toString();
    }

    public static void main(String[] args) {
        /*Card a1 = new Card();
        Card a2 = new Card();
        a1.setSuit('2');
        a1.setSymbol('K');
        a2.setSuit('1');
        a2.setSymbol('K');
        Player p = new Player();
        p.setCard(a1, a2);
        System.out.println(p.toString());*/
    }

}
