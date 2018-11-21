package main.java.music;

public abstract class StringedInstrument extends Instrument {

  protected int numberOfStrings;

  @Override
  public void play() {
    System.out.println(name + ", a " + numberOfStrings + "-stringed instrument that goes " + sound());
  }

  protected abstract String sound();
}
