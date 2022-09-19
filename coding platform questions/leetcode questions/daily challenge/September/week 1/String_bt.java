public class String_bt {
    public static void main(String[] args) {
        Solution obj = new Solution();
        TreeNode head= new TreeNode(1);
        head.left = new TreeNode(2);
        head.right = new TreeNode(3);
        head.left.right = new TreeNode(4);
        System.out.println(obj.tree2str(head));
    }
}
class Solution {
    StringBuilder str = new StringBuilder();
    public String tree2str(TreeNode root) {
        if(root == null) return str.toString();
        str.append(root.val);
        if(root.left==null && root.right==null) return str.toString();
        str.append('(');
        tree2str(root.left);
        str.append(')');
        if(root.right != null){
            str.append('(');
            tree2str(root.right);
            str.append(')');
        }
        return str.toString();
    }
}