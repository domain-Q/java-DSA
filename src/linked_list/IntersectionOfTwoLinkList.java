package linked_list;

import java.util.List;

public class IntersectionOfTwoLinkList {
    public class ListNode{
        int val;
        ListNode next;
        ListNode(int x){
            val =x;
            next =null;
        }
    }
    public class solution{
        public ListNode interSection(ListNode headA,ListNode headB){
            ListNode A = headA;
            ListNode B = headB;
            while (A!=B){
                if (A==null){
                    A= headB;
                }else{
                   A= A.next;

                }
                if (B==null){
                    B= headA;
                }
                else{
                    B= B.next;
                }

             }
            return A;
        }

    }
}
