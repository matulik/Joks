import javafx.scene.control.Tab;

/**
 * Created by matulik on 16.02.15.
 */
public class Table {
    private int players;
    private int virtualplayers;
    private Player[] player = new Player[9];

    Table() {
        this.virtualplayers = 0;
        this.setPlayers(2);
    }

    public void setPlayers(int players) {
        if (players > 9 || players < 1) {
            System.out.println("Zły argument. Za dużo graczy. Możliwe od 2 do 9.");
        } else {
            this.players = players;
            //player = new Player[this.players];
            for (int i = 0; i < this.players; i++) {
                player[i] = new Player();
            }
            this.setVirtualplayers(this.virtualplayers);
        }
    }

    public int getPlayers() {
        return this.players;
    }

    public void setVirtualplayers(int virtualplayers) {
        if (virtualplayers > this.players || virtualplayers < 0) {
            System.out.println("Zły argument. Więcej wirtualnych graczy od rzeczywistych");
        } else {
            this.virtualplayers = virtualplayers;
            for (int i = 0; i < this.virtualplayers; i++) {
                player[i].setIs_virtual(true);
            }
        }
    }

    public void setPlayer(int n, Player player) {
        if (n > this.players || n < 0) {
            System.out.println("Zły argument. Nie istnieje gracz o podanym indeksie");
        } else {
            this.player[n] = player;
        }
    }

    public Player getPlayer(int n) {
        if (n > this.players || n < 0) {
            System.out.print("Zły argument. Nie istnieje gracz o podanym indeksie");
            return null;
        } else {
            return this.player[n];
        }
    }

    public String playerList() {
        String temp = new String();
        for (int i = 0; i < this.players; i++) {
            System.out.println(i);
            temp += player[i].getName() + " - " + player[i].toString() + "\n";
        }
        return temp;
    }


    public static void main(String[] args) {
        /*Table t = new Table();
        Card k1 = new Card();
        Card a2 = new Card();
        k1.setSuit('1');
        k1.setSymbol('K');
        a2.setSymbol('A');
        a2.setSuit('2');
        t.getPlayer(1).setCard(k1, a2);
        System.out.println(t.getPlayers());
        System.out.println(t.playerList());*/
    }

}
