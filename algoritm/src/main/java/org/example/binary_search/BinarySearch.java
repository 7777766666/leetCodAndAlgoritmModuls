package org.example.binary_search;

import java.util.Arrays;

public class BinarySearch {

    public static int binarySearch(int[] array, int x) {

        int low = 0;
        int high = array.length - 1;
        int z = -100;

        while (low <= high) {
            int med = (low + high) / 2;

            if (array[med] == x) {
                z = med;
                break;
            } else if (array[med] < x) {
                low = med + 1;
            } else {
                high = med - 1;
            }
        }

        if (z == -100) {
            return -1;
        } else {
            return z;
        }
    }
}
