package org.example.charExpression;

import java.util.Arrays;

public class arr {
    public static void main(String[] args) {

        int[] arr =  {1,3,5,6,9,11,24};  //4, 10
        int a =4, b =10;
        System.out.println(Arrays.toString(getSubArrayBetween(arr, a, b)));

    }


    public static int[] getSubArrayBetween(int[] numbers, int start, int end) {
        int w = 0;
        int z = 0;

        for (int i = 0; i < numbers.length; i++) {
            if (numbers[i] >= start){

            }
        }
        return new int[1];
    }

}
