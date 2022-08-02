import java.util.ArrayList;
import java.util.List;

class Flatten_Bt_Ll{
    public static void main(String[] args) {
        Solution obj = new Solution();
        TreeNode head= new TreeNode(1);
        head.left = new TreeNode(2);
        head.right = new TreeNode(3);
        head.right.left = new TreeNode(6);
        head.left.left = new TreeNode(4);
        head.left.right = new TreeNode(5);
        obj.flatten(head);
        System.out.println(head.right.left.val);
    }
}
class Solution {
    List<TreeNode> list = new ArrayList<>();

    public void flatten(TreeNode root) {
        helper(root);
        for (int i = 1; i < list.size(); i++) {
            root.right = list.get(i);
            root.left = null;
            root = root.right;
        }
    }
    public void helper(TreeNode root){
        if(root==null) return ;
        list.add(root);
        helper(root.left);
        helper(root.right);
    } 
}