package linkedlist;

import java.util.Arrays;

public class MergeKSortedList {


    public ListNode mergeKLists(ListNode[] lists) {
        int n = lists.length;
        if(lists == null || n == 0){
            return null;
        }

        if(n == 1){
            return lists[0];
        }

        int mid = n/2;
        ListNode left = mergeKLists(Arrays.copyOfRange(lists, 0, mid));
        ListNode right = mergeKLists(Arrays.copyOfRange(lists, mid, n));

        return mergeTwoList(left, right);

    }

    public ListNode mergeTwoList(ListNode list1, ListNode list2){
        ListNode dummy = new ListNode();
        ListNode node = dummy;

        while(list1 != null && list2 != null){
            if(list1.val < list2.val){
                node.next = list1;
                list1 = list1.next;
            } else {
                node.next = list2;
                list2 = list2.next;
            }
            node = node.next;
        }

        if(list1 == null){
            node.next = list2;
        } else {
            node.next = list1;
        }

        return dummy.next;

    }
}
