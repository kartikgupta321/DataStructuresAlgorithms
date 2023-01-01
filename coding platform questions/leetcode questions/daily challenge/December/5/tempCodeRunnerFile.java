ic void dfs(int[][] grid, int x, int y) {
    //     if (x<0 || x >= grid.length || y<0 || y >= grid[0].length || grid[x][y] < 0)return;
    //     if (grid[x][y] == 2) {
    //         if (empty == 0) res++;
    //         return;
    //     }
    //     grid[x][y] = -2;
    //     empty--;
    //     dfs(grid, x + 1, y);
    //     dfs(grid, x - 1, y);
    //     dfs(grid, x, y + 1);
    //     dfs(grid, x, y - 1);
    //     grid[x][y] = 0;
    //     empty++;
    // }