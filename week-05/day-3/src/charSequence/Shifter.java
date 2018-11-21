package charSequence;

public class Shifter implements CharSequence {

  private String string;
  private int shiftIndex;

  Shifter(String string, int shiftIndex) {
    this.string = string;
    this.shiftIndex =shiftIndex;
  }

  @Override
  public int length() {
    return 0;
  }

  @Override
  public char charAt(int index) {
    return this.string.charAt(index + this.shiftIndex);
  }

  @Override
  public CharSequence subSequence(int start, int end) {
    return null;
  }
}
