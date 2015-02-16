import java.util.Random;

/**
 * Created by matulik on 16.02.15.
 */
public class Deal {
    private static int id;
    private Table table = new Table();
    private Card[] cards = new Card[52];
    private Card[] tableCards = new Card[5];
    private Player dealer;

    Deal() {
        this.dealer = table.getPlayer(0);
    }

    public static void increaseid() {
        id++;
    }

    private void shuffle() {
        char[] symbols = {'0', '2', '3', '4', '5', '6', '7', '8', '9', 'T', 'J', 'Q', 'K', 'A'};
        int i = 0;
        for (int n = 1; n <= 4; n++) {
            for (int k = 1; k < 14; k++) {
                this.cards[i] = new Card();
                this.cards[i].setSuit((char) ('0' + n));
                this.cards[i].setSymbol(symbols[k]);
                i++;
            }
        }

        Card[] temp = new Card[52];
        Random gen = new Random();
        for (Card c : this.cards) {
            int n = gen.nextInt(52);
            while (temp[n] != null) {
                n = gen.nextInt(52);
            }
            //System.out.println(c.toString() + " na miejsce " + n);
            temp[n] = new Card();
            temp[n] = c;
        }
        for (i = 0; i < 52; i++) {
            this.cards[i] = temp[i];
        }
    }

    public int getDealerId() {
        for (int i = 0; i < table.getPlayers(); i++) {
            if (dealer.compareTo(table.getPlayer(i)) == 0) {
                return i;
            }
        }
        return -1;
    }

    public void changeDealer() {
        int id = this.getDealerId();
        if (id > this.table.getPlayers()) {
            id = 0;
        }
        this.dealer = this.table.getPlayer(id);
    }

    public void dealing() {
        int players = this.table.getPlayers();
        Player player;
        int c = 0;
        while (c < this.table.getPlayers()) {
            int id = getDealerId();
            System.out.println(id + c);
            if (id > this.table.getPlayers()) {
                id = 0;
            }
            player = table.getPlayer(id + c);
            player.setCard(this.cards[c], this.cards[c + 4]);
            c++;
        }

        c = 0;
        for (int i = this.table.getPlayers() * 2; i < this.table.getPlayers() * 2 + 5; i++) {
            this.tableCards[c] = this.cards[i];
            c++;
        }
    }

    public void showPlayersCards() {
        for (int i = 0; i < this.table.getPlayers(); i++) {
            System.out.println(this.table.getPlayer(i).toString());
        }
    }

    public void showTableCards() {
        for (Card c : this.tableCards) {
            System.out.print(c.toString() + "|");
        }
    }


    public void showCards() {
        for (Card c : this.cards) {
            System.out.print(c.toString() + "|");
        }
    }


    public static void main(String[] args) {
        Deal d = new Deal();
        d.table.setPlayers(4);
        d.shuffle();
        d.showCards();
        System.out.println();
        d.dealing();
        d.showPlayersCards();
        d.showTableCards();

    }

}
