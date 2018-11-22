package Anagram;

import org.junit.Test;

import static org.junit.Assert.*;

public class AnagramTest {

  Anagram anagramTester = new Anagram();

  @Test
  public void checkIfAnagram() {
    assertTrue(anagramTester.checkIfAnagram("alma", "alma"));
    assertFalse(anagramTester.checkIfAnagram("alma", "körte"));
    assertFalse(anagramTester.checkIfAnagram("alma", "maal"));
    assertFalse(anagramTester.checkIfAnagram("alma", "mamla"));
  }

  @Test
  public void checkArgument() {
    assertFalse(anagramTester.checkIfAnagram("alma", "10"));
  }


    @Test (expected = NullPointerException.class)
  public void checkNull() {
    assertTrue(anagramTester.checkIfAnagram(null, null));
  }
}
