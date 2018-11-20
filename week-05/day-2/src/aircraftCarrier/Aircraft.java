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

  public int potentialDamage() {
    return this.ammo * this.baseDamage;
  }

  public int fight() {
    int damage = potentialDamage();
    this.ammo = 0;
    return damage;
  }

  public int refill(int refillAmmo) {
    int ammoToRefill = this.maxAmmo - this.ammo;
    if (refillAmmo > ammoToRefill) {
      this.ammo = this.maxAmmo;
      return refillAmmo - ammoToRefill;
    } else {
      this.ammo += refillAmmo;
      return 0;
    }
  }

  public String getType() {
    return this.getClass().getSimpleName();
  }

  public Boolean isPriority() {
      return priority;
  }

  public String getStatus() {
    return "Type " + this.getType() + ", Ammo: " + this.ammo + ", Base Damage: " + this.baseDamage + ", All Damage: " +
        this.ammo * this.baseDamage + "\n";
  }

}
