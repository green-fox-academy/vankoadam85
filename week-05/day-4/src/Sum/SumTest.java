package Sum;

import org.junit.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import static org.junit.Assert.*;

public class SumTest {

  @Test
  public void testingSum() {
    Sum sumTest = new Sum();
    ArrayList<Integer> testList1 = new ArrayList<>(Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9));
    assertEquals(45, sumTest.sum(testList1));
  }

  @Test (expected = NullPointerException.class)
  public void advancedSumTesting() {
    Sum sumTest = new Sum();
    ArrayList<Integer> testList2 = new ArrayList<>();
    ArrayList<Integer> testList3 = new ArrayList<>(Arrays.asList(5));
    ArrayList<Integer> testList4 = new ArrayList<>(Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9));
    ArrayList<Integer> testList5 = null;
    assertEquals(0, sumTest.sum(testList2));
    assertEquals(5, sumTest.sum(testList3));
    assertEquals(45, sumTest.sum(testList4));
    assertEquals(null, sumTest.sum(testList5));
  }
}
