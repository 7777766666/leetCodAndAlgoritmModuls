package org.example.day5;

import java.util.Arrays;

public class MaxProfit121 {

    public static void main(String[] args) {

        int[] arr = {7, 1, 5, 3, 6, 4};
        System.out.println(Arrays.toString(arr));


        int[] arr2 = {1, 2, 4, 2, 5, 7, 2, 4, 9, 0};
//        arr2 = sortStream(arr2);

        System.out.println(maxProfit(arr2) + "  best");


    }

    public static int maxProfit(int[] prices) {

        if (prices.length < 2) {
            return 0;
        }
        if (prices.length == 2) {
            return (prices[1] - prices[0] > 0) ? prices[1] - prices[0] : 0;
        }

        int result = 0;
        int left = 0;
        int right = prices.length - 1;
        while (left != right) {
            if (prices[left] >= prices[right]) {
                if (result < prices[left + 1] - prices[left]) {
                    result = prices[left + 1] - prices[left];
                }
                if ( prices[left] < prices[left + 1]) {
                    prices[left + 1] = prices[left];
                }
                left++;
            } else {
                if (result < prices[right] - prices[right - 1]) {
                    result = prices[right] - prices[right - 1];
                }
                if (result < prices[right] - prices[left]) {    //надо проверить ниже, если слева больше, то не надо
                    result = prices[right] - prices[left];
                }
                if (prices[right -1] < prices[right]){
                    prices[right -1] = prices[right];
                }

                right--;
            }
        }
        return result;
    }
}


//    public static int maxProfit(int[] prices) {
//        if (prices.length < 2) {
//            return 0;
//        }
//        if (prices.length == 2) {
//            return (prices[1] - prices[0] > 0) ? prices[1] - prices[0] : 0;
//        }
//
//        int result = 0;
//        int diff = 0;
//        int left = 0;
//        int right = prices.length - 1;
//
//        while (left != right)
//            if (prices[left] > prices[right]) {
//                if (left + 1 == right) {
//                    return diff;
//                }
//                left++;
//            } else {
//                diff = prices[right] - prices[left];
//                if (result < diff) {
//                    result = diff;
//                }
//
//                if (prices[left] >= prices[left + 1]) {
//                    left++;
//                } else {
//                    if (prices[left + 1] - prices[left] > result) {
//                        result = prices[left + 1] - prices[left];
//                    }
//                    right--;
//                }
//            }
//        return result;
//    }
//
//}
//    private static void view(int[][] arr) {
//        for (int i = 0; i < arr.length; i++) {
//            for (int j = 0; j < arr.length; j++) {
//                System.out.print(arr[i][j] + "  " );
//            }
//            System.out.print("\n");
//        }
//    }
//    private static void view2(int[][] arr) {
//        for (int i = 0; i < arr.length; i++) {
//            System.out.println(Arrays.toString(arr[i]));
//        }
//    }
//
//
//    public static int[] sort(int[] arr) {
//        int[] temp = new int[1];
//        for (int i = 0; i < (arr.length / 2); i++) {
//            for (int j = 0; j < arr.length - 1; j++) {
//                if (arr[j] > arr[j + 1]) {
//                    temp[0] = arr[j];
//                    arr[j] = arr[j + 1];
//                    arr[j + 1] = temp[0];
//
//                }
//            }
//        }
//        return arr;
//    }
//
//    public static int[] sortReq(int[] arr) {
//        return sortReq(arr, 0, arr.length - 1);
//
//    }
//
//    private static int[] sortReq(int[] arr, int left, int right) {
//        if (left <= right) {
//
//        }
//        return arr;
//    }
//
//    private static int[] sortStream(int[] a) {
//        return Arrays.stream(a)
//                .sorted()
//                .toArray();
//    }
//
//
//}