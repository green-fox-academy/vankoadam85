package Poker;

import org.junit.Test;

import static org.junit.Assert.*;


public class HandTest {

  @Test
  public void testConstructor() {
    String[] input = {"2H", "3D", "5S", "9C", "KD"};
    Hand testHand = new Hand(input);
    assertEquals(13, testHand.getHand()[0].getNumericValue());
  }

  @Test
  public void testGetHandRank() {
    Hand testHand1 = new Hand(new String[]{"2H", "3D",  "5S",  "9C", "KD"});
    Hand testHand2 = new Hand(new String[]{"2C", "3H", "4S", "8C", "AH"});
    Hand testHand3 = new Hand(new String[]{"2H", "4S", "4C", "2D", "4H"});
    Hand testHand4 = new Hand(new String[]{"2S", "8S", "AS", "QS", "3S"});
//    assertEquals(10, testHand1.getHandRank());
//    assertFalse(testHand3.getHandRank() == 10);
  }

  @Test
  public void testForFlush() {
    Hand testHand1 = new Hand(new String[]{"2S", "8S", "AS", "QS", "3S"});
    assertTrue(testHand1.isFlush());
    Hand testHand2 = new Hand(new String[]{"2C", "3H", "4S", "8C", "AH"});
    assertFalse(testHand2.isFlush());
  }
}
