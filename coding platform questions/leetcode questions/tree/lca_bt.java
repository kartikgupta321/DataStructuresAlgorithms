public class lca_bt {
    public static void main(String[] args) {
        Solution obj = new Solution();
        TreeNode head= new TreeNode(3);
        head.left = new TreeNode(5);
        head.right = new TreeNode(1);
        head.right.left = new TreeNode(0);
        head.right.right = new TreeNode(8);
        head.left.left = new TreeNode(6);
        head.left.right = new TreeNode(2); 
        head.left.right.left = new TreeNode(7); 
        head.left.right.right = new TreeNode(4); 
        TreeNode ans = obj.lowestCommonAncestor(head, head.left.left, head.left.right.right);
        System.out.println(ans.val);
    }
}
class Solution {
    public TreeNode lowestCommonAncestor(TreeNode root, TreeNode p, TreeNode q) {
        // base case in this que we have used null and root in place of true and false. I loved it
        if(root == null || root == p || root==q) return root;
        // traversing the trees looking for p and q 
        TreeNode left = lowestCommonAncestor(root.left, p, q);
        TreeNode right = lowestCommonAncestor(root.right, p, q);
        // returning null or root according to if p and q are found or not.
        if(left == null) return right;
        else if(right == null) return left;
        else return root;
    }
}