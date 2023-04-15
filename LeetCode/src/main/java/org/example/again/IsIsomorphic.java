package org.example.again;

import java.util.HashMap;
import java.util.Map;

public class IsIsomorphic {

    public static void main(String[] args) {
        IsIsomorphic isIsomorphic = new IsIsomorphic();
        String x = "egg";
        String y = "fod";

        System.out.println((x.charAt(0)) + "  CHAR");
        System.out.println((y.charAt(0)) + "  CHAR");

        System.out.println(isIsomorphic.isIsomorphic(x, y));


        Map<Integer, Integer> lol1 = new HashMap<>();
        Map<Integer, Integer> lol2 = new HashMap<>();
        lol1.put(10,10);
        lol2.put(10,5);
        System.out.println((lol1.equals(lol2)) + "  lol1 and lol2");

        
    }

    public boolean isIsomorphic(String s, String t){
        if (s.length() != t.length()){
            return false;
        }

        Map<Character, Integer> map1 = new HashMap<>();
        Map<Character, Integer> map2 = new HashMap<>();

        for (int i = 0; i < s.length(); i++) {
            map1.put(s.charAt(i), i);
            map1.put(t.charAt(i), i);
            System.out.println(map1.get(s.charAt(i)));
            System.out.println(map1.get(t.charAt(i)));

        }






        return true;
    }
}
