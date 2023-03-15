package org.example.day4;

public class ListNode2 {
    public int val;
    public ListNode2 next;

    public ListNode2() {
    }

    public ListNode2(int val) {
        this.val = val;
    }

    public ListNode2(int val, ListNode2 next) {
        this.val = val;
        this.next = next;
    }

    public ListNode2 mergeTwoLists(ListNode2 list1, ListNode2 list2) {



        return list1;
    }
}


/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode() {}
 *     ListNode(int val) { this.val = val; }
 *     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 * }
 */
//class Solution {
//    public ListNode mergeTwoLists(ListNode list1, ListNode list2) {
//
//        if ( list1 == null && list2 == null) {
//            return list1;
//        }
//        if  ( list1 == null) {
//            return list2;
//        }
//        if (list2 == null) {
//            return list1;
//        }
//        ListNode a = list1;
//        ListNode b = list2;
//        ListNode current = null;
//        ListNode next = null;
//        ListNode node = null;
//
//        if(a.val < b.val) {
//            node = a;
//            current = a;
//            next = current.next;
//            a = current.next;
//        } else {
//            node = b;
//            current = b;
//            next = current.next;
//            b = current.next;
//        }
//
//        System.out.println( current. val + " <-current1 " + a.val + " <-a " + b.val + " <-b");
//
//        //check 1
//        while(a.next != null || b.next != null) {
//
//            if(a.val < b.val) {
//                current.next = a;   //указать на head, а не второй элемент списка!!!!!
//                current = a;
//                next = current;
//                a = current.next;
//
//            } else {
//                current.next = b;   //указать на head, а не второй элемент списка!!!!!
//                current = b;
//                next = current;
//                b = current.next;
//            }
//
//
//
//
//            System.out.println( current. val + " <-current2 " + a.val + " <-a " + b.val + " <-b");
//        }
//        if( a.val < b.val ) {
//            a.next = b;
//        } else {
//            b.next = a;
//        }
//
//
//
//
//
//        return node;
//
//
//    }
//
//
//}