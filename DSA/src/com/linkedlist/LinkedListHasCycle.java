package com.linkedlist;

public class LinkedListHasCycle {
    public static void main(String[] args) {
        hasCycle(new ListNode());
    }

    public static boolean hasCycle(ListNode head) {
        ListNode slow = head;
        ListNode fast = head;

        while(fast !=null && fast.next !=null){
            fast = fast.next.next;
            slow = slow.next;
            if(fast == slow ){
                return true;
            }
        }
        return false;
    }
}
