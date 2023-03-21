package org.example.day5;

import java.util.Arrays;

public class MaxProfit121 {

    public static void main(String[] args) {

        int[] arr = {7, 1, 5, 3, 6, 4};
        System.out.println(Arrays.toString(arr));


        int[] arr2 = {1, 2, 4, 2, 5, 7, 2, 4, 9, 0};
//        arr2 = sortStream(arr2);

        System.out.println(maxProfit(arr2) + "  best");
        System.out.println(maxProfit2(arr2) + "  best not my");


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
                if (prices[right -1] < prices[right]){
                    prices[right -1] = prices[right];
                }
                right--;
            }
        }
        return result;
    }

    public static int maxProfit2(int[] prices) {
        int lsf = Integer.MAX_VALUE;
        int op = 0;
        int pist = 0;

        for(int i = 0; i < prices.length; i++){
            if(prices[i] < lsf){
                lsf = prices[i];
            }
            pist = prices[i] - lsf;
            if(op < pist){
                op = pist;
            }
        }
        return op;
    }

}
