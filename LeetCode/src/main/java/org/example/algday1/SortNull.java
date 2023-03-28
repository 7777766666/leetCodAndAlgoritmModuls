package org.example.algday1;

public class SortNull {


    public void moveZeroes(int[] nums) {

        int rightIndex = 0;
        int leftIndex = 0;
        if (nums.length > 1) {

            while (leftIndex < nums.length - 1 && nums[leftIndex] != 0) {
                leftIndex++;
            }
            while (leftIndex != nums.length - 1) {
                rightIndex = leftIndex + 1;
                while (rightIndex < nums.length - 1 && nums[rightIndex] == 0) {
                    rightIndex++;
                }
                int temp = nums[leftIndex];
                nums[leftIndex] = nums[rightIndex];
                nums[rightIndex] = temp;
                leftIndex++;
            }
        }
    }

    public static void main(String[] args) {
        int[] arr = {};
        SortNull sortNull = new SortNull();
        sortNull.moveZeroes(arr);
    }

//    public int[] change(int[] arr, int l, int r) {
//        int temp = arr[l];
//        arr[l] = arr[r];
//        arr[r] = temp;
//
//        return arr;
//    }

}

