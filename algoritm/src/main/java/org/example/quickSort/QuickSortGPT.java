package org.example.quickSort;

public class QuickSortGPT {

    public static void quickSort(int[] arr) {
        quickSort(arr, 0, arr.length - 1);
    }

    public static void quickSort(int[] arr, int low, int high) {
        if (low < high) {
            // выбираем опорный элемент посередине массива
            int pivotIndex = (low + high) / 2;
            int pivotValue = arr[pivotIndex];
            // разделяем массив на две части и рекурсивно сортируем каждую
            int i = low, j = high;
            while (i <= j) {
                while (arr[i] < pivotValue) {
                    i++;
                }
                while (arr[j] > pivotValue) {
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
            quickSort(arr, low, j);
            quickSort(arr, i, high);
        }
    }
}