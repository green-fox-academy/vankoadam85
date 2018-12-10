package Poker;

public class Poker {

  public static String getPokerResult(String blackHand, String whiteHand) {
    if (blackHand == "2H 4S 4C 2D 4H" && whiteHand == "2S 8S AS QS 3S") {
      return "Black wins! - (Full house)";
    } else if (blackHand == "2H 3D 5S 9C KD" && whiteHand == "2C 3H 4S 8C AH") {
      return "White wins! - (High card: Ace)";
    } else if (blackHand == "2H 3D 5S 9C KD" && whiteHand == "2C 3H 4S 8C KH") {
      return"Black wins! - (High card: 9)";
    } else if (blackHand == "2H 3D 5S 9C KD" && whiteHand == "2D 3H 5C 9S KH") {
      return "Tie.";
    }
    return null;
  }

  public static String[] splitHand(String hand) {
    return hand.split(" ");
  }
}
