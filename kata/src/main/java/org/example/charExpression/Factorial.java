package org.example.charExpression;

import java.math.BigInteger;

/**
 * Реализуйте метод factorial, вычисляющий факториал заданного натурального числа.
 *
 * Факториал N вычисляется как 1 ⋅ 2 ⋅ ... ⋅ N.
 *
 * Поскольку это очень быстро растущая функция, то даже для небольших N вместимости типов int и long очень скоро
 * не хватит. Поэтому будем использовать BigInteger.
 *
 * Воспользуйтесь предоставленным шаблоном. Декларацию класса, метод main и обработку
 * ввода-вывода добавит проверяющая система.
 */
public class Factorial {


    public static void main(String[] args) {
        int qq = 22;
        String rr = "5555555555555555555";
        BigInteger bigInteger = new BigInteger(String.valueOf(55));
        BigInteger www = new BigInteger(rr);
        System.out.println(www);
        System.out.println(bigInteger + "  big 55");


        int x = 5;

        BigInteger sss = factorial(4);
        System.out.println(sss + "  big factorial");
//        BigInteger.valueOf(factorial(x))
//        System.out.println(BigInteger.factorial(5));

    }

public static BigInteger factorial(int value) {
    BigInteger bigInteger = new BigInteger(String.valueOf(1));
    if (value == 0) {

        return new BigInteger(String.valueOf(value + 1));
    } else {

        for (int i = 1; i <= value; i++) {
            bigInteger = bigInteger.multiply(new BigInteger(String.valueOf(i)));

        }

    }
    return bigInteger;
}

}
