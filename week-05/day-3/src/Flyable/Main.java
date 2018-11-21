package Flyable;

public class Main {

  public static void main(String[] args) {
    Helicopter blackShark = new Helicopter("Kamov Ka-50", 315);

    blackShark.takeOff();
    blackShark.fly();
    blackShark.land();

  }

}
