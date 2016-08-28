package game;
import card.*;
import player.*;
import java.util.*;

public class Game {


   private ArrayList<Player> players;
   private Deck deck;
   private int currentPlayerIndex;


  public Game(Deck deck){
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

  public Deck getDeck(){
    return this.deck;
  }

  public void dealToPlayers(){
    deck.fullDeck();
    deck.shuffle();
    for (int i = 0; i < 2; i++){
      for (Player player : players){
        player.getHand().receiveACard(deck.dealCard());
      }
    }
  }

  public String twist(Player player){
    player.getHand().receiveACard(deck.dealCard());
    return player.getHand().toString();
  }

  public String playerOut(Player player){
    if (player.getHand().getValueOfHand() > 21) {
      players.remove(player);
      return ("You've gone above 21, you're out");
    }
    else
      return "Your updated hand is" + "\n" + player.getHand().toString();
  }

  public Player getWinner(){
    Player winner = players.get(0);
    for (Player currentPlayer : players){
      int score = currentPlayer.getHand().getValueOfHand();
      if ((score > winner.getHand().getValueOfHand()) && (score <= 21)){
        winner = currentPlayer;
      }
    }
    return winner;
  }

  public String showWinner(){
    return getWinner().getName();
  }





}
  
