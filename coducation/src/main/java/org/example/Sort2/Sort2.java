package org.example.Sort2;

import java.util.Arrays;

public class Sort2 {

    public static void main(String[] args) {

        int[] arr = {4, 0, -7, 2, 2, 9};
        sortInsert(arr);
        Arrays.sort(arr);

        System.out.println((Arrays.toString(arr)) + "  sortInsert");

    }

    private static void sortInsert(int[] x) {

        for (int i = 1; i < x.length; i++) {
            int j = i;
            int cur = x[i];
            while (j > 0 && x[j - 1] > x[j]) {
                x[j] = x[j - 1];
                j--;
            }
            x[j] = cur;
        }

    }

}
