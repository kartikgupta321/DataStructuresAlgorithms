import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

class Avg_levels_bt{
    public static void main(String[] args) {
        Solution obj = new Solution();
        TreeNode head= new TreeNode(1);
        head.left = new TreeNode(2);
        head.right = new TreeNode(3);
        head.right.left = new TreeNode(6);
        head.left.left = new TreeNode(4);
        head.left.right = new TreeNode(5);        
        head.right.right = new TreeNode(7);        
        
        List<Double> list = obj.averageOfLevels(head);
        for (int i = 0; i < list.size(); i++) {
            System.out.println(list.get(i));
        }
    }
}
class Solution {
    public List<Double> averageOfLevels(TreeNode root) {
        List<Double> list = new ArrayList<>(); 
        Queue<TreeNode> que = new LinkedList<>();

        que.add(root);
        while (que.isEmpty() != true) {
            Double qlen = (double) que.size();
            Double sum = (double) 0;
            for (int i = 0; i < qlen; i++) {
                sum += que.peek().val;
                TreeNode curr = que.poll();
                if(curr.left != null) {
                    que.add(curr.left); 
                }
                if(curr.right != null) {
                    que.add(curr.right); 
                }
            }
            list.add(sum/qlen);
        }
        return list;
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