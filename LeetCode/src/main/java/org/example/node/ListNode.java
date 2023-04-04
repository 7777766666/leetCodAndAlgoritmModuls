package org.example.node;

public class ListNode {
    ListNode head;
    ListNode next;
    String value;


    public ListNode(ListNode next, String value) {
        this.next = next;
        this.value = value;
    }

    public ListNode(String value) {
        this.value = value;
    }

    public ListNode(ListNode head, ListNode next) {
        this.head = head;
        this.next = next;

    }


}
