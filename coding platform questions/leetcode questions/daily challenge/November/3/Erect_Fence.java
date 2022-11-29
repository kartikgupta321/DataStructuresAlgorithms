import java.util.ArrayList;
import java.util.List;

public class Erect_Fence {
    public static void main(String[] args) {
        int[][] trees = {{2,2},{2,0},{1,1},{2,4},{3,3},{4,2} };
        Solution obj = new Solution();
        int[][] ans = obj.outerTrees(trees);
        for (int i = 0; i < ans.length; i++) {
            for (int j = 0; j < ans[i].length; j++) {
                System.out.println(ans[i][j]);
            }
        }
    }
}
class Solution{
    public int[][] outerTrees(int[][] trees){
        int[][] ans = new int[0][0];
        List<int[]> list = new ArrayList<>();
        int[] point = trees[0];
        for (int i = 1; i < trees.length; i++) {
                if(trees[i][0]<point[0]){
                    point = trees[i];
                }
        }
        for (int i = 0; i < trees.length; i++) {
            
        }
        return ans;
    }
}