import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;

public class Logs {

  public static ArrayList<String> readFile () {
    Path logSource = Paths.get("log.txt");
    try {
      ArrayList<String> log = (ArrayList<String>) Files.readAllLines(logSource);
      return log;
    } catch (IOException e) {
      System.out.println("File not found.");
      return null;
    }
  }

  public static String[] ipAddress (ArrayList<String> log){
    String[] ipList = new String[log.size()];
    for (int i = 0; i < log.size() ; i++) {
      ipList[i] = log.get(i).substring(27, 38);
    }
    return ipList;
  }

  public static double getPost (ArrayList<String> log) {
    double post = 0;
    double get = 0;
    for (int i = 0; i < log.size() ; i++) {
      if (log.get(i).substring(41, 45).equals("POST")) {
        post++;
      } else if (log.get(i).substring(41, 45).equals("GET ")) {
        get++;
      }
    }
    return get / post;
  }

  public static void main(String[] args) {
    for (int i = 0; i < readFile().size() ; i++) {
    System.out.println(ipAddress(readFile())[i]);
    }
    System.out.println("GET \\ POST ratio is: " + getPost(readFile()));
  }
}
