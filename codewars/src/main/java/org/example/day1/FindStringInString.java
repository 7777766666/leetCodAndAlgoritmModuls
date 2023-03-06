package org.example.day1;

import java.nio.charset.StandardCharsets;
import java.util.Arrays;
import java.util.HashMap;

public class FindStringInString {


    public int strStr(String haystack, String needle) {
//        String haystack1 = "sadbutsad";
//
//        String needle1 = "sad";


        byte[] bytes = haystack.getBytes(StandardCharsets.US_ASCII);
        byte[] bytes1 = needle.getBytes(StandardCharsets.US_ASCII);
        int[] empty = new int[1];

        for (int i = 0; i < bytes.length; i++) {
            if (bytes1[0] == bytes[i]) {
                empty[0] = i;


                for (int j = 1; j < bytes1.length; j++) {
                   if (bytes1[j] == bytes[++i]  ) {

                       if (j == bytes1.length - 1){
                           int index = empty[0];
                           return index;
                       }
                   }
                }
            }
        }
        return -1;
    }
}
