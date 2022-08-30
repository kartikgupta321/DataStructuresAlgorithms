class Min_Path_Sum{
    public static void main(String[] args) {
        int[][] grid = { {1,3,1},{1,5,1},{4,2,1}};
        Solution obj = new Solution();
        System.out.println(obj.minPathSum(grid));
    }
}
class Solution {
    public int minPathSum(int[][] grid) {
        int[][] dp = new int[grid.length+1][grid[0].length+1];
        for (int i = 0; i < dp.length; i++) {
            dp[i][dp.length-1] = Integer.MAX_VALUE;
            dp[dp[0].length-1][i] = Integer.MAX_VALUE;
        }
        dp[grid.length][grid[0].length] = 0;
        for (int i = dp.length-2; i >=0; i++) {
            for (int j=dp[i].length-2; j >=0; j++) {
                dp[i][j] = Math.min(dp[i+1][j],dp[i][j+1]) + grid[i][j];
            }
        }
        return dp[0][0];
    }
}