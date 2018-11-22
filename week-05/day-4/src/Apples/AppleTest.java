package Apples;

import static org.junit.Assert.*;

public class AppleTest {

  @org.junit.Test
  public void getApple() {
    Apple greenApple = new Apple();
    assertEquals("green apple", greenApple.getApple());
  }
}
