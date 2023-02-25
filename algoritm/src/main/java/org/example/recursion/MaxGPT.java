package org.example.recursion;

public class MaxGPT {

    public static int max(int[] arr) {
        return findMax( arr, arr.length - 1 );
    }

    private static int findMax(int[] arr, int n) {
        if (n == 1) { // Базовый случай: массив состоит из одного элемента
            return arr[0];
        }
        int max = findMax(arr, n - 1); // Рекурсивный случай: находим максимум для подмассива
        if (arr[n - 1] > max) { // Сравниваем максимум с последним элементом массива
            return arr[n - 1]; // Если последний элемент больше, возвращаем его
        } else {
            return max; // В противном случае, возвращаем максимум из подмассива
        }
    }


}
