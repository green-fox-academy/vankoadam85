package Poker;

import org.junit.Test;

import static Poker.Poker.getPokerResult;
import static Poker.Poker.splitHand;
import static org.junit.Assert.*;

public class PokerTest {

 @Test
 public void testNull() {
  assertEquals(null, getPokerResult(null, null));
 }

 @Test
 public void testSuggestedCases() {
  assertEquals("White wins! - (High card: Ace)", getPokerResult("2H 3D 5S 9C KD", "2C 3H 4S 8C AH"));
  assertEquals("Black wins! - (Full house)", getPokerResult("2H 4S 4C 2D 4H", "2S 8S AS QS 3S"));
  assertEquals("Black wins! - (High card: 9)", getPokerResult("2H 3D 5S 9C KD", "2C 3H 4S 8C KH"));
  assertEquals("Tie.", getPokerResult("2H 3D 5S 9C KD", "2D 3H 5C 9S KH"));
 }

 @Test
 public void testSplit() {
  String[] expected = {"2H", "3D", "5S", "9C", "KD"};
  assertArrayEquals(expected, splitHand("2H 3D 5S 9C KD"));
 }
}
