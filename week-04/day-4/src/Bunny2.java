public class Bunny2 {

  public static int earCounter (int bunnies) {
    if (bunnies > 0 && bunnies % 2 != 0) {
      return 2 + earCounter(bunnies - 1);
    } else if (bunnies > 0 && bunnies % 2 == 0) {
      return 3 + earCounter(bunnies - 1);
    }
    return 0;
  }

  public static void main(String[] args) {
    System.out.println(earCounter(10));
  }

}
