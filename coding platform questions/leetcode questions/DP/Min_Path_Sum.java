class Min_Path_Sum{
    public static void main(String[] args) {
        int[][] grid = { {1,3,1},{1,5,1},{4,2,1}};
        Solution obj = new Solution();
        System.out.println(obj.minPathSum(grid));
    }
}
class Solution {
    public int minPathSum(int[][] grid) {
        int m = grid.length,n = grid[0].length;
        int[][] dp = new int[m+1][n+1];
        for (int i = 0; i < dp.length; i++) {
            dp[i][dp[0].length-1] = Integer.MAX_VALUE;
        }
        for (int i = 0; i < dp[0].length; i++) {
            dp[dp.length-1][i] = Integer.MAX_VALUE;
        }
        dp[m-1][n] = 0;
        System.out.println(dp[m-1][n-1]);
        for (int i = m-1; i >=0; i--) {
            for (int j= n-1; j >=0; j--) {
                dp[i][j] = Math.min(dp[i+1][j],dp[i][j+1]) + grid[i][j];
            }
        }
        return dp[0][0];
    }
}