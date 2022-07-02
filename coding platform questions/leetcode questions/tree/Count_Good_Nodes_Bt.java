public class Count_Good_Nodes_Bt {
    public static void main(String[] args) {
        TreeNode p = new TreeNode(5);
        p.left = new TreeNode(4);
        p.right = new TreeNode(6);
        p.right.left = new TreeNode(3);
        p.right.right = new TreeNode(7);
        Solution obj = new Solution();
        System.out.println(obj.goodNodes(p));
    }
}
class Solution {
    int ans=0;
    public int goodNodes(TreeNode root) {
        
        return goodNodes(root, Integer.MIN_VALUE);
    }
    public int goodNodes(TreeNode root , int max){
        if(root==null) return 0;
        if(root.val >= max ) {
            ans++;
            max = root.val;
        } 
        return goodNodes(root.left, max) + goodNodes(root.right, max);
    }
}