package org.example.Sort2;

public class MaxProfit {

    public static void main(String[] args) {
        int[] arr = {7, 2, 4, 1};
        System.out.println(maxProfit(arr));
    }

    public static int maxProfit(int[] prices) {

        int l = 0;
        int r = 1;
        int diff = 0;
        while (r != prices.length) {
            if (prices[l] >= prices[r]) {
                l = r;
            } else {
                diff = Math.max(diff, prices[r] - prices[l]);
            }
            r++;
        }
        return diff;
    }
}