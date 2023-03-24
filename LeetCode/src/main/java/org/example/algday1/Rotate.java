package org.example.algday1;

import java.util.Arrays;

public class Rotate {

    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5, 6, 7};
        int x = 3;
        Rotate rotate = new Rotate();
        rotate.rotate(arr, x);

    }

    public void rotate(int[] nums, int k) {

        int[] arr = new int[nums.length];

        System.arraycopy(nums, nums.length - k, arr, 0, k);
        System.arraycopy(nums, 0, arr, k, nums.length - k );
        nums = arr;
        System.out.println(Arrays.toString(nums));



    }
}
