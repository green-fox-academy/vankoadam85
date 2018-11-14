import java.util.ArrayList;

public class Ship {
  private ArrayList<Pirate> ship = new ArrayList<>();
  private int captainIndex = 0;

  public void fillShip() {
    int crewSize = 5 + (int) (Math.random() * 26);
    for (int i = 0; i < crewSize; i++) {
      ship.add(new Pirate());
    }
    captainIndex = (int) (Math.random() * crewSize);
    ship.get(captainIndex).isCaptain = true;
  }

  private int crewAlive() {
    int crewAlive = 0;
    for (int i = 0; i < ship.size(); i++) {
      if (ship.get(i).isAlive) {
        crewAlive++;
      }
    }
    return crewAlive;
  }

  private int captainsRum() {
    return ship.get(captainIndex).drinks;
  }

  public void status() {
    if (ship.get(captainIndex).isAlive) {
      System.out.print("The captain is alive ");
      if (ship.get(captainIndex).isConscious) {
        System.out.println("and awake.");
      } else {
        System.out.println("but passed out.");
      }
      if (captainsRum() == 0) {
        System.out.println("The captain is sober!!! Is the rum all gone?");
      } else {
        System.out.println("The captain had " + captainsRum() + " rum.");
      }
      if (ship.get(captainIndex).pet != "") {
        System.out.println("The captain also has a pet " + ship.get(captainIndex).pet + ".");
      }
    } else {
      System.out.println("The captain is dead!");
    }
    System.out.println("The ship has " + crewAlive() + " alive crew members.");
  }


  public Boolean battle(Ship opponent) {
    int score = crewAlive() - captainsRum() - opponent.crewAlive() + opponent.captainsRum();
    if (score > 0) {
      for (int i = 0; i < crewAlive() - 1; i++) {
        ship.get(i).drinks += (int) (Math.random() * 6);
      }
      for (int i = 0; i < opponent.crewAlive() - 1; i++) {
        opponent.ship.get(i).isAlive = Math.random() * 2 >= 1;
      }
    } else {
      for (int i = 0; i < opponent.crewAlive() - 1; i++) {
        opponent.ship.get(i).drinks += (int) (Math.random() * 6);
      }
      for (int i = 0; i < crewAlive() - 1; i++) {
        ship.get(i).isAlive = Math.random() * 2 >= 1;
      }
    }
      return score > 0;
    }
}
