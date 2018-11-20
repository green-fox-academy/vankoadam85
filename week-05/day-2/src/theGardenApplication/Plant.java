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

  void gettingWatered (double waterAmount) {
    waterLevel += waterAmount * waterAbsorption;
  }

  String status() {
    if (needsWatering()) {
      return "The " + this.color + " " + this.getClass().getSimpleName() + " needs water\n";
    } else {
      return "The " + this.color + " " + this.getClass().getSimpleName() + " doesn't need water\n";
    }
  }

}
