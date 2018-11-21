package Flyable;

public class Helicopter extends  Vehicle implements Flyable {

  Helicopter(String name, int speed) {
    this.name = name;
    this.speed = speed;
  }


  @Override
  public void land() {
    System.out.println(this.name +  " lands.");
    this.isFlying = false;
  }

  @Override
  public void fly() {
    System.out.println(this.name + " flies with " + speed + " km/h.");
  }

  @Override
  public void takeOff() {
    System.out.println(this.name + " takes off.");
    this.isFlying = true;
  }
}
