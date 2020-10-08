package edu.cnm.deepdive;

import java.math.BigInteger;

public class Factorials {

  public static BigInteger computeRecursive(BigInteger n) {
    if (n.compareTo(BigInteger.ZERO) < 0) {
      throw new IllegalArgumentException();
    }
    return (n.compareTo(BigInteger.ONE) <= 0) ?
        BigInteger.ONE :
        (n.multiply(computeRecursive(n.subtract(BigInteger.ONE))));
  }

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
