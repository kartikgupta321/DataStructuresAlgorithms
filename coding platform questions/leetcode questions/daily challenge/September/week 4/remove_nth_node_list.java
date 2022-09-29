class remove_nth_node_list{
    public static void main(String[] args) {
        Solution obj = new Solution();
        ListNode head = new ListNode(1);
        ListNode curr = head;
        System.out.println(curr.val+" "+head.val);
        for (int i = 2; i < 6; i++) {
            head.next = new ListNode(i);
            head = head.next;
        }
        head = curr;
        head = obj.removeNthFromEnd(head, 5);
        System.out.println(head.val);
    }
}
class ListNode {
    int val;
    ListNode next;
    ListNode() {}
    ListNode(int val) { this.val = val; }
    ListNode(int val, ListNode next) { this.val = val; this.next = next; }
}
class Solution {
    public ListNode removeNthFromEnd(ListNode head, int n) {
        ListNode start = new ListNode(0);
        ListNode slow = start, fast = start;
        slow.next = head;

        for (int i = 1; i < n+1 ; i++) {
            fast = fast.next;
        }
        while (fast.next != null) {
            slow = slow.next;
            fast = fast.next;
        }
        slow.next = slow.next.next;
        return start.next;
    }
}