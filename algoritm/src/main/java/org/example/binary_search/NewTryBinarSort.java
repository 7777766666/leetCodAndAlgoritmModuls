package org.example.binary_search;

import java.util.Arrays;

public class NewTryBinarSort {


    public static void main(String[] args) {
        int[] arr = {-5, 2, 0, 66, -7, 33, -33, 88, 99, 88, 99, 6};
//        int[] arr = {1, 5, 6, 6, 4, 9, 9, 3};
        System.out.println(Arrays.toString(sort(arr, 0, arr.length - 1)));
//  6 2 3 4 5 9

    }

    private static int[] sort(int[] x, int left, int right) {

        if (left >= right) {
            return x;
        }

        int leftIndex = left;
        int rightIndex = right;

        int index = leftIndex + (rightIndex - leftIndex) / 2;
        int pivot = x[index];

        while (leftIndex <= rightIndex) {
            while (x[leftIndex] < pivot) {
                leftIndex++;
            }
            while (x[rightIndex] > pivot) {
                rightIndex--;
            }
            if (leftIndex < rightIndex) {
                int temp = x[leftIndex];
                x[leftIndex] = x[rightIndex];
                x[rightIndex] = temp;
                leftIndex++;
                rightIndex--;
            } else if (leftIndex == rightIndex) {
                leftIndex++;
                rightIndex--;
            }
        }

        if (right > leftIndex) {
            sort(x, leftIndex, right);
        }

        if (left < rightIndex) {
            sort(x, left, rightIndex);
        }
        return x;
    }


}
