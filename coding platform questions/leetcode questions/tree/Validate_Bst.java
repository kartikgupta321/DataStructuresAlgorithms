public class Validate_Bst {
    public static void main(String[] args) {
        TreeNode p = new TreeNode(4);
        p.left = new TreeNode(2);
        p.left.left = new TreeNode(1);
        p.left.right = new TreeNode(3);
        p.right = new TreeNode(6);
        p.right.left = new TreeNode(5);
        p.right.right = new TreeNode(7);
        Solution obj = new Solution();
        System.out.println(obj.isValidBST(p));
    }
}
class Solution {
    public boolean isValidBST(TreeNode root) {
        if(root==null) return true;
        if(root.left!=null && root.left.val >= root.val) return false;
        if(root.right!=null && root.right.val <= root.val) return false;
        return isValidBST(root.left) && isValidBST(root.right);
    }
}