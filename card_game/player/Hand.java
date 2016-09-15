package player;
import java.util.*;
import card.*;

public class Hand{

  private ArrayList<Card> hand;
  // private Card card;

  public Hand(){
    this.hand = new ArrayList<Card>();
  }

  public void receiveACard(Card card){
    hand.add(card);
  }

  public int getCount(){
    return hand.size();
  }

  public int getValueOfHand(){
    int counter = 0;
    for (Card card : hand){
      counter += card.getRank().getValue();
    }
    return counter;
  }

  public String toString(){
    String string = "";
    for(Card card : hand){
      string += card.toString() + "\n";
    }
    return string;
  }

}
