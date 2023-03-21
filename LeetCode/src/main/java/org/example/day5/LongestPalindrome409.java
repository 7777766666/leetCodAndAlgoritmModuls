package org.example.day5;

import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;

public class LongestPalindrome409 {

    public static void main(String[] args) {

        String s = "abccccdd";
        System.out.println(longestPalindrome(s));

    }

    public static int longestPalindrome(String s) {


        int[] sortInt = sortInt(s);


        int z = 1;
        int result = 0;
        for (int i = 0; i < sortInt.length - 1; i++) {

            if (sortInt[i] == sortInt[i + 1]) {
                z++;
            } else {
                if (z > 1) {
                    result += z / 2;
                    z = 1;
                }
            }
        }
        if (z > 1) {
            result += z / 2;
        }
        if (s.length() != result * 2) {
            return result *2 + 1;
        }
        return result * 2;
    }

    public static int[] sortInt(String s) {
        return s.chars()
                .sorted()
                .toArray();
    }
}
