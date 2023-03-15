package org.example.Day3;

public class ListNode4 {
    int val;
    ListNode4 next;
    public ListNode4() {
    }
    public ListNode4(int val) {
        this.val = val;
    }
    public ListNode4(int val, ListNode4 next) {
        this.val = val;
        this.next = next;
    }


    public static void reverseList(ListNode4 head) {

        ListNode4 left= null;
        ListNode4 right = head;


        System.out.println(head.val);
        System.out.println(head.next);
        System.out.println((head) + "  head ссылка извне на элемент 1");
        System.out.println("----------------------------------------------");
int w = 0;

        while (right.next != null){
w++;

            ListNode4 next = right.next;     //сохраняем адрес первой ноды (некст поле только)

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



