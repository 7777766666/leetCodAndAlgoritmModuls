package org.example.charExpression;

/**
 * Реализовать метод, который будет принимать два числа, выражающие возраст людей, и возвращать разницу в возрасте.
 */
public class ageDiffReturn {

    public static void main(String[] args) {

        byte a = 5;
        byte b = 1;

        System.out.println(getAgeDiff(a, b));

    }

    public static byte getAgeDiff(byte age1, byte age2) {
        return (byte) (age1 >= age2 ? age1 - age2 : age2 - age1);

    }
}
