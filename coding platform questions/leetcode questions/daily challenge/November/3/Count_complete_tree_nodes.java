public class Count_complete_tree_nodes {
    public static void main(String[] args) {
        TreeNode root = new TreeNode(1);
        root.left = new TreeNode(2);
        root.right = new TreeNode(3);
        root.left.left = new TreeNode(4);
        root.left.right = new TreeNode(5);
        root.right.left = new TreeNode(6);
        Solution obj = new Solution();
        System.out.println(obj.countNodes(root));
    }
}
class Solution {
    public int countNodes(TreeNode root) {
        if(root == null) return 0;

        int left_levels = 1;
        TreeNode l = root.left;
        while (l != null) {
            l = l.left;
            left_levels++;
        }
        int right_levels = 1;
        TreeNode r = root.right;
        while (r != null) {
            r = r.right;
            right_levels++;
        }
        if(left_levels == right_levels) return (int) (Math.pow(2, left_levels)-1);
        return 1+countNodes(root.left)+countNodes(root.right);
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