package org.example.factorial;

import java.math.BigInteger;

public class FactorialСycle {

    public static BigInteger factorial(BigInteger x) {

        int z = x.intValue();


        BigInteger factorial = BigInteger.valueOf(1);
            for (int i = 0; i < z ; i++) {
                factorial = factorial.multiply(BigInteger.valueOf(i + 1));
            }


//        BigInteger bigFactorial = new BigInteger(String.valueOf(factorial));
//        return bigFactorial;
    return factorial;
    }

}
