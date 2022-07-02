public class Validate_Bst {
    public static void main(String[] args) {
        TreeNode p = new TreeNode(5);
        p.left = new TreeNode(4);
        p.right = new TreeNode(6);
        p.right.left = new TreeNode(3);
        p.right.right = new TreeNode(7);
        Solution obj = new Solution();
        System.out.println(obj.isValidBST(p));
    }
}
class Solution {
    public boolean isValidBST(TreeNode root) {
        return isValidBST(root, Long.MIN_VALUE, Long.MAX_VALUE);
    }
    public boolean isValidBST(TreeNode root, Long min, Long max) {
        if(root == null) return true;
        if(root.val <= min || root.val >= max) return false;
        return isValidBST(root.left, min, (long) root.val) && isValidBST(root.right, (long) root.val, max);
    }
}