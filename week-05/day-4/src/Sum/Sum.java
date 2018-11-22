package Sum;

import java.util.ArrayList;

public class Sum {

  public int sum(ArrayList<Integer> listToSum) {
    int sumOfListElements = 0;
    for (Integer number : listToSum) {
      sumOfListElements += number;
    }
    return sumOfListElements;
  }

}
