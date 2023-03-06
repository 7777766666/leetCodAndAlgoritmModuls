package org.example.day1;

import java.util.Arrays;
import java.util.HashMap;

public class FindStringInString {

    public int strStr(String haystack, String needle) {

        String[] a = haystack.split("");
        String[] b = needle.split("");

        for (int i = 0; i < a.length; i++) {
            for (int j = 0; j < b.length; j++) {
                if (a[i].equals(b[j])) {
                    for (int k = 1; k < needle.length(); k++) {

                            a[i + k].equals(b[j + 1]);

                    }
                    return i;
                }
            }

        }
        return -1;
    }

}


//        String[] a = {haystack};
//        String[] b = {needle};
//
//        String[] c = haystack.split(needle);
//        System.out.println((Arrays.toString(c)) + " c");
//        System.out.println(haystack.length() );
//        System.out.println((c.length) + "  c.length");
//        if (haystack.length() == c.length) {
//            return -1;
//        } else {
//            return c[0].length();
//        }


//        String[] d = haystack.split("");
//
//        int length = c[0].length();
//        System.out.println(length + "   !!!!!!!!!!!!!!");
//
//
//        String[] b = {needle};
//        String[] f = needle.split("");
//        System.out.println((needle.length()));
//        System.out.println((haystack.length()));
//        String[] a = {haystack};
//        System.out.println((Arrays.toString(a)) + " a");
//        System.out.println((Arrays.toString(c)) + "  c");
//        System.out.println(((haystack.length())) + "  haystack");
//
//        if (a[0].contains(b[0])) {
//
//            for (int i = 0; i < c.length; i++){
////                if (c[i] == null) {
////                    return i;
//
//            }
//        }
//
//
//        return -1;

