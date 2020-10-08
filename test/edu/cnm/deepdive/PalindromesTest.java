package edu.cnm.deepdive;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class PalindromesTest {

  static final String[] inputValues = {
      "radar",
      "sonar",
      "abba",
      "abb",
      "x",
      ""
  };

  static final boolean[] expectedValues = {
      true,
      false,
      true,
      false,
      true,
      true
  };

  static final String[] testValues = {
      "radar",
      "Radar",
      "A man, a plan, a canal - Panama!",
      "A man, a plan, a dam - Hoover!",
      "aBbA"
  };

  static final boolean[] actualValues = {
      true,
      true,
      true,
      false,
      true
  };

  @Test
  void computeRecursive() {
    for (int i = 0; i < inputValues.length; i++) {
      assertEquals(expectedValues[i], Palindromes.testRecursive(inputValues[i]));
    }
  }

  @Test
  void testDenormalized() {
    for (int i = 0; i < testValues.length; i++) {
      assertEquals(actualValues[i], Palindromes.testDenormalized(testValues[i]));
    }
  }

  @Test
  void testIterative() {
    for (int i = 0; i < inputValues.length; i++) {
      assertEquals(expectedValues[i], Palindromes.testIterative(inputValues[i]));
    }
  }
}