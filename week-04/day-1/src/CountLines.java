import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.List;
import java.util.Scanner;

public class CountLines {

  public static int lineCount (String source) {
    Path sourcePath = Paths.get(source);
    try {
      List<String> text = Files.readAllLines(sourcePath);
      return text.size();
    } catch (IOException e) {
      return 0;
    }
  }

  public static String input() {
    Scanner input = new Scanner(System.in);
    String source = input.nextLine();
    return source;
  }

  public static void main(String[] args) {
    System.out.println("Please specify the file's location");
    System.out.println("The number of lines in the given file is: " + lineCount(input()));
    }
  }
