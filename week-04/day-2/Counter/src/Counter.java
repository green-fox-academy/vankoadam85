public class Counter {
  private int num;
  private int initialValue;

  Counter () {
    num = 0;
  }

  Counter (int initialValue) {
    this.initialValue = initialValue;
    num = initialValue;
  }

  public void add() {
    num++;
  }

  public void add(int number) {
    num += number;
  }

  public int get(){
    return num;
  }

  public void reset(){
    num = initialValue;
  }
}
