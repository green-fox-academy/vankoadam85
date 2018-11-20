package aircraftCarrier;

import java.util.ArrayList;

public class Carrier {

  private ArrayList<Aircraft> airForce;
  private int ammoStorage;
  private int healthPoints;

  Carrier(int ammoStorage, int healthPoints) {
    this.airForce = new ArrayList<>();
    this.ammoStorage = ammoStorage;
    this.healthPoints = healthPoints;
  }

  public void add(Aircraft aircraft) {
    this.airForce.add(aircraft);
  }

  public void fill() throws Exception {
    if (ammoStorage == 0) {
      throw new Exception("Carrier is out of ammo");
    }
    ArrayList<Aircraft> lowPriorityAircraft = new ArrayList<>();
    for (Aircraft aircraft : airForce) {
      if (this.ammoStorage == 0) {
        break;
      } else if (aircraft.isPriority()) {
        ammoStorage = aircraft.refill(ammoStorage);
      } else {
        lowPriorityAircraft.add(aircraft);
      }
    }
    for (Aircraft aircraft : lowPriorityAircraft) {
      if (this.ammoStorage == 0) {
        break;
      } else {
        ammoStorage = aircraft.refill(ammoStorage);
      }
    }
  }

  public void fight(Carrier opponent) {
    opponent.gettingDamaged(this.damagingOthers());
  }

  private int damagingOthers() {
    int airForceDamage = 0;
    for (Aircraft aircraft : this.airForce) {
      airForceDamage += aircraft.fight();
    }
    return airForceDamage;
  }

  private void gettingDamaged(int damage) {
    this.healthPoints -= damage;
  }

  private int potentialDamage() {
    int potentialDamage = 0;
    for (Aircraft aircraft : airForce) {
      potentialDamage += aircraft.potentialDamage();
    }
    return potentialDamage;
  }

  public String getStatus() {
    String statusReport = "HP: " + healthPoints + ", Aircraft count: " + airForce.size() + ", Ammo Storage: "
          + ammoStorage + ", Total damage: " + this.potentialDamage() + "\n" + "Aircrafts:";
    if (healthPoints == 0) {
      return "It's dead Jim :(";
    } else {
      for (Aircraft aircraft : airForce) {
        statusReport += aircraft.getStatus();
      }
    }
    return statusReport;
  }

}
