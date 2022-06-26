public class same_tree {
    public static void main(String[] args) {
        TreeNode p = new TreeNode(1);
        p.left = new TreeNode(2);
        p.left.left = new TreeNode(4);
        p.left.right = new TreeNode(5);
        p.right = new TreeNode(3);
        p.right.left = new TreeNode(6);
        p.right.right = new TreeNode(7);
        TreeNode q= new TreeNode(1);
        q.left = new TreeNode(2);
        q.left.left = new TreeNode(4);
        q.left.right = new TreeNode(5);
        q.right = new TreeNode(3);
        q.right.left = new TreeNode(6);
        q.right.right = new TreeNode(7);
        
        Solution obj = new Solution();
        System.out.println(obj.isSameTree(p, q));
    }
}
class Solution {
    public boolean isSameTree(TreeNode p, TreeNode q) {
        if(p==null && q==null) return true;
        if(p==null || q==null) return false;
        if(p.val!=q.val) return false;
        return isSameTree(p.left, q.left) && isSameTree(p.right, q.right);
    }
}