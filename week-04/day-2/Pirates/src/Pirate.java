public class Pirate {
  int drinks = 0;
  Boolean isAlive = true;
  Boolean isConscious = true;
  Boolean isCaptain = false;
  String pet = "";

  Pirate () {
    int petChance = 1 + (int)(Math.random() * 10);
    if (petChance >  9) {
      pet = "parrot";
    } else if (petChance < 2) {
      pet = "monkey";
    }
  }

  private void dead() {
    System.out.println("he's dead");
  }

  private void passedOut() {
    System.out.println("he's passed out");
  }

  public void drinkSomeRum () {
    if (isAlive && isConscious) {
      drinks++;
      System.out.println("'tis nah all th' rum, right?");
    } else if (isAlive) {
      passedOut();
    } else {
      dead();
    }
  }

  public void howsItGoingMate () {
    if (isAlive && drinks >= 5) {
      System.out.println("Arghh, I'ma Pirate. How d'ya d'ink its goin?");
      isConscious = false;
      drinks = 0;
    } else if (isAlive && isConscious) {
      System.out.println("Pour me anudder!");
    } else if (isAlive && !isConscious) {
      passedOut();
      isConscious = true;
    } else {
      dead();
    }
  }

  public void brawl (Pirate opponent) {
    if (!isConscious) {
      passedOut();
      isConscious = true;
    } else if (!opponent.isConscious && opponent.isAlive) {
      opponent.isAlive = false;
      System.out.println("Bad time fer a nap, scallywag!");
    } else if (opponent.isAlive) {
      System.out.println("Ye're shark bait!");
      int outcome = (int)(Math.random() * 3);
      if (outcome == 0) {
        opponent.isAlive = false;
      } else if (outcome == 1) {
        isAlive = false;
      } else {
        opponent.isConscious = false;
        isConscious = false;
      }
    }
  }

}
