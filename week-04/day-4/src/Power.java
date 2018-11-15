public class Power {

  public static int power (int n, int p) {
    if (n > 1 && p >= 1) {
      return n * power(n, p - 1);
    }
    return 1;
  }

  public static void main(String[] args) {
    System.out.println(power(4, 4));
  }

}
