import static org.junit.Assert.*;
import org.junit.*;
import player.*;
import card.*;

public class PlayerTest {

  Player player;
  Hand hand;
  Card card1;
  Card card2;

  @Before
  public void before(){
    hand = new Hand();
    player = new Player("Gillian");
    card1 = new Card(SuitType.HEARTS, RankType.TWO);
    card2 = new Card(SuitType.SPADES, RankType.KING);

    }

  @Test
  public void canGetName(){
   assertEquals("Gillian", player.getName());
  }

  @Test
  public void startsWithEmptyHand() {
    assertEquals(0, player.getHand().getCount());
  }

  @Test
  public void canGetAHand(){
    player.getHand().receiveACard(card1);
    player.getHand().receiveACard(card2);
    assertEquals(12, player.getHand().getValueOfHand());
  }


}