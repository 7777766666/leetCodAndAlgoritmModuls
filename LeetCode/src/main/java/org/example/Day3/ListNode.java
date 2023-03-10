package org.example.Day3;

import java.lang.reflect.Array;
import java.util.ArrayList;

public class ListNode {
    int val;
    public ListNode next;
//    ListNode head = new ListNode();
//    {
//
//        ListNode listNode1 = new ListNode(1);
//        ListNode listNode2 = new ListNode(2);
//        ListNode listNode3 = new ListNode(3);
//        ListNode listNode4 = new ListNode(4);
//        ListNode listNode5 = new ListNode(5);
//        listNode1.next = listNode2;
//        listNode2.next = listNode3;
//        listNode3.next = listNode4;
//        listNode5.next = listNode5;
//    }

    public ListNode() {
    }

    public ListNode(int val) {
        this.val = val;
    }

    public ListNode(int val, ListNode next) {
        this.val = val;
        this.next = next;
    }



//    public ListNode reverseList(ListNode head) {
    public ListNode reverseList(ListNode head) {

        ListNode finalToSend = new ListNode();
        ArrayList<Integer> integerArray = new ArrayList<>();
        int i = 0;
        if (head != null){



            int one = finalToSend.val;
            integerArray.add(i, one);
            i++;
            System.out.println(i + "     i");

            System.out.println(one +  "  &&&&&&&&&&&&&");
        }
        System.out.println(integerArray + "   arr");

        return finalToSend;
    }


}


