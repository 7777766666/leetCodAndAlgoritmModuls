package org.example.sort;

public class SortArrayBySmall {

    public int[] sortArrayBySmall(int[] arr) {

        int temp = 0;
        for (int i = 0; i < arr.length - 1; i++) {

            for (int j = i + 1; j < arr.length; j++) {

                if (arr[i] > arr[j]) {
                    temp = arr[i];
                    arr[i] = arr[j];
                    arr[j] = temp;
                }
            }
        }
        return arr;
    }
}
