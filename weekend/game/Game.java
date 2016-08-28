package game;
import card.*;
import player.*;
import java.util.*;

public class Game {


   private ArrayList<Player> players;
   private Deck deck;
   private int currentPlayerIndex;


  public Game(){
    this.players = new ArrayList<Player>();
    this.deck = new Deck();
    currentPlayerIndex = 0;
  }

  public int playerCount(){
    return players.size();
  }

  public void addAPlayer(Player player){
    players.add(player);
  }

  public Player giveCurrentPlayer(){
    return players.get(currentPlayerIndex);
  }

  public int changeCurrentPlayer(){
    currentPlayerIndex = (currentPlayerIndex + 1) % players.size();
    return currentPlayerIndex;
  }

  public Player getWinner(){
    Player winner = players.get(0);
    for (Player currentPlayer : players){
      int score = currentPlayer.getHand().getValueOfHand();
      if ((score > winner.getHand().getValueOfHand() && (score <= 21)){
        winner = currentPlayer;
      }
    }
    return winner;
  }

}
  
