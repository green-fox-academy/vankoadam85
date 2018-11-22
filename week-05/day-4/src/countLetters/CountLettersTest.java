package countLetters;

import org.junit.Test;

import static org.junit.Assert.*;

public class CountLettersTest {



  @Test
  public void testLetterCounter() {
    CountLetters counterTest = new CountLetters();
    assertEquals(3,     (int)counterTest.letterCounter("almafa").get('a'));
    assertEquals(1,     (int)counterTest.letterCounter("almafa").get('l'));
    assertEquals(1,     (int)counterTest.letterCounter("almafa").get('m'));
    assertEquals(1,     (int)counterTest.letterCounter("almafa").get('f'));
  }

  @Test (expected = NullPointerException.class)
  public void nullPointerTestLetterCounter() {
    CountLetters counterTest = new CountLetters();
    assertEquals(0,     (int)counterTest.letterCounter("almafa").get('z'));


  }
}
