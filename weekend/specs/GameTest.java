import static org.junit.Assert.*;
import org.junit.*;
import player.*;
import card.*;
import game.*;
import java.util.*;

public class GameTest {

  Game game;
  Deck deck;
  ArrayList<Player> players;
  Player player1;
  Player player2;
  Player player3;
  Card card1;
  Card card2;
  Card card3;
  Card card4;

  @Before
  public void before(){
    players = new ArrayList<Player>();
    player1 = new Player("Gillian");
    player2 = new Player("Stuart");
    player3 = new Player("Emma");
    card1 = new Card(SuitType.DIAMONDS, RankType.THREE);
    card2 = new Card(SuitType.HEARTS, RankType.KING);
    card3 = new Card(SuitType.CLUBS, RankType.QUEEN);
    card4 = new Card(SuitType.SPADES, RankType.SEVEN);
    deck = new Deck();
    game = new Game (deck);
  }

  @Test
  public void canAddPlayer(){
    assertEquals(0, game.playerCount());
    game.addAPlayer(player1);
    assertEquals(1, game.playerCount());
  }

  @Test
  public void canGiveCurrentPlayer(){
    game.addAPlayer(player1);
    assertEquals("Gillian", game.giveCurrentPlayer().getName());
  }

  @Test
  public void canChangeCurrentPlayer(){
    game.addAPlayer(player1);
    game.addAPlayer(player2);
    assertEquals("Gillian", game.giveCurrentPlayer().getName());
    game.changeCurrentPlayer();
    assertEquals("Stuart", game.giveCurrentPlayer().getName());
  }

  @Test
  public void canDealToPlayers(){
    game.addAPlayer(player1);
    game.addAPlayer(player2);
    game.dealToPlayers();
    assertEquals(2, player1.getHand().getCount());
    assertEquals(2, player2.getHand().getCount());
  }

  @Test
  public void playerCanTwist(){
    game.addAPlayer(player1);
    game.addAPlayer(player2);
    game.dealToPlayers();
    game.twist(player1);
    assertEquals(3, player1.getHand().getCount());
  }

  @Test
  public void canGetWinner(){
    game.addAPlayer(player1);
    game.addAPlayer(player2);
    player1.getHand().receiveACard(card1);
    player2.getHand().receiveACard(card2);
    Player winner = game.getWinner();
    assertEquals("Stuart", winner.getName());
  }

}


