package org.example;


import org.example.Day3.ListNode;
import org.example.Day3.ReverseLinkedList;
import org.example.day2.FindPart;
import org.example.day2.FindPartNotMy;
import org.example.day2.Isomorphic205Strings;
import org.example.day3ArraysCheck.ArrCheck;
import org.example.modulOne.dayOne.Second;
import org.example.third.One;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;

/**
 * Hello world!
 */
public class App {

    public static void main(String[] args) {


//        int[] numbers = {6, -99, 986};
//
//    if (numbers.length == 0) {
//        System.out.println("[]");
//    } else {
//        StringBuilder stringBuilder = new StringBuilder();
//        stringBuilder.append("[");
//        for (int i = 0; i < numbers.length - 1; i++) {
//            stringBuilder.append(numbers[i]).append(", ");
//        }
//        stringBuilder.append(numbers[numbers.length - 1]).append("]");
//        System.out.println(stringBuilder.toString());
//
//    }


        ListNode next5 = new ListNode(5, null);
        ListNode next4 = new ListNode(4, next5);
        ListNode next3 = new ListNode(3, next4);
        ListNode next2 = new ListNode(2, next3);
        ListNode head = new ListNode(1, next2);


//        ListNode.reverseList(head);

        String a = "paper";
        String b = "title";
        Isomorphic205Strings isomorphic205Strings = new Isomorphic205Strings(a, b);
//        System.out.println(Isomorphic205Strings.isIsomorphic(a, b));


    }


}
