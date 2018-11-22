package Fibonacci;

public class Fibonacci {

  public int  fibonacci(int n) {
    if (n > 1){
      return fibonacci(n - 1) + fibonacci(n - 2);
    }
    return n;
  }

}
