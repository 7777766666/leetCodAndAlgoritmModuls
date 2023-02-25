package org.example.multiplicationTable;

public class MultiplicationTableRecursion {

    public static void multiplicationTableRecursion(int[] arr) {
        logic(arr, 0, 0, arr.length);
    }

    private static void logic(int[] arr, int i, int j, int w) {

        if (i == (w - 1) && j == (i + 1)) {
            System.out.print("\n");
        } else {
            if (j == w) {
                i++;
                j = 0;
                System.out.print("\n");
            }
            System.out.print((arr[i] * arr[j++]) + " ");

            logic(arr, i, j, w);
        }
    }
}
