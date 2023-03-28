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

        k = k % nums.length;
        reverse(nums, nums.length - k, nums.length - 1);
        reverse(nums, 0, nums.length  -1 - k);
        reverse(nums, 0, nums.length - 1);
    }

    public static void reverse(int[] nums, int leftIndex, int rightIndex) {
        int[] temp = new int[1];
        while (rightIndex - leftIndex >= 0) {
            temp[0] = nums[leftIndex];
            nums[leftIndex++] = nums[rightIndex];
            nums[rightIndex--] = temp[0];
        }
    }
}

