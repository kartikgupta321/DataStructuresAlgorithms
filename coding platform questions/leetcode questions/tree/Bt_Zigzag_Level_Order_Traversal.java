import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;
import java.util.Stack;

public class Bt_Zigzag_Level_Order_Traversal {
    public static void main(String[] args) {
        TreeNode p = new TreeNode(1);
        p.left = new TreeNode(2);
        p.left.left = new TreeNode(4);
        p.left.right = new TreeNode(5);
        p.right = new TreeNode(3);
        p.right.left = new TreeNode(6);
        p.right.right = new TreeNode(7);
        Solution obj = new Solution();
        List<List<Integer>> list = obj.zigzagLevelOrder(p);
        for (int i = 0; i < list.size(); i++) {
            for (int j = 0; j < list.get(i).size(); j++) {
                System.out.print(list.get(i).get(j));
            }
            System.out.println();
        }
    }
}
class Solution {
    List<List<Integer>> ans = new ArrayList<>();
    public List<List<Integer>> zigzagLevelOrder(TreeNode root) {
        if(root == null) return ans;
        Queue<TreeNode> que = new LinkedList<>();
        Stack<TreeNode> stack = new Stack<>();
        int counter = 0; 
        que.add(root);
        while(!que.isEmpty()){
            int qlen = que.size();
            List<Integer> row = new ArrayList<>();
            if(counter==0){
                for (int i = 0; i < qlen; i++) {
                    TreeNode curr = que.poll();
                    row.add(curr.val);
                    if(curr.left!=null) que.add(curr.left);              
                    if(curr.right!=null) que.add(curr.right);
                }
                counter = 1;
            }
            else{
                for (int i = 0; i < qlen; i++) {
                    TreeNode curr = que.poll();
                    stack.add(curr);
                    if(curr.left!=null){
                        que.add(curr.left);
                    }              
                    if(curr.right!=null){
                        que.add(curr.right);
                    }              
                }
                while (!stack.isEmpty()) {
                    row.add(stack.pop().val);
                }
                counter = 0;
            }
            ans.add(row);
        }
        return ans;
    }
}