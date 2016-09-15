import static org.junit.Assert.*;
import org.junit.*;
import card.*;
import player.*;

public class HandTest {

  Player player;
  Deck deck;
  Card card1;
  Card card2;
  Hand hand;

  @Before
  public void before(){
    player = new Player("Gill");
    deck = new Deck();
    card1 = new Card(SuitType.HEARTS, RankType.TWO);
    card2 = new Card(SuitType.SPADES, RankType.KING);
    hand = new Hand();
  }

  @Test
  public void handstartsEmpty(){
    assertEquals(0, hand.getCount());
  }

  @Test
  public void canReceiveACard(){
    hand.receiveACard(card1);
    assertEquals(1, hand.getCount());
  }

  @Test
  public void canGetValueOfHand(){
    hand.receiveACard(card1);
    hand.receiveACard(card2);
    int value = hand.getValueOfHand();
    assertEquals(12, value);
  }

}