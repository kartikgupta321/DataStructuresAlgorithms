public class remove_ll_elements {
    public class ListNode {
        int val;
        ListNode next;
        ListNode(int x) {
            val = x;
            next = null;
        }
    }
    class Solution {
        public ListNode removeElements(ListNode head, int val) {
            ListNode curr=head;
            while(curr.next!=null || head == null){
                if(head.val==val) {
                    head = head.next;
                    continue;
                }
                if(curr.next.val==val){
                    curr.next = curr.next.next;
                    continue;
                }
                curr=curr.next;
            }
            return head;
        }
    }
    public static void main(String[] args) {   
    }
}
