class bt_preorder_inorder{
    public static void main(String[] args) {
        int[] preorder= {1,2,4,5,3,6,7};
        int[] inorder = {4,2,5,1,6,3,7};
        Solution obj = new Solution();
        TreeNode root = obj.buildTree(preorder, inorder);
        System.out.println(root.val);
    }
}
class Solution {
    public TreeNode buildTree(int[] preorder, int[] inorder) {
        TreeNode root = new TreeNode(preorder[0]);
        int i=1;
        TreeNode curr = root;
        while (i < preorder.length) {
            
        }
        return root;
    }
}



class TreeNode{
    int val;
    TreeNode left;
    TreeNode right;
    TreeNode(){}
    TreeNode (int val) {this.val = val;}
    TreeNode(int val , TreeNode left,TreeNode right){
        this.val = val;
        this.left = left;
        this.right = right;
    }
}