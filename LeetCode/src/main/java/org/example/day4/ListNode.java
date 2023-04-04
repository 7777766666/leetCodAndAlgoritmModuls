package org.example.day4;

public class ListNode {

    public int val;
    public ListNode next;
    public ListNode() {
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
        ListNode node = null;

        if (a.next == null || b.next == null) {
            if (a.val < b.val) {
                node = a;
                if (a.next == null) {
                    a.next = b;
                    return node;
                }
            } else {
                node = b;
                if (b.next == null) {
                    b.next = a;
                    return node;
                }
            }
        }

        if (a.val < b.val) {
            node = a;
            current = a;
            a = current.next;
        } else {
            node = b;
            current = b;
            b = current.next;
        }

        while (a.next != null || b.next != null || current.next != null) {

            if (a.val < b.val) {
                if (a.next != null) {
                    current.next = a;
                    current = a;
                    a = current.next;
                } else {
                    current.next = a;
                    a.next = b;
                    return node;
                }
            } else {
                if (b.next != null) {
                    current.next = b;
                    current = b;
                    b = current.next;
                } else {
                    current.next = b;
                    b.next = a;
                    return node;
                }
            }
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
