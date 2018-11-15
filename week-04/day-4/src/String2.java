public class String2 {

  public static String replaceX (String input) {
    if (input.contains("x")) {
      return replaceX(input.replaceFirst("x", ""));
    }
    return input;
  }

  public static void main(String[] args) {

    System.out.println(replaceX("Mr. Mxyzptlk"));

  }

}
