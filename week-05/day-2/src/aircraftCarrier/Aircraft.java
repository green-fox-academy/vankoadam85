package aircraftCarrier;

public class Aircraft {

  private int ammo;
  private int maxAmmo;
  private int baseDamage;
  private Boolean priority;

  Aircraft(int maxAmmo, int baseDamage, Boolean priority) {
    this.ammo = 0;
    this.maxAmmo = maxAmmo;
    this.baseDamage = baseDamage;
    this.priority = priority;
  }

  public int fight() {
    int damage = ammo * baseDamage;
    this.ammo = 0;
    return damage;
  }

}
