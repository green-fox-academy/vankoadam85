public class NumberAdder {

  public static int adder (int n) {
    if (n >= 1) {
      return n + adder(n - 1);
    }
    return 0;
  }

  public static void main(String[] args) {
    System.out.println(adder(8));
  }

}
