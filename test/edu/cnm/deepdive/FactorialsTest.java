package edu.cnm.deepdive;

import static org.junit.jupiter.api.Assertions.*;

import java.math.BigInteger;
import org.junit.jupiter.api.Test;

/**
 * Test class to test the code from {@link Factorials} for their respective factorial value.
 */
class FactorialsTest {

  private static final int[] inputValues = {
      0,
      1,
      5,
      10,
      13
  };

  private static final long[] expectedValues = {
      1,
      1,
      120,
      3628800,
      6227020800L
  };

  /**
   * Tests for the factorial values using the {@link Factorials#computeRecursive(int)}
   */
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
          Factorials.computeRecursive(inputValues[i]).longValue());
    }
  }

  /**
   * Tests for the exception thrown from {@link Factorials#computeRecursive(int)}
   */
  @Test
  void computeRecursive_exception() {
    assertThrows(IllegalArgumentException.class,
        () -> Factorials.computeRecursive(-1));
  }

  /**
   * Tests for the factorial values using the {@link Factorials#computeIterative(int)}
   */
  @Test
  void computerIterative() {
    for (int i = 0; i < inputValues.length; i++) {
      assertEquals(expectedValues[i], Factorials.computeIterative(inputValues[i]));
    }
  }

  /**
   * Tests for the exception thrown from {@link Factorials#computeIterative(int)}
   */
  @Test
  void computeIterative_exception() {
    assertThrows(IllegalArgumentException.class, () -> Factorials.computeIterative(-1));
  }
}
