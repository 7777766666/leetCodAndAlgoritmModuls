package org.example.multiplicationTable;

public class MultiplicationTableArray {
    public static void multiplicationTable(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr.length; j++) {
                System.out.print((arr[i] * arr[j]) + " ");
            }
            System.out.println("");
        }
        System.out.println("");
    }
}
