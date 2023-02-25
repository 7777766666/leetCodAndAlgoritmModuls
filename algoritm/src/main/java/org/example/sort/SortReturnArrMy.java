package org.example.sort;

public class SortReturnArrMy {

    public static int[] sortReturnArrMy(int[] arr) {
        return sort(arr, 0, arr.length - 1);
    }

    private static int[]  sort(int[] arr, int left, int right) {

        if (left < right) {

            int i = left, j = right;
            int pivot = (left + right) / 2;


            while (i <= j){

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
                sort(arr, i, right);
                sort(arr, left, j);

            }


        }

        return arr;

    }


}
