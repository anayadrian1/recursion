package edu.cnm.deepdive;

public class Palindromes {

  public static boolean testRecursive(String phrase) {
    return phrase.length() <= 1 || phrase.charAt(0) == phrase.charAt(phrase.length() - 1)
        && testRecursive(phrase.substring(1, phrase.length() - 1));
  }

  public static boolean testDenormalized(String word) {
    String denormal = word.replaceAll("[\\W_]+", "").toLowerCase();
    return testRecursive(denormal);
  }

  public static boolean testIterative(String phrase) {
    for (int i = 0; i < phrase.length(); i++) {
      if (phrase.charAt(i) != phrase.charAt(phrase.length() - i - 1)) {
        return false;
      }
    }
    return true;
  }
}
