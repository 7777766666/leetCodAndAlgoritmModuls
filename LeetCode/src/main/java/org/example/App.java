package org.example;


import org.example.day2.FindPart;
import org.example.day2.FindPartNotMy;
import org.example.day3ArraysCheck.ArrCheck;
import org.example.modulOne.dayOne.Second;
import org.example.third.One;

import java.util.Arrays;

/**
 * Hello world!
 */
public class App {

    public static void main(String[] args) {

//        String s = "lol";
//        String t = "mem";
//        One one = new One();
//        int[] mem2 = one.mem(s, t);
//        System.out.println(Arrays.toString(mem2) + " mem2");
//        One two = new One();
//
//
//
//
//        int[] nums = {-1, -1, 100, -1, -1};
//        Second second = new Second();
//        int lol = second.lol(nums);
//        System.out.println(lol + " вторая задача первого урока. ответ элемент с индексом массива 2");
//
//        String big = "9issippi777";
//        String small = "issip";
//        ArrCheck arrCheck = new ArrCheck();
//        System.out.println(arrCheck.strStr(big, small) + "  ответ на вхождение строки в строку (-1 нет), номер");


        String part2 = "ahbgdc";
        String part1 = "abc";
        FindPart findPart = new FindPart(part1, part2);
        System.out.println((findPart.findPart(part1, part2)) + "   findPart");
        FindPartNotMy findPartNotMy = new FindPartNotMy();
        findPartNotMy.isSubsequence(part1, part2);
        System.out.println(findPartNotMy + " find not my");



    }


}
