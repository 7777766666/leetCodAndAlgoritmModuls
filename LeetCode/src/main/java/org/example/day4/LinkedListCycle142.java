package org.example.day4;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.OptionalInt;

public class LinkedListCycle142 {
    int val;
    ListNode next;

    LinkedListCycle142(int x) {
        val = x;
        next = null;
    }

    public static void main(String[] args) {

//        ListNode node9 = new ListNode(90, null);
//        ListNode node8 = new ListNode(80, node9);
//        ListNode node7 = new ListNode(70, node8);
//        ListNode node6 = new ListNode(60, node7);
//        ListNode node5 = new ListNode(50);
//        ListNode node4 = new ListNode(40);
//        ListNode node3 = new ListNode(30);
        ListNode node2 = new ListNode(20);
        ListNode head = new ListNode(10);

        head.next = node2;
        node2.next = null;
//        node3.next = node4;
//        node4.next = node2;


        int x = 1;
        ListNode node = detectCycle(head);
//        System.out.println(node + "   ###  " + node.next + " !!!  " + node.next.next + " %%% " + node.next.next.next);
//        System.out.println(node + "   ###  " + node.val + " !!!  " + node.next.val + "  %% " + node.next.next.val);


    }

    public static ListNode detectCycle(ListNode head) {

        HashSet<Integer> integers = new HashSet<>();
        HashSet<ListNode> integers1 = new HashSet<>();

        if (head == null){
            return null;
        }
        if (head.next == null) {
            return null;
        }

        ListNode cur = head;


        if (cur.next.next == head) {

            return head;
        }
        while (cur != null) {

            int size1 = integers1.size();
            integers1.add(cur.next);
            int size2 = integers1.size();

            if (size2 == size1) {
                cur = cur.next;
                return cur;

            }
            cur = cur.next;

        }

        System.out.println("no cycle");
        return cur;
    }
}


//    public static OptionalInt findInt(int[] arr) {
//        return Arrays.stream(arr)
//                .findAny();

//    }
//
//
//            }
