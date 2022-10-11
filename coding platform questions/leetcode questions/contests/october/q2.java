public class q2 {
    public static void main(String[] args) {
        // int[][] grid = { {6,2,1,3},{4,2,1,5},{9,2,8,7},{4,1,2,9}};
        int[][] grid = { {1,2,3},{4,5,6},{7,8,9}};
        Solution obj = new Solution();
        System.out.println(obj.maxSum(grid));
    }
}
class Solution {
    public int maxSum(int[][] grid) {
        int sum = 0;
        int m = grid.length,n = grid[0].length;
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                if (j<=n-3 && i<=m-3) {
                    int var = grid[i][j]+grid[i][j+1]+grid[i][j+2]+grid[i+1][j+1]+grid[i+2][j]+grid[i+2][j+1]+grid[i+2][j+2];
                    sum = Math.max(sum, var);
                }
            }
        }
        return sum;
    }
}