package Poker;

import java.util.Arrays;

public class Hand {

  private Card[] hand;

  Hand(String[] stringHand) {
    hand = new Card[stringHand.length];
    for (int i = 0; i < stringHand.length; i++) {
      this.hand[i] = new Card(stringHand[i]);
    }
    Arrays.sort(hand);
  }

  public Card[] getHand() {
    return hand;
  }

//  public int getHandRank() {
//    if(this.isRoyalFlush()) {
//      return 1;
//    } else if (isStraightFlush()) {
//      return 2;
//    } else if(isPoker()) {
//      return 3;
//    } else if(isFullHouse()) {
//      return 4;
//    } else if(isFlush()) {
//      return 5;
//    } else if(isStraight()) {
//      return 6;
//    } else if(isThreeOfAKind()) {
//      return 7;
//    } else if(isTwoPair()) {
//      return 8;
//    } else if(isPair()) {
//      return 9;
//    }
//    return 10;
//  }

  boolean isFlush() {
    return (Arrays.stream(this.hand).map(card -> card.getSuit()).distinct().count() == 1);
  }

}
