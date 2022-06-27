import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class bt_levelorder {
    public static void main(String[] args) {
        TreeNode p = new TreeNode(1);
        p.left = new TreeNode(2);
        p.left.left = new TreeNode(4);
        p.left.right = new TreeNode(5);
        p.right = new TreeNode(3);
        p.right.left = new TreeNode(6);
        p.right.right = new TreeNode(7);
        Solution obj = new Solution();
        List<List<Integer>> list = obj.levelOrder(p);
        for (int i = 0; i < list.size(); i++) {
            for (int j = 0; j < list.get(i).size(); j++) {
                System.out.print(list.get(i).get(j));
            }
            System.out.println();
        }
    }
}
class Solution {
    List<List<Integer>> list = new ArrayList<>();
    public List<List<Integer>> levelOrder(TreeNode root) {
        if(root==null) return list;
        Queue<TreeNode> queue = new LinkedList<>();
        queue.add(root);
        while (queue.size() != 0) {
            int qlen = queue.size();
            List<Integer> row = new ArrayList<>();
            for (int i = 0; i < qlen; i++) {
                TreeNode curr = queue.poll();
                row.add(curr.val);
                if(curr.left != null) queue.add(curr.left);
                if(curr.right != null) queue.add(curr.right);
            }
            list.add(row);
        }
        return list;
    }
}