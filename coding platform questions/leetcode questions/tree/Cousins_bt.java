public class Cousins_bt {
    public static void main(String[] args) {
        TreeNode p = new TreeNode(1);
        p.left = new TreeNode(2);
        p.left.left = new TreeNode(4);
        p.left.right = new TreeNode(5);
        p.right = new TreeNode(3);
        p.right.left = new TreeNode(6);
        p.right.right = new TreeNode(7);
        Solution obj = new Solution();
        System.out.println(obj.isCousins(p, 4, 3));
    }
}
class Solution {
    TreeNode xparent;
    TreeNode yparent;
    public boolean isCousins(TreeNode root, int x, int y) {
        if(root==null) return false;
        if(root.left.val==x ||root.right.val==x) xparent = root; 
        if(root.left.val==y || root.right.val==y) yparent = root;
        if(xparent != yparent) return true;
        return isCousins(root.left, x, y) && isCousins(root.right, x, y);
    }
}