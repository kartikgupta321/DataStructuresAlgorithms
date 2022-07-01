import java.util.ArrayList;
import java.util.List;

public class Bt_Right_View {
    public static void main(String[] args) {
        TreeNode p = new TreeNode(1);
        p.left = new TreeNode(2);
        p.left.left = new TreeNode(4);
        p.left.right = new TreeNode(5);
        p.right = new TreeNode(3);
        p.right.left = new TreeNode(6);
        p.right.right = new TreeNode(7);
        Solution obj = new Solution();
        List<Integer> list = obj.rightSideView(p);
        for (int i = 0; i < list.size(); i++) {
            System.out.print(list.get(i)+" ");
        }
    }
}
class Solution {
    List<Integer> list = new ArrayList<>();
    public List<Integer> rightSideView(TreeNode root) {
        if(root==null) return list;
        list.add(root.val);
        if(root.right!=null) {
            rightSideView(root.right);
        }
        return list;
    }
}