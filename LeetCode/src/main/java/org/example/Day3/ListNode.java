package org.example.Day3;

import java.math.BigInteger;

public class ListNode {
    int val;
    ListNode next;
    public ListNode() {
    }
    public ListNode(int val) {
        this.val = val;
    }
    public ListNode(int val, ListNode next) {
        this.val = val;
        this.next = next;
    }


    public static void reverseList(ListNode head) {

        ListNode  left= null;
        ListNode right = head;


        System.out.println(head.val);
        System.out.println(head.next);
        System.out.println((head) + "  head ссылка извне на элемент 1");
        System.out.println("----------------------------------------------");
int w = 0;

        while (right.next != null){
w++;

            ListNode next = right.next;     //сохраняем адрес первой ноды (некст поле только)

                right.next = left;

                System.out.println((right) + "  right ссылка элемента val  " + w);

                    left = right;
                    right = next;

            System.out.println((left) + "  left ссылка элемента val  " + w);
//            System.out.println((right.val) + "  значение элемента ");
            }






        System.out.println("________________________________");



}




}



