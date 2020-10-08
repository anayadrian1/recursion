package edu.cnm.deepdive;

import static org.junit.jupiter.api.Assertions.*;

import java.math.BigInteger;
import org.junit.jupiter.api.Test;

class FactorialsTest {

  static final int[] inputValues = {
      0,
      1,
      5,
      10,
      13
  };

  static final long[] expectedValues = {
      1,
      1,
      120,
      3628800,
      6227020800L
  };

  @Test
  void computeRecursive() {
    for (int i = 0; i < inputValues.length; i++) {
/*
      int input = inputValues[i];
      long expected = expectedValues[i];
      long actual = Factorials.computeRecursive(input);
      assertEquals(expected, actual);
*/

      assertEquals(expectedValues[i],
          Factorials.computeRecursive(BigInteger.valueOf(inputValues[i])).longValue());
    }
  }

  @Test
  void computeRecursive_exception() {
    assertThrows(IllegalArgumentException.class,
        () -> Factorials.computeRecursive(BigInteger.ONE.negate()));
  }

  @Test
  void computerIterative() {
    for (int i = 0; i < inputValues.length; i++) {
      assertEquals(expectedValues[i], Factorials.computeIterative(inputValues[i]));
    }
  }

  @Test
  void computeIterative_exception() {
    assertThrows(IllegalArgumentException.class, () -> Factorials.computeIterative(-1));
  }
}
