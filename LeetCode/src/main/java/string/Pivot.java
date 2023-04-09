package string;

import java.util.Arrays;

public class Pivot {

    public static void main(String[] args) {
        int[] lol = {9, 3, 9, 4, 0, 9, 9, 55, -9, 444, -333, -456, -333};
        int[] lol1 = {1, 7, 3, 6, 5, 6};
        Pivot pivot = new Pivot();
        int pivotIndex = pivot.pivotIndex(lol1);
    }

    public int pivotIndex(int[] nums) {

        if (nums.length == 1) {
            return -1;
        }

        int leftIndex = 0;
        int rightIndex = nums.length - 1;


        int[] sortArr = sort(nums, 0, nums.length - 1);
        System.out.println(Arrays.toString(sortArr));


        return 777;
    }

    public static int[] sort(int[] x, int l, int r) {

        int indexL = l;
        int indexR = r;
        while (indexL < indexR) {
            int pivot = x[(indexL + indexR) / 2];

            while (x[indexL] < pivot) {
                indexL++;
            }
            while (x[indexR] > pivot) {
                indexR--;
            }
            if (indexL < indexR) {
                int temp = x[indexL];
                x[indexL] = x[indexR];
                x[indexR] = temp;
                indexL++;
                indexR--;
            } else {
                indexL++;
                indexR--;
            }
            sort(x, l, indexR);
            sort(x, indexL, r);


        }


        return x;
    }


}

