package org.example.algday1;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Collections;
import java.util.Random;

public class Google {

    public static void main(String[] args) {

        int[][] adr = new int[5][10];
        Random rnd = new Random();

        for (int i = 0; i < adr.length; i++) {
            for (int j = 0; j < adr[i].length; j++) {
                adr[i][j] = j;
            }

            for (int j = adr[i].length - 1; j > 0; j--) {
                int index = rnd.nextInt(j + 1);
                int temp = adr[i][index];
                adr[i][index] = adr[i][j];
                adr[i][j] = temp;
            }
        }

        int firstElement = adr[0][0];
        for (int i = 0; i < adr.length; i++) {
            for (int j = 0; j < adr[i].length; j++) {
                if (adr[i][j] == firstElement) {
                    adr[i][j] = 10;
                }
            }
        }


        for (int i = 0; i < adr.length; i++) {
            for (int j = 0; j < adr[i].length; j++) {
                if (adr[i][j] != 10) {
                    adr[i][j] = 0;
                }
            }
        }



        System.out.println(Arrays.toString(adr[0]));
        System.out.println(Arrays.toString(adr[1]));
        System.out.println(Arrays.toString(adr[2]));
        System.out.println(Arrays.toString(adr[3]));
        System.out.println(Arrays.toString(adr[4]));



    }

}
