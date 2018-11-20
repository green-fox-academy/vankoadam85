package theGardenApplication;

public class Plant {

  private String color;
  private double waterAbsorption;
  private int wateringThreshold;

  Plant(String color) {
    this.color = color;
  }

  public void setWaterAbsorption(double waterAbsorption) {
    this.waterAbsorption = waterAbsorption;
  }

  public void setWateringThreshold(int wateringThreshold) {
    this.wateringThreshold = wateringThreshold;
  }
}
