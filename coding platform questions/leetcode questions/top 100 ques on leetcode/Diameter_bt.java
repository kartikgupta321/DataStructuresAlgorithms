public class Diameter_bt {
    public static void main(String[] args) {
        TreeNode root = new TreeNode(1);
        root.left = new TreeNode(2);
        root.right = new TreeNode(3);
        root.left.left = new TreeNode(4);
        root.left.right = new TreeNode(5);
        Solution obj = new Solution();
        System.out.println(obj.diameterOfBinaryTree(root));
    }
}
class Solution{
    int ans = 0;
    public int diameterOfBinaryTree(TreeNode root){
        dfs(root);
        return ans;
    }
    int dfs(TreeNode root){
        if(root == null) return -1;
        int left = dfs(root.left);
        int right = dfs(root.right);
        ans = Math.max(ans, 2 + left + right);
        return 1 + Math.max(left, right);
    }
}
class TreeNode{
    int val;
    TreeNode left;
    TreeNode right;
    TreeNode(){};
    TreeNode (int val){this.val = val;}
    TreeNode (int val,TreeNode left,TreeNode right){
        this.val = val;
        this.left = left;
        this.right = right;
    }
}