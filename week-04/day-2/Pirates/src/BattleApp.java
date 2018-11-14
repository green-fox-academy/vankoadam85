public class BattleApp {

  public static void main(String[] args) {
    Ship lightning = new Ship();
    Ship dragon = new Ship();
    lightning.fillShip();
    dragon.fillShip();

    System.out.println(lightning.battle(dragon));
    System.out.println();

    lightning.status();
    System.out.println();
    dragon.status();
  }

}
