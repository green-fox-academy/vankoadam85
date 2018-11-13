public class Main {

  public static void main(String[] args) {
    Animal zebra = new Animal();
    zebra.eat();
    System.out.println(zebra.hunger);
    zebra.drink();
    System.out.println(zebra.thirst);
    zebra.play();
    System.out.println(zebra.hunger);
    System.out.println(zebra.thirst);
  }

}
