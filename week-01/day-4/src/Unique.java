import java.util.Arrays;

public class Unique {

  public static Boolean containsNull (int[] input) {
    for (int num: input) {
      if (num == 0) {
        return true;
      }
    }
    return false;
  }

  public static String unique (int[] input) {
    int[] temp = new int[input.length];
    int tempIndex = 0;
    for (int i = 0; i < input.length; i++) {
      for (int j = 0; j < temp.length; j++) {
        if (input[i] == temp[j]) {
          break;
        }else if (temp[j] == 0) {
          temp[tempIndex] = input[i];
          tempIndex++;
          break;
        }
      }
    }
    if (containsNull(input)) {
      tempIndex++;
    }
    int[] output = new int[tempIndex];
    for (int i = 0; i < output.length; i++) {
      output[i] = temp[i];
    }
    return Arrays.toString(output);
  }

  public static void main(String[] args) {
    System.out.println(unique(new int[] {1, 11, 34, 11, 52, 61, 1, 34}));
  }

}
