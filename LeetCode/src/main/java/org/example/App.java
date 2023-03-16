package org.example;


import org.example.Day3.ListNode4;
import org.example.day4.ListNode;

/**
 * Hello world!
 */
public class App {

    public static void main(String[] args) {


//        ListNode a2 = new ListNode(5, null);
//        ListNode a1 = new ListNode(-2, a2);
//        ListNode list1 = a1;
//
//        ListNode b6 = new ListNode(6, null);
//        ListNode b5 = new ListNode(1, b6);
//        ListNode b4 = new ListNode(-1, b5);
//        ListNode b3 = new ListNode(-3, b4);
//        ListNode b2 = new ListNode(-6, b3);
//        ListNode b1 = new ListNode(-9, b2);
//        ListNode list2 = b1;

        ListNode a3 = new ListNode(6, null);
       ListNode a2 = new ListNode(3, a3);
        ListNode a1 = new ListNode(1, a2);
        ListNode list1 = a1;


        ListNode b1 = new ListNode(-9, null);
        ListNode list2 = b1;

        ListNode node2 = ListNode.mergeTwoLists(list1, list2);
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


        ListNode4 next5 = new ListNode4(5, null);
        ListNode4 next4 = new ListNode4(4, next5);
        ListNode4 next3 = new ListNode4(3, next4);
        ListNode4 next2 = new ListNode4(2, next3);
        ListNode4 head = new ListNode4(1, next2);


//        ListNode.reverseList(head);

        String a = "paper";
        String b = "title";
//        Isomorphic205Strings isomorphic205Strings = new Isomorphic205Strings(a, b);
//        System.out.println(Isomorphic205Strings.isIsomorphic(a, b));


    }


}
