public class Counter {

  public static int counter (int n) {
    if (n >= 0) {
      System.out.println(n);
      return counter(n - 1);
    }
    return 0;
  }

  public static void main(String[] args) {
    counter(5);
  }
}



