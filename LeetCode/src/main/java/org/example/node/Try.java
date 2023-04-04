package org.example.node;

public class Try {

    public static void main(String[] args) {


        ListNode listNode4 = new ListNode(null, "Fourth element");
        ListNode listNode3 = new ListNode(listNode4, "Third element" );
        ListNode listNode2 = new ListNode(listNode3, "Second element");
        ListNode listNode1 = new ListNode(listNode2, "First element");
        ListNode head = new ListNode(listNode1, listNode1);


        ListNode current = head.next; // переход к следующему элементу после head
        ListNode prev = current;
//        ListNode next = current;
        while (current.next != null && prev.next != null) {

            prev = current;
            System.out.println(prev.value + "  prev val");
            current = current.next;
            if (current.value.contains("Fourth")){
                System.out.println(current.value);

                current.next = prev.next;
                prev.next = null;
                System.out.println(prev.value + "  prev.value");
            }
        }

        int z = 0;
        while (current.next != null) {
            z++;
            System.out.println(current.next.value + "  " + z);
            current = current.next;
        }

//        System.out.println(current.value);
//        System.out.println(current.next.value);
//        System.out.println(current.next.next.value);


    }
}
