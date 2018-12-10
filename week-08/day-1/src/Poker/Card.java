package Poker;

public class Card implements Comparable<Card> {

  private String value;
  private String suit;

  Card(String value, String suit) {
    this.value = value;
    this.suit = suit;
  }

  Card(String valueSuit) {
    this("" + valueSuit.charAt(0), "" + valueSuit.charAt(1));
  }

  public int getNumericValue() {
    switch (this.value) {
      case "A":
        return 14;
      case "K":
        return 13;
      case "Q":
        return 12;
      case "J":
        return 11;
      default:
        return Integer.parseInt(this.value);
    }
  }

  public String getValue() {
    return value;
  }

  public String getSuit() {
    return suit;
  }

  @Override
  public int compareTo(Card card) {
    return card.getNumericValue() - this.getNumericValue();
  }
}
