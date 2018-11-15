public class String3 {

  public static String addStar (String input) {
    if (input.length() > 1 ) {
      return input.charAt(0) + "*" + addStar(input.substring(1));
    }
    return input;
  }

  public static void main(String[] args) {
    System.out.println(addStar("whatever"));
  }

}
