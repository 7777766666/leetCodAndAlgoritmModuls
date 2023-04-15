package Yandex100;

import org.apache.commons.lang3.RandomStringUtils;

import java.io.IOException;
import java.math.BigInteger;

public class Moscow {


    public static void main(String[] args) throws IOException {
        String number = String.join(", ", RandomStringUtils.randomNumeric(1000000).split(""));

        long start = System.currentTimeMillis();
        String test = Moscow.sumBig(number, number);
        long end = System.currentTimeMillis();
        String w = test;
        System.out.println((end - start) + "  Time for code");
    }

    public static String sumBig(String line1, String line2) {
        BigInteger number1 = convertToBigInteger(line1);
        BigInteger number2 = convertToBigInteger(line2);
        BigInteger sum = number1.add(number2);

        String str = sum.toString();
        String[] digits = str.split("");
        String result = "[" + String.join(", ", digits) + "]";

        return result;
    }

    private static BigInteger convertToBigInteger(String line) {
        String[] digits = line.replaceAll("[^\\d]+", "").split("");
        StringBuilder sb = new StringBuilder();
        for (String digit : digits) {
            sb.append(digit);
        }
        return new BigInteger(sb.toString());
    }
}