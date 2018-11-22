package countLetters;

import java.util.HashMap;

public class CountLetters {

  public HashMap<Character, Integer> letterCounter(String input) {
    HashMap<Character, Integer> output = new HashMap<>();
    for (int i = 0; i < input.length(); i++) {
      if(!output.containsKey(input.charAt(i))) {
        output.put(input.charAt(i), 1);
      } else {
        output.replace(input.charAt(i), output.get(input.charAt(i)), output.get(input.charAt(i)) + 1);
      }
    }
    return output;
  }

}
