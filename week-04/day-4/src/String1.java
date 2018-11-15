public class String1 {

  public static String replaceXY (String input) {
    if (input.contains("x")) {
      return replaceXY(input.replaceFirst("x", "y"));
    }
    return input;
  }

  public static void main(String[] args) {

    System.out.println(replaceXY("Mr. Mxyzptlk"));

  }

}
