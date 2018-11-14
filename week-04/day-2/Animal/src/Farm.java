import java.util.ArrayList;

public class Farm {
  private ArrayList<Animal> farm = new ArrayList<>();
  private int farmSize;

  Farm (int farmSize) {
    this.farmSize = farmSize;
  }

  public void add(Animal animal) {
    if (farm.size() < farmSize) {
      farm.add(animal);
    } else {
      System.out.println("Sorry, the farm is full");
    }
  }

  public void breed() {
    add(new Animal());
  }

  public void slaughter () {
    int toSlaughter = 0;
    for (int i = 0; i < farm.size() ; i++) {
      if (farm.get(i).hunger < farm.get(toSlaughter).hunger) {
        toSlaughter = i;
      }
    }
    farm.remove(toSlaughter);
  }
}
