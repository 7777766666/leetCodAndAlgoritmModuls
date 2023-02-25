package org.example.multiplicationTable;

public class TryAgainMultiTable {

    public static void tryAgainMultiTable(int[] arr) {
        multi(arr, 0, 0, arr.length);
    }

    private static void multi(int [] arr, int i, int j, int w) {

        if (w == 0){
        }
        else if (w == 1) {
            System.out.println((int) Math.pow(arr[0], 2));
        }
        else if (w == (i + 1) && j == w ) {
            System.out.print("\n");
        } else {
            if (j == w) {
                i++;
                j = 0;
                System.out.print("\n");
            }
            System.out.print(arr[i] * arr[j++] + " ");

            multi(arr, i, j, w);
        }
    }
}
