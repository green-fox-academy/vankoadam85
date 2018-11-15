public class Refactorio {

  public static int refactorio(int n) {
    if (n > 1) {
      return n * refactorio(n - 1);
    }
    return n;
  }

  public static void main(String[] args) {

    System.out.println(refactorio(8));

  }

}
