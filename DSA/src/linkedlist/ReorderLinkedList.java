package linkedlist;

public class ReorderLinkedList {
    public void reorderList(ListNode head) {
        // find the middle

        ListNode slow = head;
        ListNode fast = head;

        while (fast !=null && fast.next != null){
            slow = slow.next;
            fast = fast.next.next;
        }

        ListNode middleNode = slow;

        //reverse the second half

        ListNode previous = null;
        ListNode current = middleNode;

        while(current !=null){
            ListNode temp = current.next;
            current.next = previous;
            previous = current;
            current = temp;
        }

        ListNode reversedList = previous;
        while(reversedList.next !=null){
            ListNode temp1 = head.next;
            ListNode temp2 = reversedList.next;
            head.next = reversedList;
            reversedList.next = temp1;
            head = temp1;
            reversedList = temp2;
        }


    }
}
