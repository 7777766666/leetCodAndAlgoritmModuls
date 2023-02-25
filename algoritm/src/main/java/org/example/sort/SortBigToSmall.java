package org.example.sort;

public class SortBigToSmall {

    public static int[] sortBigToSmall(int[] arr) {
        return sort(arr, 0, arr.length - 1);
    }

    private static int[] sort(int[] arr, int left, int right) {

        if (left < right) {

            int pivot = (left + right) / 2;
            int indexPivot = arr[pivot];
            int i = left;
            int w = right;

            while (i <= w) {
                while (arr[i] > indexPivot) {
                    i++;
                }
                while (arr[w] < indexPivot) {
                    w--;
                }
                if (i <= w) {
                    int temp = arr[i];
                    arr[i] = arr[w];
                    arr[w] = temp;
                    i++;
                    w--;
                }
            }
            sort(arr, left, w);
            sort(arr, i, right);
        }
        return arr;
    }
}
