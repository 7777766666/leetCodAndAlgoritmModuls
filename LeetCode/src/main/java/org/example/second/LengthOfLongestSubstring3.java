package org.example.second;

import java.util.HashSet;

public class LengthOfLongestSubstring3 {

    public static void main(String[] args) {
        String s = "au";
        LengthOfLongestSubstring3 l = new LengthOfLongestSubstring3();
        System.out.println(l.lengthOfLongestSubstring(s));



    }

    public int lengthOfLongestSubstring(String s) {
        if (s.length() == 1) {
            return 1;
        }
        byte[] bytes = s.getBytes();
        HashSet hashSet = new HashSet();
        int maxSize = 0;
        int size = 0;
        for (int i = 0; i < bytes.length; i++) {
            size = hashSet.size();
            hashSet.add(bytes[i]);
            int newSize = hashSet.size();
            if (maxSize < newSize){
                maxSize = newSize;
            }

            if (newSize == size) {
                hashSet.clear();
                hashSet.add(bytes[i]);
            }
        }


        return maxSize;
    }
}
