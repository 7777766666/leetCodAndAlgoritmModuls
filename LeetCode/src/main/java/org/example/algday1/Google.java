package org.example.algday1;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Random;

public class Google {

    public static void main(String[] args) {

        Random random = new Random();
        int random1 = random.nextInt((10));
        System.out.println(random1);
        int[][] adr = new int[5][10];
        for (int i = 0; i < adr.length; i++) {
            for (int j = 0; j < adr[i].length; j++) {
                adr[i][j] = j;
            }
        }
        System.out.println(Arrays.toString(adr[0]));
        System.out.println(Arrays.toString(adr[1]));
        System.out.println(Arrays.toString(adr[2]));
        System.out.println(Arrays.toString(adr[3]));
        System.out.println(Arrays.toString(adr[4]));



    }

}
