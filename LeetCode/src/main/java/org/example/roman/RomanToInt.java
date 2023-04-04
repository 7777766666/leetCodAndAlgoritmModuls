package org.example.roman;

import java.util.Arrays;
import java.util.HashMap;
import java.util.TreeMap;

public class RomanToInt {

    private static HashMap<String, Integer> hashMap = new HashMap();
    private static HashMap<Character, Integer> eee = new HashMap<>();

    static {
        hashMap.put("I", 1);
        hashMap.put("V", 5);
        hashMap.put("X", 10);
        hashMap.put("L", 50);
        hashMap.put("C", 100);
        hashMap.put("D", 500);
        hashMap.put("M", 1000);
    }
    static TreeMap<Character, Integer> romanKeyMap = new TreeMap<>();

    static {
        romanKeyMap.put('I', 1);
        romanKeyMap.put('V', 5);
        romanKeyMap.put('X', 10);
        romanKeyMap.put('L', 50);
        romanKeyMap.put('C', 100);
        romanKeyMap.put('D', 500);
        romanKeyMap.put('M', 1000);
    }



        public static void main(String[] args) {

        String q = "CMLXIX";
        q = q.toUpperCase();
        int qq = romanInt(q);
        System.out.println(qq);
            System.out.println(romanToInt(q));


    }

    private static int romanInt (String s) {
        String[] split = s.split("");
        int count = 1;
        int result = 0;
        for (int i = 0; i < s.length(); i++) {
            if (i + 1 <= split.length - 1 && split[i].equals(split[i + 1])) {
                count++;
            } else {
                int y = hashMap.get(split[i]);
                int z = count * y;
                count = 1;
                if (i + 1 < split.length && hashMap.get(split[i + 1]) > y) {
                    result -= z;
                } else {
                    result += z;
                }
            }
        }
        return result;
    }

    public static int romanToInt(String s) {
        int end = s.length() - 1;
        char[] arr = s.toCharArray();
        int arabian;
        int result = romanKeyMap.get(arr[end]);
        for (int i = end - 1; i >= 0; i--) {
            arabian = romanKeyMap.get(arr[i]);

            if (arabian < romanKeyMap.get(arr[i + 1])) {
                result -= arabian;
            } else {
                result += arabian;
            }
        }
        return result;
    }

}
