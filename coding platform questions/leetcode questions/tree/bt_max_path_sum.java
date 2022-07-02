public class bt_max_path_sum {
    public static void main(String[] args) {
        TreeNode p = new TreeNode(5);
        p.left = new TreeNode(4);
        p.right = new TreeNode(6);
        p.right.left = new TreeNode(3);
        p.right.right = new TreeNode(7);
        Solution obj = new Solution();
        System.out.println(obj.maxPathSum(p));
    }
}
class Solution {
    int maxsum= Integer.MIN_VALUE;
    public int maxPathSum(TreeNode root) {
        maxdownsum(root);
        return maxsum;
    }
    public int maxdownsum(TreeNode node){
        if(node == null) return 0;
        int left = Math.max(0, maxdownsum(node.left));
        int right = Math.max(0, maxdownsum(node.right));
        maxsum = Math.max(maxsum, left+ right + node.val);
        return Math.max(left, right) + node.val;
    }
}