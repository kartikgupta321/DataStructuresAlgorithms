public class Bt_Pruning {
    public static void main(String[] args) {
        TreeNode p = new TreeNode(1);
        p.left = new TreeNode(0);
        p.left.left = new TreeNode(0);
        p.left.right = new TreeNode(0);
        p.right = new TreeNode(1);
        p.right.left = new TreeNode(0);
        p.right.right = new TreeNode(1);
        Solution obj = new Solution();
        obj.pruneTree(p);
        System.out.println(p.right.right.val);
    }
}
class Solution {
    public TreeNode pruneTree(TreeNode root) {
        if(root==null) return null;
        if(root.left==null && root.right==null &&  root.val==0) return null;
        if(root.left!=null && root.left.val==0) root.left = pruneTree(root.left);
        if(root.right!=null && root.right.val==0) root.right = pruneTree(root.right);
        if(root.left!=null) root.left = pruneTree(root.left);
        if(root.right!=null) root.right = pruneTree(root.right);
        return root;
    }
}