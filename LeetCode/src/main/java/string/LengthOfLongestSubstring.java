package string;

import java.util.HashSet;

public class LengthOfLongestSubstring {

    public static void main(String[] args) {

        String x = "bbbbb";
        String y = "abcabcbb";
        String f = "pwwkew";
        String d = "dvdf";
//        System.out.println(LengthOfLongestSubstring.lengthOfLongestSubstring(x));
//        System.out.println(LengthOfLongestSubstring.lengthOfLongestSubstring(y));
//        System.out.println(LengthOfLongestSubstring.lengthOfLongestSubstring(f));
        System.out.println(LengthOfLongestSubstring.lengthOfLongestSubstring(d));
    }

    public static int lengthOfLongestSubstring(String s) {


        if (s.length() == 1) {
            return 1;
        }
        byte[] bytes = s.getBytes();
        HashSet hashSet = new HashSet();
        int maxSize = 0;
        int size = 0;
        int count = 0;

        for (int i = 0; i < bytes.length; i++) {
            size = hashSet.size();
            hashSet.add(bytes[i]);
            int newSize = hashSet.size();
            if (maxSize < newSize) {
                maxSize = newSize;
            }

            if (newSize == size) {
                hashSet.clear();
                if (i + 1 < bytes.length && bytes[i] == bytes[i + 1]) {
                    hashSet.add(bytes[i]);
                    while (i + 1 < bytes.length && bytes[i] == bytes[i + 1]) {
                        i++;
                    }
                } else if (bytes[i] == bytes[i - 1]) {
                    hashSet.add(bytes[i]);
                } else {
                    int z = 2;
                    while (i - z > 0 && bytes[i] != bytes[i - z]) {

                        z++;
                    }
                    i = i - z + 1;
                    hashSet.add(bytes[i]);
                }

            }
        }
        return maxSize;
    }
}
