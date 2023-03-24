package org.example.algday1;

import java.util.Arrays;

public class Square {

    public static void main(String[] args) {
        int[] arr = {};
        Square square = new Square();
        System.out.println(Arrays.toString(square.sortedSquares(arr)));
    }

    public int[] sortedSquares(int[] nums) {

        return Arrays.stream(nums)
                .map(x -> x * x)
                .sorted()
                .toArray();
    }
}
