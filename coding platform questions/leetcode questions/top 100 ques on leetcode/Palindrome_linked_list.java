import java.util.ArrayList;
import java.util.List;

class Palindrome_linked_list{
    public static void main(String[] args) {
        ListNode head = new ListNode(1);
        head.next = new ListNode(2);
        head.next.next = new ListNode(2);
        head.next.next.next = new ListNode(1);
        Solution obj = new Solution();
        System.out.println(obj.isPalindrome(head));
    }
}
class Solution{
    public boolean isPalindrome(ListNode head){
        List<Integer> list = new ArrayList<>();
        while(head!=null){
            list.add(head.val);
            head=head.next;
        }
        for (int i = 0; i < list.size()/2; i++) {
            if(list.get(i)==list.get(list.size()-1-i)) continue;
            else {
                return false;
            }
        }
        return true;
    }
}


class ListNode{
    int val;
    ListNode next;
    ListNode () {}
    ListNode (int val){this.val = val;}
    ListNode (int val,ListNode next){this.val = val; this.next = next;}
}