package org.example.day4;

public class ListNode {

    public int val;
    public ListNode next;

    public ListNode() {
//        mergeTwoLists(list1, list2);
    }

    public ListNode(int val) {
        this.val = val;
    }

    public ListNode(int val, ListNode next) {
        this.val = val;
        this.next = next;

    }


    public static ListNode mergeTwoLists(ListNode list1, ListNode list2) {

        if (list1 == null && list2 == null) {
            return list1;
        }
        if (list1 == null) {
            return list2;
        }
        if (list2 == null) {
            return list1;
        }
        if (list1.next == null && list2.next == null) {
            if (list1.val < list2.val) {
                list1.next = list2;
                return list1;
            } else {
                list2.next = list1;
                return list2;
            }
        }

        ListNode a = list1;
        ListNode b = list2;
        ListNode current = null;
        ListNode next = null;
        ListNode node = null;

        if (a.val < b.val) {
            node = a;
            current = a;
            next = current.next;
            a = current.next;
        } else {
            node = b;
            current = b;
            next = current.next;
            b = current.next;
        }

        System.out.println(current.val + " <-current1 " + a.val + " <-a " + b.val + " <-b");

        //check 1
        while (a.next != null || b.next != null) {

            if (a.val < b.val) {
                if (a.next != null) {
                    current.next = a;   //указать на head, а не второй элемент списка!!!!!
                    current = a;
                    next = current;
                    a = current.next;
                } else {
                    current.next = a;
                    a.next = b;
                    return node;
                }

            } else {
                if (b.next != null) {
                    current.next = b;   //указать на head, а не второй элемент списка!!!!!
                    current = b;
                    next = current;
                    b = current.next;
                } else {
                    current.next = b;
                    b.next = a;
                    return node;
                }

                if (a.val < b.val && a.next == null && b.next == null ) {
                    a.next = b;
                    return node;
                } else {
                    b.next = a;
                    return node;
                }

            }
//  -2, 5
//  -9,-6,-3,-1,1,6

        }
        return node;
    }
}

/**
 * Definition for singly-linked list.
 * public class ListNode {
 * int val;
 * ListNode next;
 * ListNode() {}
 * ListNode(int val) { this.val = val; }
 * ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 * }
 */
