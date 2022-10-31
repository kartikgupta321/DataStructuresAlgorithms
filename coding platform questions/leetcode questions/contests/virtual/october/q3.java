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
        System.out.println(root.left.val);        
    }
}

class Solution {
    public TreeNode reverseOddLevels(TreeNode root) {
        helper(root.left, root.right, 1);
        return root;
    }
    void helper(TreeNode node1, TreeNode node2, int lvl){
        if(node1==null || node2==null) return;
        if(lvl % 2 == 1){
            int temp = node1.val;
            node1.val = node2.val;
            node2.val = temp;
        }
        helper(node1.left, node2.right, lvl+1);
        helper(node1.right, node2.left, lvl+1);
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