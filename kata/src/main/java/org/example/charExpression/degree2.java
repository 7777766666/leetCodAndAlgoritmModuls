package org.example.charExpression;

public class degree2 {

    public static void main(String[] args) {

     int x =-16;
        System.out.println((isPowerOfTwo(x)) + "  !!!");

        System.out.println(Math.pow(2,7));
        System.out.println((Integer.bitCount(256) ) + " BitCount");

        Long xr = 222L;
        byte u = 33;


    }
    public static boolean isPowerOfTwo(int value) {

        return  (Math.abs(value) > 0 && (Math.abs(value) & (Math.abs(value) - 1)) == 0) ? true : false;

    }
}
