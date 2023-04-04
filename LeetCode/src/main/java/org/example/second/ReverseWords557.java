package org.example.second;

import java.util.Arrays;

public class ReverseWords557 {


    public static void main(String[] args) {

        String f = "Let's take LeetCode contest";
        ReverseWords557 reverseString = new ReverseWords557();


        String q = "123 456 789";
        String s = reverseString.reverseWords(q);
        System.out.println(s);


    }

    public String reverseWords(String s) {
        String[] split = s.split(" ");
        StringBuilder stringBuilder = new StringBuilder();
        for (int i = 0; i < split.length; i++) {
            if (i != split.length) {
                stringBuilder.append(revers(split[i])).append(" ");
            }
        }
        stringBuilder.deleteCharAt(stringBuilder.length() - 1);
        return stringBuilder.toString();
    }

    private String revers(String str) {
        String[] split = str.split("");
        int left = 0;
        int right = split.length - 1;
        StringBuilder stringBuilder = new StringBuilder();
        while (left < right) {

            String temp = split[left];
            split[left] = split[right];
            split[right] = temp;
            right--;
            left++;
        }
        for (int i = 0; i < split.length; i++) {
            stringBuilder.append(split[i]);
        }
        return stringBuilder.toString();
    }
}

