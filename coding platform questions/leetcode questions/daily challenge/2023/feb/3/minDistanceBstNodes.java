class minDistanceBstNodes{
    public static void main(String[] args) {
        TreeNode root = new TreeNode(1);
        root.left = new TreeNode(2);
        root.right = new TreeNode(3);

        Solution obj = new Solution();
        System.out.println(obj.minDiffInBST(root));
    }
}
class Solution {
    public int minDiffInBST(TreeNode root) {
        int ans = 0;
        return ans;


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