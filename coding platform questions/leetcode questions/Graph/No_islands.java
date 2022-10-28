public class No_islands {
    public static void main(String[] args) {
        char[][] grid = { {'1','1','0','0','0'},{'1','1','0','0','0'},{'0','0','1','0','0'},{'0','0','0','1','1'}};
        Solution obj = new Solution();
        System.out.println(obj.numIslands(grid));
    }
}
class Solution {
    public int numIslands(char[][] grid) {
        int count = 0;
        for (int i = 0; i < grid.length; i++) {
            for (int j = 0; j < grid[0].length; j++) {
                if(grid[i][j] == '1'){
                    dfs(i,j,grid);
                    count++;
                }              
            }
        }
        return count;
    }
    void dfs(int i , int j ,char[][] grid){
        int m = grid.length, n = grid[0].length;
        if(i<0 || j<0 || i>=m || j>=n || grid[i][j]!='1') return;
        grid[i][j] = '0';
        dfs(i + 1, j,grid);
        dfs(i - 1, j, grid);
        dfs(i , j+1,grid);
        dfs(i , j-1,grid);
    }
}