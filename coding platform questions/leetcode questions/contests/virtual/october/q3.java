public class q3 {
    public static void main(String[] args) {
        TreeNode root = new TreeNode(1);
        root.left = new TreeNode(2);        
        root.right = new TreeNode(3);        
        root.left.left = new TreeNode(4);        
        root.left.right = new TreeNode(5);        
        root.right.left = new TreeNode(6);        
        root.right.right = new TreeNode(7);
        Solution obj = new Solution();
        obj.reverseOddLevels(root);
        System.out.println(root.left);        
    }
}

class Solution {
    public TreeNode reverseOddLevels(TreeNode root) {
        
    }
}





class TreeNode {
    int val;
    TreeNode left;
    TreeNode right;
    TreeNode() {}
    TreeNode(int val) { this.val = val; }
    TreeNode(int val, TreeNode left, TreeNode right) {
        this.val = val;
        this.left = left;
        this.right = right;
    }
}