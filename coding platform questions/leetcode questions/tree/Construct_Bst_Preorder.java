public class Construct_Bst_Preorder {
    public static void main(String[] args) {
        int[] preorder = {1,3};
        Solution obj = new Solution();
        TreeNode root = obj.bstFromPreorder(preorder);
        System.out.println(root.right.val );
    }
}
class Solution {
    public TreeNode bstFromPreorder(int[] preorder) {
        TreeNode root = new TreeNode(preorder[0]);
        for (int i = 1; i < preorder.length; i++) {
            TreeNode curr = root;
            TreeNode prev = root;
            while (curr!=null) {
                prev = curr;
                if(preorder[i]<curr.val){
                    curr = curr.left;
                }
                else{
                    curr = curr.right;
                }
            }
            if(preorder[i]<prev.val) prev.left = new TreeNode(preorder[i]);
            else prev.right = new TreeNode(preorder[i]);
        }
        return root;
    }
}