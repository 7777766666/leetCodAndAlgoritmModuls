package org.example.day4;

import java.util.Arrays;

public class ListNode5 {

    public int val;
    public ListNode next;

    public ListNode5() {

    }

    public ListNode5(int val) {
        this.val = val;
    }

    public ListNode5(int val, ListNode next) {
        this.val = val;
        this.next = next;
    }

    public static void main(String[] args) {

        String x = "1";
        String y = null;
        String c = x + y;
        StringBuilder stringBuilder = new StringBuilder();
//
//        for (int i = 0; i < 1_000_000; i++) {
//            stringBuilder.append(x).append(y);
//            i++;
//
//        }
//        System.out.println(stringBuilder);





        ListNode node9 = new ListNode(9, null);
        ListNode node8 = new ListNode(8, node9);
        ListNode node7 = new ListNode(7, node8);
        ListNode node6 = new ListNode(6, node7);
        ListNode node5 = new ListNode(5, node6);
        ListNode node4 = new ListNode(4, node5);
        ListNode node3 = new ListNode(3, node4);
        ListNode node2 = new ListNode(2, node3);
        ListNode head = new ListNode(1, node2);


        ListNode listNode = middleNode(head);
        System.out.println("-------------------------------------");
        while (listNode.next != null) {
            System.out.println(listNode.val);
            listNode = listNode.next;
            if (listNode.next == null) {
                System.out.println(listNode.val);
            }
        }
    }

    public static ListNode middleNode(ListNode head) {

        ListNode slow = head;
        ListNode fast = head;
        while(fast!=null){
            if(fast.next == null ){
                break;
            }
            fast = fast.next.next;
            slow = slow.next;
        }
        return slow;
    }
}