import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.Scanner;

public class WriteMultipleLines {

  public static String input() {
    Scanner input = new Scanner(System.in);
    String source = input.nextLine();
    return source;
  }

  public static void writeMultipleLines (String path, String word, int number) {
    Path filePath = Paths.get(path);
    ArrayList<String> words = new ArrayList<>();
    for (int i = 0; i < number; i++) {
      words.add(word);
    }
    try {
      Files.write(filePath, words);
    } catch (IOException e) {}
  }

  public static void main(String[] args) {
    System.out.println("Please specify the file's location");
    String path = input();
    System.out.println("Please specify the name to write");
    String word = input();
    writeMultipleLines(path, word, 5);
  }
}
