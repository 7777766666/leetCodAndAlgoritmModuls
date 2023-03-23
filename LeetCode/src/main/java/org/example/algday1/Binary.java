package org.example.algday1;

import java.util.Arrays;

public class Binary {

    int[] a;

    public Binary(int[] a) {
        this.a = a;

    }

    private static final int[] nums = {5};
    private static Binary binary = new Binary(nums);

    public int index(int[] arr, int target) {
        return index2(arr, target, 0, arr.length);
    }

    private int index2(int[] nums, int target, int left1, int right1) {




        int left = 0;
        int right = nums.length -1;

        if (target < nums[left] || target > nums[right]) {
            return -1;
        }

        if (nums[left] == target ) {
            return left;
        }
        if (nums[right] == target){
            return right;
        }
        int index = 0;
        int pivot = 0;

        while ((right - left) != 1 ) {

            index = (left + right) / 2;
            pivot = nums[index];

            if (target == pivot) {
                return index;
            }

            if (pivot < target) {
                left = index;
            } else {
                right = index;
            }

            if (right - left == 2){
                if (target != nums[right - 1]) {
                    return -1;
                }else {
                    return right - 1;
                }
            }
        }
        return -1;
    }



    public static void main(String[] args) {

        System.out.println(Arrays.toString(nums));
        System.out.println(Binary.binary.index(nums, -5));



    }

}
