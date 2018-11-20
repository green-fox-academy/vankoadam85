package theGardenApplication;

public class Main {

  public static void main(String[] args) {
    Garden testGarden = new Garden();

    testGarden.addPlant(new Flower("yellow"));
    testGarden.addPlant(new Flower("blue"));
    testGarden.addPlant(new Tree("purple"));
    testGarden.addPlant(new Tree("orange"));

    System.out.println(testGarden.toString());

    testGarden.water(40);
    System.out.println(testGarden.toString());

    testGarden.water(70);
    System.out.println(testGarden.toString());

  }

}
