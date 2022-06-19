import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

class bt_inorder{
    public static void main(String[] args) {
        Solution obj = new Solution();
        TreeNode head= new TreeNode(1);
        head.left = new TreeNode(2);
        head.right = new TreeNode(3);
        head.right.left = new TreeNode(6);
        head.left.left = new TreeNode(4);
        head.left.right = new TreeNode(5);        
        
        List<Integer> list = obj.inorderTraversal(head);
        for (int i = 0; i < list.size(); i++) {
            System.out.println(list.get(i));
        }
    }
}
class Solution {
    public List<Integer> inorderTraversal(TreeNode root) {
        List<Integer> res = new ArrayList<>();
        Stack<TreeNode> stack = new Stack<>();
        TreeNode curr = root;
        while(curr!=null || !stack.isEmpty()){
            while(curr!=null){
                stack.push(curr);
                curr = curr.left;
            }
            curr = stack.pop();
            res.add(curr.val);
            curr = curr.right;
        }
        return res;
   
    }
}


class TreeNode{
    int val;
    TreeNode left;
    TreeNode right;
    TreeNode(){}
    TreeNode (int val) {this.val = val;}
    TreeNode(int val , TreeNode left,TreeNode right){
        this.val = val;
        this.left = left;
        this.right = right;
    }
}