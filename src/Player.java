import java.util.Comparator;

/**
 * Created by matulik on 16.02.15.
 */
public class Player implements Comparable<Player> {
    private static int nextId = 1;
    private int id;
    private String name;
    private Card[] card = new Card[2];
    private float percent;
    private boolean is_virtual;


    Player() {
        this.name = "Noname";
        this.percent = 0;
        this.is_virtual = false;
        this.card[0] = new Card();
        this.card[1] = new Card();
    }

    public void setId() {
        this.id = nextId;
        nextId++;
    }

    public int getId() {
        return this.id;
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

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return this.name;
    }

    public String toString() {
        return this.getName() + " - " + this.card[0].toString() + "|" + this.card[1].toString();
    }

    public int compareTo(Player p) {
        return Integer.compare(this.id, p.id);
    }

    public static void main(String[] args) {
       /* Player p = new Player();
        System.out.println(p.toString());*/
    }

}
