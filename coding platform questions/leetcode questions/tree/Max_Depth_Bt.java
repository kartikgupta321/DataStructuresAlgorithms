public class Max_Depth_Bt {
    public static void main(String[] args) {
        TreeNode p = new TreeNode(1);
        p.left = new TreeNode(2);
        p.left.left = new TreeNode(4);
        p.left.right = new TreeNode(5);
        p.left.right.left = new TreeNode(50);
        p.right = new TreeNode(3);
        p.right.left = new TreeNode(6);
        p.right.right = new TreeNode(7);
        Solution obj = new Solution();
        System.out.println(obj.maxDepth(p));
    }
}
class Solution {
    public int maxDepth(TreeNode root) {
        if(root == null) return 0;
        return 1+Math.max(maxDepth(root.left), maxDepth(root.right));
    }
}