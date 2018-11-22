package Fibonacci;

import org.junit.Test;

import static org.junit.Assert.*;

public class FibonacciTest {

  Fibonacci fibonacciTest = new Fibonacci();

  @Test
  public void fibonacci() {
    assertEquals(1, fibonacciTest.fibonacci(1));
    assertEquals(1, fibonacciTest.fibonacci(2));
    assertEquals(2, fibonacciTest.fibonacci(3));
    assertEquals(3, fibonacciTest.fibonacci(4));
    assertEquals(5, fibonacciTest.fibonacci(5));
    assertEquals(8, fibonacciTest.fibonacci(6));
    assertEquals(13, fibonacciTest.fibonacci(7));
    assertEquals(21, fibonacciTest.fibonacci(8));
  }

}
