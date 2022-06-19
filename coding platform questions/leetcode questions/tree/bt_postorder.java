import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

public class bt_postorder {
    public static void main(String[] args) {
        Solution obj = new Solution();
        TreeNode head= new TreeNode(1);
        head.left = new TreeNode(2);
        head.right = new TreeNode(3);
        head.right.left = new TreeNode(6);
        head.left.left = new TreeNode(4);
        head.left.right = new TreeNode(5);        
        
        List<Integer> list = obj.postorderTraversal(head);
        for (int i = 0; i < list.size(); i++) {
            System.out.println(list.get(i));
        }
    }
}
class Solution {
    public List<Integer> postorderTraversal(TreeNode root) {
        List<Integer> res = new ArrayList<>();
        Stack<TreeNode> stack = new Stack<>();
        TreeNode curr = root,prev=null;
        while (curr!=null || !stack.isEmpty()) { 
            while (curr!=null) {
                stack.push(curr);
                curr=curr.left;
            }
            if(stack.peek().right==null || stack.peek().right == prev){
                prev = stack.pop();
                res.add(prev.val);
            }
            else{
                curr = stack.peek().right;
            }
        }
        return res;
    }
}