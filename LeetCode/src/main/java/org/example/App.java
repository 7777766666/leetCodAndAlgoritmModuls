package org.example;


import org.example.modulOne.dayOne.Second;
import org.example.third.One;

import java.lang.reflect.Array;
import java.util.Arrays;

/**
 * Hello world!
 */
public class App {

    public static void main(String[] args) {

        String s = "lol";
        String t = "mem";
        One one = new One();
        int[] mem2 = one.mem(s, t);
        System.out.println(Arrays.toString(mem2) + " mem2");
        One two = new One();




        int[] nums = {-1, -1, 100, -1, -1};
        Second second = new Second();
        int lol = second.lol(nums);
        System.out.println(lol + " вторая задача первого урока. ответ элемент с индексом массива 2");


    }


}
