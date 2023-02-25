package org.example.modulOne.dayOne;

public class Second {

    public static int lol(int[] nums) {

        int i = 0;
        int summAll = 0;
        int sumLeft = 0;
        int z = -1;
        for (int r = 0; r < nums.length; r++) {
            summAll += nums[r];
        }

        if (summAll - nums[0] == 0) {
            z = 0;
            return z;
        }
        if (z != 0) {

            for (i = 0; i < nums.length - 1; i++) {
                sumLeft = sumLeft + nums[i];
                if (summAll - nums[i + 1] - sumLeft == sumLeft) {
                    z = i + 1;
                    break;
                }
            }
        }
        return z;
    }
}
