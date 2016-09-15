package player;
import card.*;
import java.util.*;

public class Player {

 String name;
 Hand hand;


  public Player(String name){
    this.name = name;
    this.hand = new Hand();
  }

  public String getName(){
    return this.name;
  }

  public Hand getHand(){
    return this.hand;
  }


}