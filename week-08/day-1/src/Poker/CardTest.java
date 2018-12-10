package Poker;

import org.junit.BeforeClass;
import org.junit.Test;

import static org.junit.Assert.*;

public class CardTest {

  Card aceOfSpades = new Card("A", "S");
  Card kingOfHearts = new Card("K", "H");
  Card queenOfSpades = new Card("Q", "S");
  Card jackOfDiamonds = new Card("J", "D");
  Card tenOfClubs = new Card("10", "C");
  Card tenOfDiamonds = new Card("10", "D");
  Card twoOfSpades = new Card("2", "S");

  @Test
  public void testCompareTo() {
    assertTrue(aceOfSpades.compareTo(queenOfSpades) < 0);
    assertTrue(queenOfSpades.compareTo(aceOfSpades) > 0);
    assertTrue(tenOfClubs.compareTo(tenOfDiamonds) == 0);
    assertTrue(kingOfHearts.compareTo(twoOfSpades) < 0);
    assertTrue(kingOfHearts.compareTo(kingOfHearts) == 0);
    assertTrue(jackOfDiamonds.compareTo(queenOfSpades) > 0);
    assertTrue(twoOfSpades.compareTo(tenOfDiamonds) > 0);
  }

  @Test
  public void testGetNumericValue() {
    assertEquals(14, aceOfSpades.getNumericValue());
    assertEquals(13, kingOfHearts.getNumericValue());
    assertEquals(12, queenOfSpades.getNumericValue());
    assertEquals(11, jackOfDiamonds.getNumericValue());
    assertEquals(10, tenOfClubs.getNumericValue());
    assertEquals(2, twoOfSpades.getNumericValue());
  }
}
