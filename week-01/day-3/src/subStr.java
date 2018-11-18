import java.util.Scanner;

public class subStr {

  public static String input() {
    Scanner input = new Scanner(System.in);
    return input.nextLine();
  }

  private static int subStringSearcher(String text, String query) {
    for (int i = 0; i < text.length() + 1 - query.length(); i++) {
      for (int j = 0; j < query.length(); j++) {
        if (text.charAt(i + j) != query.charAt(j)) {
        break;
        }else if (j == query.length() - 1) {
          return i;
        }
      }
    }
  return -1;
  }

  public static void main(String[] args) {
    System.out.println("Please input a text to be searched!");
    String text = input();
    System.out.println("Please input the query to search for!");
    String query = input();
    System.out.println("The string you are searching for starts at character "
        + subStringSearcher(text, query) + " in the text");
  }
}
