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
      if (score > winner.getHand().getValueOfHand()){
        winner = currentPlayer;
      }
    }
    return winner;
  }

}
  


// public int cardPileSize(){
//    return cardPile.size();
// }

// public void addToCardPile(Card card){
//  cardPile.add(card);
// }

// public void clearCardPile(){
//   cardPile.clear();
// }

// public Card removeFromCardPile(Card card){
//   if (cardPile.remove(card)) {
//      return card;
//   }
//   return null;
// }

// public void dealCard(Player player, Card card){
//   removeFromCardPile(card);
//   player.handAdd(card);
// }

// public void returnToDeck(Player player, Card card){
//   player.handRemove(card);
//   addToCardPile(card);
// }

// public void moveCardBetweenPlayers(Player player1, Player player2, Card card){
//   player1.handRemove(card);
//   player2.handAdd(card);
// }



// }
