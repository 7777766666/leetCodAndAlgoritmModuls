package org.example.recursion;

public class SumRecursion {

    public static int sumRecursionLol(int[] arr) {
        return sumRecursionLol(arr, arr.length -1);
    }

    private static int sumRecursionLol(int[] arr, int index) {

        if (index == 0) {
            return arr[index];
        } else {
            return  arr[index] + sumRecursionLol(arr, index - 1);

        }
    }
}
