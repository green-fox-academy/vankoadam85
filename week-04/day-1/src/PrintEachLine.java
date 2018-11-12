import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.Arrays;
import java.util.List;

public class PrintEachLine {

  public static List<String> input (Path p) {
    try {
      List<String> text = Files.readAllLines(p);
      return text;
    } catch (IOException e) {
      List<String> error = Arrays.asList("Unable to read file: ", p.toString());
      return error;
    }
  }

  public static void main(String[] args) {
    Path source = Paths.get("d:/greenfox/my-file.txt");
    for (int i = 0; i < input(source).size() ; i++) {
      System.out.println(input(source).get(i));
    }
  }
}
