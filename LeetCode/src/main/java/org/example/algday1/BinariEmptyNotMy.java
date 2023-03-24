package org.example.algday1;

public class BinariEmptyNotMy {
    public static void main(String[] args) {
        int[] arr = {1, 3, 5, 6};
        BinariEmptyNotMy binariEmptyNotMy = new BinariEmptyNotMy();
        System.out.println(binariEmptyNotMy.searchInsert(arr, 7));


    }

    public int searchInsert(int[] nums, int target) {
        int start = 0;
        int end = nums.length - 1;

        while (start <= end) {
            int mid = start + (end - start) / 2;
            if (nums[mid] == target) return mid;
            else if (nums[mid] > target) end = mid - 1;
            else start = mid + 1;
        }

        return start;
    }


}
