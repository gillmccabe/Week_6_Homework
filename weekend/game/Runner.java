package game;
import java.util.*;

public class Runner {
  public static void main(String[] args){

    ArrayList<Player> players = new ArrayList<Player>();
    Deck deck = new Deck();
    Game game = new Game(deck);
    Scanner input = new Scanner(System.in);

    System.out.println("Please enter Player 1 name: ");
    String player1Name = input.next();
    Player player1 = new Player(player1Name);
    System.out.println("Please enter Player 2 name: ");
    String player2Name = input.next();
    Player player2 = new Player(player2Name);

    game.addAPlayer(player1);
    game.addAPlayer(player2);
    game.dealToPlayers();


  }
}