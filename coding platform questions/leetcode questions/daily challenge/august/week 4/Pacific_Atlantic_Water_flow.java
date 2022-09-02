import java.util.ArrayList;
import java.util.List;

public class Pacific_Atlantic_Water_flow {
    public static void main(String[] args) {
        int[][] heights = { {1,2,2,3,5},{3,2,3,4,4},{2,4,5,3,1},{6,7,1,4,5},{5,1,1,2,4} };
        Solution obj = new Solution();
        List<List<Integer>> ans = obj.pacificAtlantic(heights);
        for (int i = 0; i < ans.size(); i++) {
            for (int j = 0; j < ans.get(i).size(); j++) {
                System.out.print(ans.get(i).get(j)+" ");
            }
            System.out.println();
        }

    }
}
class Solution {
    public List<List<Integer>> pacificAtlantic(int[][] heights) {
        List<List<Integer>> ans = new ArrayList<>();
        ans.add()
        return ans;
    }
}