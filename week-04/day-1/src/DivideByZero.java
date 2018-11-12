import java.util.Scanner;

public class DivideByZero {

  public static int input (){
    Scanner in = new Scanner(System.in);
    System.out.println("Please input the number to divide with!");
    return in.nextInt();
  }

  public static void main(String[] args) {
    int divisor = input();
    try{
      int result  = 10 / divisor;
      System.out.println("The result is: " + result);
    } catch (Exception e) {
      System.out.println("fail");
    }
  }
}
