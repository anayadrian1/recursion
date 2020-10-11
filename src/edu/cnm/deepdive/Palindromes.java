package edu.cnm.deepdive;

/**
 * Tests a given string to determine if it is a palindrome using recursion or iteration.
 */
public class Palindromes {

  /**
   * Tests a string to determine if it is a palindrome using recursion.
   * @param phrase The word checked
   * @return If the string is single character or is a palindrome.
   */
  public static boolean testRecursive(String phrase) {
    return phrase.length() <= 1 || phrase.charAt(0) == phrase.charAt(phrase.length() - 1)
        && testRecursive(phrase.substring(1, phrase.length() - 1));
  }

  /**
   * Takes a string and removes all special characters, also making the string lowercase.
   * @param word String to be modified.
   * @return The modified version of the string without any special characters and in lowercase.
   */
  public static boolean testDenormalized(String word) {
    String denormal = word.replaceAll("[\\W_]+", "").toLowerCase();
    return testRecursive(denormal);
  }

  /**
   * Tests a string to determine if it is a palindrome using iteration.
   * @param phrase The string checked
   * @return If the string is a palindrome.
   */
  public static boolean testIterative(String phrase) {
    for (int i = 0; i < phrase.length(); i++) {
      if (phrase.charAt(i) != phrase.charAt(phrase.length() - i - 1)) {
        return false;
      }
    }
    return true;
  }
}
