package linked_list;

public class  Middle_of_the_list {
    public class ListNode {
        int val;
        ListNode next;

        ListNode() {
        }

        ListNode(int val) {
            this.val = val;
        }

        ListNode(int val, ListNode next) {
            this.val = val;
            this.next = next;
        }
    }
    class solution {
        public ListNode MiddleNode(ListNode head){
            ListNode fast = head;
            ListNode slow = head;
            while( fast.next!= null && fast != null){
                fast = fast.next.next;
                slow = slow.next;
            }
            return slow;
        }

    }
}
