package org.example.sort;

public class MyTrySort {

    public static void myTrySort(int [] arr) {
        myTrySort(arr, 0, arr.length -1);

    }

    private static void myTrySort(int[] arr, int left, int right){

        if (left < right) {

            int pivot = (left + right) / 2;
            int index = arr[pivot];
            int i = left;
            int j = right;
            while (i <= j) {
                while (arr[i] < arr[pivot]) {
                    i++;
                }
                while (arr[j] > arr[pivot]) {
                    j--;
                }
                if (i <= j) {
                    int temp = arr[i];
                    arr[i] = arr[j];
                    arr[j] = temp;
                    i++;
                    j--;
                }

            }
            myTrySort(arr, left, j);
            myTrySort(arr, i, right);
        }
    }
}
