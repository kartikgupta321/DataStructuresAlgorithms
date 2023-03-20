import java.util.Random;

class linkedListRandomNode{
    public static void main(String[] args) {
        ListNode head = new ListNode(1);
        head.next = new ListNode(2);
        head.next.next = new ListNode(3);
        Solution obj = new Solution(head);
        System.out.println(obj.getRandom());
    }
}

class Solution {
    private ListNode head;
    private Random random;

    public Solution(ListNode head) {
        this.head = head;
        random = new Random();    
    }
    
    public int getRandom() {
        int count = 0;
        int result = 0;
        ListNode curr = head;
        while(curr!=null){
            count++;
            if(random.nextInt(count)==0){
                result = curr.val;
            }
            curr = curr.next;
        }
        return result;
    }
}

class ListNode {
    int val;
    ListNode next;
    ListNode() {}
    ListNode(int val) { this.val = val; }
    ListNode(int val, ListNode next) { this.val = val; this.next = next; }
}