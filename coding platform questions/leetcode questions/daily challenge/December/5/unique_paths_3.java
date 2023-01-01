public class unique_paths_3 {
    public static void main(String[] args) {
        int[][] grid = { {1,0,0,0},{0,0,0,0},{0,0,2,-1}};
        Solution obj = new Solution();
        System.out.println(obj.uniquePathsIII(grid));
    }
}


class Solution {
    int res=0,empty=1,sx,sy;
    public int uniquePathsIII(int[][] grid) {
        for (int i = 0; i < grid.length; i++) {
            for (int j = 0; j < grid[0].length; j++) {
                if(grid[i][j]==0) empty++;
                else if(grid[i][j]==1) {
                    sx = i;
                    sy = j;
                }
            }
        }
        dfs(grid, sx, sy);
        return res;
    }
    public void dfs(int[][]grid,int x,int y){
        if(x<0 || y<0 || x>=grid.length || y>=grid[0].length || grid[x][y] <0 ) return;
        if(grid[x][y]==2) {
            if(empty==0) res++;
            return;
        }
        grid[x][y] = -2;
        empty--;
        dfs(grid, x+1, y);
        dfs(grid, x-1, y);
        dfs(grid, x, y+1);
        dfs(grid, x, y-1);
        grid[x][y] = 0;
        empty++;
    }
}


// class Solution{
// int res = 0, empty = 1, sx, sy;
//     public int uniquePathsIII(int[][] grid) {
//         int m = grid.length, n = grid[0].length;
//         for (int i = 0; i < m; ++i) {
//             for (int j = 0; j < n; ++j) {
//                 if (grid[i][j] == 0) empty++;
//                 else if (grid[i][j] == 1) {
//                     sx = i;sy = j;
//                 }
//             }
//         }
//         dfs(grid, sx, sy);
//         return res;
//     }
//     public void dfs(int[][] grid, int x, int y) {
//         if (x<0 || x >= grid.length || y<0 || y >= grid[0].length || grid[x][y] < 0)return;
//         if (grid[x][y] == 2) {
//             if (empty == 0) res++;
//             return;
//         }
//         grid[x][y] = -2;
//         empty--;
//         dfs(grid, x + 1, y);
//         dfs(grid, x - 1, y);
//         dfs(grid, x, y + 1);
//         dfs(grid, x, y - 1);
//         grid[x][y] = 0;
//         empty++;
//     }
// }