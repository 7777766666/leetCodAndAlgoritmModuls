package org.example.multiplicationTable;

public class FromGPT {

    public static void fromGPT(int[] arr, int i, int j) {
        if (i >= arr.length) {
            System.out.println("");
            return;
        }
        if (j >= arr.length) {
            fromGPT(arr, i + 1, 0);
            return;
        }
        System.out.print((arr[i] * arr[j]) + " ");
        fromGPT(arr, i, j + 1);
    }
}
