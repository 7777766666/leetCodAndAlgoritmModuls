package org.example.day2;

public class BestCheck {
    public static void main(String[] args) {


        String a = "bob";
        String b = "mem";
        System.out.println(BestCheck.isIsomorphic(a, b));
    }


    public static boolean isIsomorphic(String s, String t) {
        // Base case: for different length of two strings...
        if(s.length() != t.length())
            return false;
        // Create two maps for s & t strings...
        int[] map1 = new int[256];
        int[] map2 = new int[256];
        // Traverse all elements through the loop...
        for(int idx = 0; idx < s.length(); idx++){
            // Compare the maps, if not equal, return false...
            if(map1[s.charAt(idx)] != map2[t.charAt(idx)])
                return false;
            // Insert each character if string s and t into seperate map...
            map1[s.charAt(idx)] = idx + 1;
            map2[t.charAt(idx)] = idx + 1;

            int z = s.charAt(idx);
            System.out.println(z + "   @@@@@@@@@@@@@@@@@");
        }
        return true;    // Otherwise return true...
    }



}
