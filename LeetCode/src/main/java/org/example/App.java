package org.example;


import org.example.Day3.ListNode;
import org.example.day2.Isomorphic205Strings;
import org.example.day4.ListNode2;

/**
 * Hello world!
 */
public class App {

    public static void main(String[] args) {

//        ListNode2 a3 = new ListNode2(4, null);
//        ListNode2 a2 = new ListNode2(2, a3);
//        ListNode2 a1 = new ListNode2(1, a2);
//        ListNode2 list1 = a1;
//        ListNode2 b3 = new ListNode2(4, null);
//        ListNode2 b2 = new ListNode2(3, b3);
//        ListNode2 b1 = new ListNode2(1, b2);
//        ListNode2 list2 = b1;


        ListNode2 a2 = new ListNode2(3, null);
        ListNode2 a1 = new ListNode2(-9, a2);
        ListNode2 list1 = a1;

        ListNode2 b2 = new ListNode2(7, null);
        ListNode2 b1 = new ListNode2(5, b2);
        ListNode2 list2 = b1;

        ListNode2 node2 = ListNode2.mergeTwoLists(list1, list2);
        int w = 1;
        while (node2 != null) {

            System.out.println(node2.val + "  element " + w);
            node2 = node2.next;
            w++;
        }


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
//        Isomorphic205Strings isomorphic205Strings = new Isomorphic205Strings(a, b);
//        System.out.println(Isomorphic205Strings.isIsomorphic(a, b));


    }


}
