public class min_path_sum_bt {
    public static void main(String[] args) {
        TreeNode root = new TreeNode(5);
        root.left = new TreeNode(4);
        root.left.left = new TreeNode(11);
        root.left.left.left = new TreeNode(7);
        root.right = new TreeNode(8);
        root.right.right = new TreeNode(4);
        root.right.right.right = new TreeNode(1);
        root.right.left = new TreeNode(13);
        Solution obj = new Solution();
        System.out.println(obj.hasPathSum(root, 22));
    }
}

class Solution {
    public boolean hasPathSum(TreeNode root, int targetSum) {
        
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