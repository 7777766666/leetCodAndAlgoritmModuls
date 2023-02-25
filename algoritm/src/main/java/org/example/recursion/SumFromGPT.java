package org.example.recursion;

public class SumFromGPT {

    public static int sumArrayRecursive(int[] arr) {
        return sumArrayRecursive(arr, arr.length -1);
    }

    private static int sumArrayRecursive(int[] arr, int index) {

        if (index == 0) {
            return arr[index];
        } else {
            return arr[index] + sumArrayRecursive(arr, index - 1);
        }
    }
}
