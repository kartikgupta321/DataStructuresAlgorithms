class addTwoNumbersLinkedLists{
    public static void main(String[] args) {
        Solution obj = new Solution();
        ListNode l1 = new ListNode(2);
        l1.next = new ListNode(4);
        l1.next.next = new ListNode(3);
        // 243
        ListNode l2 = new ListNode(5);
        l2.next = new ListNode(6);
        l2.next.next = new ListNode(4);
        // 564
        System.out.println(obj.addTwoNumbers(l1, l2).val);
        System.out.println(obj.addTwoNumbers(l1, l2).next.val);
        System.out.println(obj.addTwoNumbers(l1, l2).next.next.val);
    }
}
class Solution {
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        ListNode dummyHead = new ListNode(0);
        ListNode curr = dummyHead;
        int carry = 0;
        while ( l1!=null || l2!=null || carry!=0){
            int x = (l1!=null)? l1.val : 0;
            int y = (l2!=null)? l2.val : 0;
            int sum = carry + x + y;
            carry = sum/10;
            curr.next = new ListNode(sum%10);
            curr = curr.next;
            if(l1!=null)
                l1 = l1.next;
            if(l2!=null)
                l2 = l2.next;
        }
        return dummyHead.next;
    }
}




class ListNode {
    int val;
    ListNode next;
    ListNode() {}
    ListNode(int val) { this.val = val; }
    ListNode(int val, ListNode next) { this.val = val; this.next = next; }
}