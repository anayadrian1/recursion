package edu.cnm.deepdive;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

/**
 * Test class to test the code from {@link Palindromes} to check if strings are palindromes.
 */
class PalindromesTest {

  private static final String[] inputValues = {
      "radar",
      "sonar",
      "abba",
      "abb",
      "x",
      ""
  };

  private static final boolean[] expectedValues = {
      true,
      false,
      true,
      false,
      true,
      true
  };

  private static final String[] testValues = {
      "radar",
      "Radar",
      "A man, a plan, a canal - Panama!",
      "A man, a plan, a dam - Hoover!",
      "aBbA"
  };

  private static final boolean[] actualValues = {
      true,
      true,
      true,
      false,
      true
  };

  /**
   * Tests for a palindrome using recursion from {@link Palindromes#testRecursive(String)}
   */
  @Test
  void computeRecursive() {
    for (int i = 0; i < inputValues.length; i++) {
      assertEquals(expectedValues[i], Palindromes.testRecursive(inputValues[i]));
    }
  }

  /**
   * Tests to see if the string is properly converted to all lowercase with no special characters
   * using {@link Palindromes#testDenormalized(String)}
   */
  @Test
  void testDenormalized() {
    for (int i = 0; i < testValues.length; i++) {
      assertEquals(actualValues[i], Palindromes.testDenormalized(testValues[i]));
    }
  }

  /**
   * Tests for a palindrome using iteration from {@link Palindromes#testIterative(String)}
   */
  @Test
  void testIterative() {
    for (int i = 0; i < inputValues.length; i++) {
      assertEquals(expectedValues[i], Palindromes.testIterative(inputValues[i]));
    }
  }
}