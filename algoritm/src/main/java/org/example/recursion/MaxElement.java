package org.example.recursion;

public class MaxElement {

    public static int maxElementSource(int[] arr) {
        return findMax(arr, arr.length -1);
    }

    private static int findMax(int[] arr, int n) {
        if (n == 1) {
            return arr[0];
        } else {
            int max = findMax(arr, n - 1);
            int result = Math.max(arr[n], max);
            return result;
        }

    }
}



//    private static int findMax(int[] arr, int n) {
//        if (n == 1) { // Базовый случай: массив состоит из одного элемента
//            return arr[0];
//        }
//        int max = findMax(arr, n - 1); // Рекурсивный случай: находим максимум для подмассива
//        int maxInt = Math.max(max, arr[n - 1]);// Возвращаем максимум между найденным максимумом и последним элементом
//        return maxInt;
//    }