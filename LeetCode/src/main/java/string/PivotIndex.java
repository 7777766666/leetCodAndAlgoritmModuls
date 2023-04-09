package string;

public class PivotIndex {

    public static void main(String[] args) {
        int[] nums = {0, 5, 666, 5, -2, 1, 0, 0, 1, 5, -4, -1};
        int[] arr = {1, 3, 6};
        System.out.println(pivotIndex(nums));
    }

    public static int pivotIndex(int[] nums) {

        int sum = 0;
        int left = 0;
        for (int xxx : nums) {
            sum += xxx;
        }
        System.out.println(sum);

        for (int i = 0; i < nums.length; i++) {
            sum = sum - nums[i];
            if (sum == left){
                return i;
            }
            left +=  nums[i];

        }

        return -1;
    }

}