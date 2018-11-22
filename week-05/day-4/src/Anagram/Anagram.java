package Anagram;

import java.util.Arrays;

public class Anagram {

  public boolean checkIfAnagram(String input1, String input2) {
    input1 = input1.replaceAll(" ", "");
    input2 = input2.replaceAll(" ", "");
    if(input1.length() != input2.length()) {
      return false;
    } else {
      return Arrays.equals(input1.toLowerCase().toCharArray(), input2.toLowerCase().toCharArray());
    }
  }

}
