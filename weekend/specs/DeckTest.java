import static org.junit.Assert.*;
import org.junit.*;
import card.*;

public class DeckTest {

  Deck deck;

  @Before public void before(){
    deck = new Deck();
  }

  @Test
  public void deckStartsEmpty(){
    assertEquals(0, deck.getCount());
  }

  @Test
  public void canFillDeck(){
    deck.fullDeck();
    assertEquals(52, deck.getCount());
  }

  @Test
  public void canTakeCardFromDeck(){
    deck.fullDeck();
    Card card = deck.dealCard();
    assertEquals(SuitType.DIAMONDS, card.getSuit());
    assertEquals(51, deck.getCount());
  }

}