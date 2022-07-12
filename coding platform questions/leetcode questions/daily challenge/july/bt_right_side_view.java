import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;
public class bt_right_side_view {
    public static void main(String[] args) {
        TreeNode p = new TreeNode(1);
        p.left = new TreeNode(2);
        p.left.left = new TreeNode(5);
        p.left.left.right = new TreeNode(6);
        p.right = new TreeNode(3);
        // p.right.left = new TreeNode(6);
        p.right.right = new TreeNode(4);
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
        Queue<TreeNode> que = new LinkedList<>();
        que.add(root);
        while(!que.isEmpty()){
            int qlen = que.size();
            TreeNode curr= new TreeNode();
            for (int i = 0; i < qlen; i++) {
                curr = que.poll();
                if(curr.left!=null) que.add(curr.left);
                if(curr.right!=null) que.add(curr.right);
            }
            list.add(curr.val);
        }
        return list;
    }
}