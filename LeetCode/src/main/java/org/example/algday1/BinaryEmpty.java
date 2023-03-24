package org.example.algday1;

public class BinaryEmpty {

    public static void main(String[] args) {
        int[] arr = {1, 3, 5, 6};
        System.out.println(searchInsert(arr, 7));


    }


    public static int searchInsert(int[] nums, int target) {

        if (nums.length == 0) {
            return 0;
        }
        if (nums.length == 1) {
            return (target == nums[0] || target < nums[0]) ? 0 : 1;
        }
        int leftIndex = 0;
        int rightIndex = nums.length - 1;
        int left = nums[leftIndex];
        int right = nums[rightIndex];
        int pivotIndex = (leftIndex + rightIndex) / 2;
        int pivotInt = nums[pivotIndex];

        if (pivotInt == target) {
            return pivotIndex;
        }


        if (target < left || target > right) {
            return (target < left) ? 0 : nums.length;
        }
        while (right - left != 0 ) {

            if (pivotInt == target) {
                return pivotIndex;
            }
            if (pivotInt > target) {
                if ( target > nums[pivotIndex - 1]) {
                    return pivotIndex;
                }else {
                    rightIndex = pivotIndex - 1;
                    right = nums[rightIndex];



                }
            } else {
                    if (target < nums[pivotIndex + 1]) {
                        return pivotIndex + 1;
                    } else {
                        leftIndex = pivotIndex + 1;
                        left = nums[leftIndex];
                    }

            }
            pivotIndex = (leftIndex + rightIndex) / 2;
            pivotInt = nums[pivotIndex];
        }
        if (pivotInt == target) {
            return pivotIndex;
        }

        return (pivotInt < target) ? nums.length : 0;
    }
}
