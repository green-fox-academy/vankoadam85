package main.java.music;

public abstract class StringedInstrument extends Instrument {

  protected int numberOfStrings;

  @Override
  protected void play() {
    System.out.println(name + ", " + numberOfStrings + "-stringed instrument that goes " + sound());
  }

  protected abstract String sound();
}
