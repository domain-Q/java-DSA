package linked_list;

import java.util.List;

public class Linked_List_Cycle {
    class ListNode {
        int val;
        ListNode next;

        ListNode(int x) {
            val = x;
            next = null;
        }
    }
    public ListNode reverse(ListNode head){
        ListNode curr = head;
        ListNode prev = null;
        while(curr!= null){
            ListNode nextNode = curr.next;
            curr.next =prev;
            prev =curr;
            curr =nextNode;
        }
        return prev;
    }
}



