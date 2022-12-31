import java.util.ArrayList;
import java.util.List;

public class q4 {
    public static void main(String[] args) {
        int[][] grid = {{1,2,3},{2,5,7},{3,5,1} };
        int[] queries = { 5,6,2};
        Solution obj = new Solution();
        int[] ans = obj.maxPoints(grid, queries);
        for (int i : ans) {
            System.out.print(i+" ");
        }
    }
}
class Solution {
    List<int[]> list = new ArrayList<>();
    int sum = 0;
    public int[] maxPoints(int[][] grid, int[] queries) {
        int[] ans = new int[queries.length];

        for (int i = 0; i < queries.length; i++) {
            dfs(i,grid,queries,0,0);
            ans[i] = sum;
            sum = 0;
        }
        return ans;
    }
    public void dfs(int index,int[][] grid,int[]queries,int i,int j){
        int[] add = {i,j};
        if(i>=0 && j>=0 && i<grid.length && j<grid[0].length && grid[i][j]<queries[index] && list.contains(add)==false){
            sum++;
            list.add(add);
            dfs(index, grid, queries, i+1, j);
            System.out.println(grid[i][j]);
            dfs(index, grid, queries, i-1, j);
            dfs(index, grid, queries, i, j-1);
            dfs(index, grid, queries, i, j+1);
        }
        else return;
    }
}