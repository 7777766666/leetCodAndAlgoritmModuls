package org.example.day2;

import java.io.ByteArrayInputStream;
import java.util.Arrays;
import java.util.HashMap;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Isomorphic205Strings {

    String x;
    String y;

    public Isomorphic205Strings(String x, String y) {
        this.x = x;
        this.y = y;

        String z = "badc";
        String t = "baba";

        System.out.println(isIsomorphic(z, t));
    }

    public static boolean isIsomorphic(String s, String t) {
        if (s.equals(t))
            return true;
        if (s.length() != t.length())
            return false;

        String[] a = s.split("");
        String[] b = t.split("");

        if (unique(s, t) == false) {
            return false;
        }

        String str = sortSome(a, b);

        if (str.equals(t)) {
            return true;
        }

        return false;
    }

    public static String sortSome(String[] first, String[] second) {
        HashMap<String, String> hashMap = new HashMap<>();
        StringBuilder stringBuilder = new StringBuilder();
        for (int i = 0; i < first.length; i++) {
            hashMap.put(first[i], second[i]);
        }

        for (int i = 0; i < first.length; i++) {

            stringBuilder.append(hashMap.get(first[i]));
        }
        return stringBuilder.toString();
    }

    public static boolean unique(String a, String b) {
        long countA = a.chars().distinct().count();
        long countB = b.chars().distinct().count();
        if (countA == countB) {
            return true;
        }
        return false;
    }
}
