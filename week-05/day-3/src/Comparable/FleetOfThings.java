package Comparable;

public class FleetOfThings {

  public static void main(String[] args) {
    Fleet fleet = new Fleet();

    fleet.add(new Thing("Get milk"));
    fleet.add(new Thing("Remove the obstacles"));
    fleet.add(new Thing("Stand up"));
    fleet.add(new Thing("Eat lunch"));

    System.out.println(fleet);
    System.out.println();

    fleet.sortFleet();

    System.out.println(fleet);

    System.out.println();

    fleet.completeThing("Stand up");
    fleet.completeThing("Eat lunch");


    fleet.sortFleet();

    System.out.println(fleet);


  }
}
