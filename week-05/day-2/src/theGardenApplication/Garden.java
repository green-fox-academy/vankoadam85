package theGardenApplication;

import java.util.ArrayList;

public class Garden {

  private ArrayList<Plant> garden = new ArrayList<>();

  void addPlant (Plant plant) {
    garden.add(plant);
  }

  public String toString () {
    if(garden.size() == 0) {
      return "The garden is empty";
    } else {
      String gardenToString = "";
      for (Plant plant : garden) {
        gardenToString += plant.status();
      }
      return gardenToString;
    }
  }

  void water (double waterAmount) {
    System.out.println("Watering with " + (int)waterAmount);
    ArrayList<Plant> plantsToWater = new ArrayList<>();
    for (Plant plant: this.garden) {
      if (plant.needsWatering()) {
        plantsToWater.add(plant);
      }
      for (Plant plantToWater : plantsToWater) {
        plantToWater.gettingWatered(waterAmount / plantsToWater.size());
      }
    }
  }

}
