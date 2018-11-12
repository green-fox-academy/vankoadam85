import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.Scanner;
import static java.nio.file.StandardCopyOption.REPLACE_EXISTING;

public class CopyFile {

  public static String input() {
    Scanner input = new Scanner(System.in);
    String source = input.nextLine();
    return source;
  }

  public static Boolean copyFile(String source, String target) {
    Path sourcePath = Paths.get(source);
    Path targetPath = Paths.get(target);
    try {
      Files.copy(sourcePath, targetPath, REPLACE_EXISTING);
      return true;
    } catch (IOException e) {
      return false;
    }
  }

  public static void main(String[] args) {
    System.out.println("Please state which file to copy and to where");
    String source = input();
    String target = input();
    System.out.println("Copy was successful: " + copyFile(source, target));
  }

}
