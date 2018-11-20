package aircraftCarrier;

public class Main {

  public static void main(String[] args) {

    Carrier enterprise = new Carrier(3000, 10000);
    Carrier invincible = new Carrier(2500, 8000);

    enterprise.add(new F16());
    enterprise.add(new F16());
    enterprise.add(new F16());
    enterprise.add(new F16());
    enterprise.add(new F16());
    enterprise.add(new F16());
    enterprise.add(new F16());
    enterprise.add(new F16());

    invincible.add(new F35());
    invincible.add(new F35());
    invincible.add(new F35());
    invincible.add(new F35());

    System.out.println(enterprise.getStatus());
    System.out.println(invincible.getStatus());

    try {
      enterprise.fill();
    } catch (Exception e) {
      System.out.println(e);
    }

    try {
      invincible.fill();
    } catch (Exception e) {
      System.out.println(e);
    }

    System.out.println(enterprise.getStatus());
    System.out.println(invincible.getStatus());

    enterprise.fight(invincible);

    System.out.println(enterprise.getStatus());
    System.out.println(invincible.getStatus());

    invincible.fight(enterprise);

    System.out.println(enterprise.getStatus());
    System.out.println(invincible.getStatus());

  }
}
