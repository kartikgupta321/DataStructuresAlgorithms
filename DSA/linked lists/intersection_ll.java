public class intersection_ll {
    public class ListNode {
        int val;
        ListNode next;

        ListNode(int x) {
            val = x;
            next = null;
        }
    }

    public class Solution {
        public ListNode getIntersectionNode(ListNode headA, ListNode headB) {
            ListNode A = headA;
            ListNode B = headB;
            while(true){
                if(A==B) return A;
                else if(A==null) A = headB;
                else if(B==null) B = headA;
                A = A.next;
                B = B.next;
            }
        }
    }

public static void main(String[] args) {
    
}    
}
