package org.example.algday1;

import java.util.Arrays;

public class Binary {

    int[] a;

    public Binary(int[] a) {
        this.a = a;

    }

    private static final int[] arr = {-1, 0, 3, 5, 9, 12, 44 };
    private static Binary binary = new Binary(arr);

    public int index(int[] arr, int target) {
       return index2(arr, target, 0, arr.length);
    }

    private int index2(int[] x, int target, int left, int right) {
        int index = (left + right) / 2;
        int pivot = x[index];
        if (right - left == 1 && target!= pivot) {
            return -1;
        }
        if (target == pivot) {
            System.out.println(pivot + "  pivot");
            return pivot;
        }

        if (pivot < target) {
            index2(x, target, index, right);
        }
        if (pivot > target) {
            index2(x, target, left, index);
        }
        return pivot;
    }


    public static void main(String[] args) {

        System.out.println(Arrays.toString(arr));
        System.out.println(Binary.binary.index(arr, 11));



    }

}
