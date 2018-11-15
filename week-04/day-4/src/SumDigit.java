public class SumDigit {

  public static int digitAddder (int n) {
    if (n > 0) {
      return n % 10 + digitAddder(n / 10);
    }
    return 0;
  }

  public static void main(String[] args) {
    System.out.println(digitAddder(123456789));
  }

}
