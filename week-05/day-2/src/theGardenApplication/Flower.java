package theGardenApplication;

public class Flower extends Plant {

  Flower(String color) {
    super(color);
    setWaterAbsorption(7.5);
    setWateringThreshold(5);
  }
}
