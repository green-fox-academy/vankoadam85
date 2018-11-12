import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class WriteSingleLine {

  public static String input() {
    Scanner input = new Scanner(System.in);
    String source = input.nextLine();
    return source;
  }

  public static void writeName (String source, List<String> name) {
    Path sourcePath = Paths.get(source);
    try {
      Files.write(sourcePath, name);
    } catch (IOException e) {
      System.out.println("Unable to write file: " + source);
    }
  }

  public static void main(String[] args) {
    System.out.println("Please specify the file's location");
    String source = input();
    System.out.println("Please specify the name to write");
    List<String> name = Arrays.asList(input());
    writeName(source, name);
    }
  }
