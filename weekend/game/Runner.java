package game;
import game.*;
import card.*;
import player.*;
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

    System.out.println("\n" + player1.getName() + " " + "your hand is...");
    System.out.println(player1.getHand().toString());
    System.out.println("\n" + player2.getName() + " " + "your hand is...");
    System.out.println(player2.getHand().toString());


// Code below should allow players to stick or twist, but currently can't save new card from twist to hand. Need to add while loop to ensure player is not given option to twist or stick if they go over 21.

    // System.out.println("\n" + player1.getName() + " " + "do you want to stick or twist?");
    // String userInput = input.next();
    // if(userInput == "twist"){
    //   game.twist(player1);
    // }
    // else {
    //   System.out.println(game.playerOut(player1));
    // }

    // System.out.println("\n" + player2.getName() + " " + "do you want to stick or twist?");
    // String userInput = input.next();
    // if(userInput == "twist"){
    //   game.twist(player2);
    // }
    // else {
    //   System.out.println(game.playerOut(player2));
    // }

    if (game.getWinner() != null){
      System.out.println("The winner is: ");
      System.out.println(game.showWinner());
    }



  }
}