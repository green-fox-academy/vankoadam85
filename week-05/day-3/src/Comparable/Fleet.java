package Comparable;

import java.util.ArrayList;
import java.util.Collections;

public class Fleet {
  private ArrayList<Thing> things;

  public Fleet() {
    things = new ArrayList<>();
  }

  public void add(Thing thing) {
    things.add(thing);
  }

  public void completeThing(String thingName) {
    for (Thing thing : this.things) {
      if (thing.getName().equals(thingName)) {
        thing.complete();
      }
    }
  }

  public void sortFleet() {
    Collections.sort(this.things);
  }

  @Override
  public String toString() {
    String result = "";
    for(int i = 0; i < things.size(); i++) {
      result += (i+1) + ". " + things.get(i) + "\n";
    }
    return result;
  }
}
