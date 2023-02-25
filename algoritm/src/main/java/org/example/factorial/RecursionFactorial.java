package org.example.factorial;

import java.math.BigInteger;

public class RecursionFactorial {


    public static BigInteger recursionFactorial(int x) {


        if (x == 1 || x == 0) {
//            return new BigInteger(String.valueOf(1));
            return BigInteger.ONE;
        } else {
            return BigInteger.valueOf(x).multiply(recursionFactorial(x - 1));

        }
    }
}
