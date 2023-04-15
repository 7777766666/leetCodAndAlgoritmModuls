package string;

public class Binar {

    public static void main(String[] args) {

        int[] arr1 = {-1, 0, 3, 5, 9, 12};
        int target = 9;
        int target2 = 2;
        Binar binar = new Binar();
        System.out.println(binar.search(arr1, target));

    }

    public int search(int[] nums, int target) {

        if (nums.length == 1) return (nums[0] == target) ? 0 : -1;

        if (nums.length == 2)
            return (nums[0] == target) ? 0 : (nums[1] == target) ? 1 : -1;

        if (target < nums[0] || target > nums[nums.length - 1]) return -1;

        int l = 0;
        int r = nums.length - 1;

        while (true) {

            int index = (r + l) / 2;

            if (nums[index] == target) {
                return index;
            } else if (nums[index] > target) {
                if (nums[index - 1] < target) {
                    return -1;
                } else if (target == nums[index - 1]) {
                    return (index - 1);
                } else {
                    r = index - 1;
                }

            } else {
                if (nums[index + 1] > target) {
                    return -1;
                } else if (target == nums[index + 1]) {
                    return (index + 1);
                } else {
                    l = index + 1;
                }
            }
        }
    }
}