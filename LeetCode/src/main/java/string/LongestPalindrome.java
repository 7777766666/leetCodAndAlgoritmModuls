package string;

import java.util.Arrays;

public class LongestPalindrome {

    public static void main(String[] args) {
        String s = "AABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyzCC";
        System.out.println(LongestPalindrome.longestPalindrome(s));
        System.out.println((int) s.charAt(0));
        


    }

    public static int longestPalindrome(String s) {
        byte[] bytes = s.getBytes();
        int[] chars = new int[123];

        for (int i = 0; i < s.length(); i++)
            chars[bytes[i]] += 1;

        int sum = 0;
        for (int i = 64; i < chars.length; i++)
            sum += chars[i] / 2;

        return  (sum * 2 == s.length()) ? (sum * 2) : (sum * 2) + 1 ;
    }
}

