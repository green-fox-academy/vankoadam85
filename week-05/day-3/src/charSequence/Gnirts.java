package charSequence;

public class Gnirts implements CharSequence {

  private String string;

  Gnirts(String string) {
    this.string = string;
  }

  @Override
  public int length() {
    return 0;
  }

  @Override
  public char charAt(int index) {
    char[] tempCharArray = new char[this.string.length()];
    this.string.getChars(0, this.string.length(), tempCharArray, 0);
    return tempCharArray[this.string.length() - 1 - index];
  }

  @Override
  public CharSequence subSequence(int start, int end) {
    return null;
  }
}
