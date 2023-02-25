package org.example.third;

import java.util.Arrays;

public class One {


//    public boolean isIsomorphic(String s, String t) {
public static int[]  mem(String s, String t) {
        boolean bool = false;
        char [] one = s.toCharArray();
        char [] two = t.toCharArray();
        char [] twoCopy = t.toCharArray();
        char [] uniq = new char[s.length()];

        int[] intArray = new int[one.length];
        int[] intArray2 = new int[one.length];

        for (int i = 0; i < intArray.length; i++){
            intArray[i] = one[i];
        }
        for (int i = 0; i < intArray2.length; i++) {
                intArray2[i] = two[i];
        }




        System.out.println(Arrays.toString(intArray));
        System.out.println(Arrays.toString(intArray2));
//        System.out.println(Arrays.toString(one) + " mem777");






        return intArray;
    }
}