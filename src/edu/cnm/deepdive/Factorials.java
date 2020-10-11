package edu.cnm.deepdive;

import java.math.BigInteger;

/**
 * Takes a number (n) and returns the factorial of given number using either recursion or
 * iteration.
 */
public class Factorials {

  /**
   * Computes the factorial value of a number using recursion. {@code BigInteger} allows values
   * greater than twenty for the parameter.
   * @param n Number to use in the factorial recursion
   * @return Factorial of given number
   */
  public static BigInteger computeRecursive(int n) {
    if (n < 0) {
      throw new IllegalArgumentException();
    }
    return (n <= 1) ?
        BigInteger.ONE :
        computeRecursive(n -1).multiply(BigInteger.valueOf(n));
  }

  /**
   * Computes the factorial value of a number using iteration.
   * @param n Number to use in the factorial iteration
   * @return Factorial of given number
   */
  public static long computeIterative(int n) {
    if (n < 0) {
      throw new IllegalArgumentException();
    }
    long factorial = 1;
    for(int i = n; i > 0; i--) {
      factorial *= i;
    }
    return factorial;
  }

}
