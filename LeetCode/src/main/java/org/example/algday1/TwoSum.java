package org.example.algday1;

import java.util.Arrays;
import java.util.HashMap;

public class TwoSum {


    public int[] twoSum(int[] numbers, int target) {
        HashMap<Integer, Integer> hashMap = new HashMap<>();
        int[] result = new int[2];
        int count = 1;
        for (int i = 0; i < numbers.length; i++) {
            if (hashMap.get(target - numbers[i]) == null) {
                hashMap.put(numbers[i], count++);
            } else {
                result[1] = count;
                result[0] = hashMap.get(target - numbers[i]);
                return result;
            }
        }
        return result;
    }

    public static void main(String[] args) {

        TwoSum twoSum = new TwoSum();
        int[] ints = {2, 3, 4};
        System.out.println(Arrays.toString(twoSum.twoSum(ints, 6)));

    }
}
