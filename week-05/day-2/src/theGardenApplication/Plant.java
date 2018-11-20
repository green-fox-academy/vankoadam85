package theGardenApplication;

public class Plant {

  private String color;
  private double waterAbsorption;
  private int wateringThreshold;
  private double waterLevel;

  Plant(String color) {
    this.color = color;
    this.waterLevel = 0;
  }

  void setWaterAbsorption(double waterAbsorption) {
    this.waterAbsorption = waterAbsorption;
  }

  void setWateringThreshold(int wateringThreshold) {
    this.wateringThreshold = wateringThreshold;
  }

  Boolean needsWatering () {
    return waterLevel < wateringThreshold;
  }

  void status() {
    if (needsWatering()) {
      System.out.println("The " + this.color + " " + getClass() + " needs water");
    } else {
      System.out.println("The " + this.color + " " + getClass() + " doesn't need water");
    }
  }

}
