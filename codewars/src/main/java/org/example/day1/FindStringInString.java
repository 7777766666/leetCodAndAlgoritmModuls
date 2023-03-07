package org.example.day1;

import java.nio.charset.StandardCharsets;

public class FindStringInString {


    public int strStr(String haystack, String needle) {

        String[] a = haystack.split(needle);
        if (a.length == 0) {
            return 0;
        }
        byte[] bytes = haystack.getBytes(StandardCharsets.US_ASCII);
        byte[] bytes1 = needle.getBytes(StandardCharsets.US_ASCII);
        int[] temp = new int[bytes.length];
        int[] empty = new int[1];

        if (bytes.length <bytes1.length){
            return -1;
        }

        if (bytes1.length == 1) {
            for (int v = 0; v < bytes.length; v++){
                if (bytes1[0] == bytes[v]){
                    return v;
                }
            }
        }



        for (int i = 0; i < bytes.length - bytes1.length; i++) {
            if (bytes1[0] == bytes[i]) {
                empty[0] = i;
                if (bytes1.length == 1) {
                    return i;
                }

                for (int j = 0; j < bytes1.length; j++) {
                   if (bytes1[j] == bytes[i++]  ) {

                       temp[j] = bytes1[j];

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
