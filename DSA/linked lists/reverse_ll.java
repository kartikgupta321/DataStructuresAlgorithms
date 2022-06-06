public class reverse_ll {
     public class ListNode {
             int val;
             ListNode next;
             ListNode() {}
             ListNode(int val) { this.val = val; }
             ListNode(int val, ListNode next) { this.val = val; this.next = next; }
         }
       class Solution {
           public ListNode reverseList(ListNode head) {
                ListNode prev = null;
                ListNode curr =head;
                ListNode n =null;
                while (curr!=null) {
                    n = curr.next;
                    curr.next = prev;
                    prev = curr;
                    curr = n;
                }
                return prev;
           }
       }
    public static void main(String[] args) {
        
    }
}
