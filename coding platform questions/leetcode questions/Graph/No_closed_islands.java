public class No_closed_islands {
    public static void main(String[] args) {
        int[][] grid = { {1,1,1,1,1,1,1,0},{1,0,0,0,0,1,1,0},{1,0,1,0,1,1,1,0},{1,0,0,0,0,1,0,1},{1,1,1,1,1,1,1,0}};
        Solution obj = new Solution();
        System.out.println(obj.closedIsland(grid));    
    }
}
// o land 1 water
class Solution {
    public int closedIsland(int[][] grid) {
        int islands = 0;
        for (int i = 0; i < grid[0].length; i++) {
            if(grid[0][i]==0) dfs(0, i, grid);
            if(grid[grid.length-1][i]==0) dfs(grid.length-1, i, grid);
        }
        for (int i = 0; i < grid.length; i++) {
            if(grid[i][0]==0) dfs(i, 0, grid);
            if(grid[i][grid[0].length-1]==0) dfs(i, grid[0].length-1, grid);
        }
        for (int i = 0; i < grid.length; i++) {
            for (int j = 0; j < grid[0].length; j++) {
                if(grid[i][j]==0){
                    dfs(i,j,grid);
                    islands++;
                }
            }
        }
        return islands;
    }
    void dfs(int i , int j ,int[][] grid){
        int m = grid.length, n = grid[0].length;
        if(i<0 || j<0 || i>=m || j>=n || grid[i][j]!=0) return;
        grid[i][j] = 1;
        dfs(i + 1, j,grid);
        dfs(i - 1, j, grid);
        dfs(i , j+1,grid);
        dfs(i , j-1,grid);
    }
}