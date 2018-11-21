package Comparable;

public class Thing implements Comparable<Thing>{
  private String name;
  private boolean completed;

  public Thing(String name) {
    this.name = name;
  }

  public void complete() {
    this.completed = true;
  }

  public String getName() {
    return name;
  }

  @Override
  public String toString() {
    return (completed ? "[x] " : "[ ] ") + name;
  }

  @Override
  public int compareTo(Thing thing) {
    if (this.completed == thing.completed) {
      return this.name.compareTo(thing.name);
    } else if (this.completed) {
      return 1;
    } else {
      return -1;
    }
  }
}
