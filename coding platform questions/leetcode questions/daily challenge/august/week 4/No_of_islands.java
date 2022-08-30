public class No_of_islands {
    public static void main(String[] args) {
        char[][] grid = { {'1','1','0','0','0'},
        {'1','1','0','0','0'},
        {'0','0','1','0','0'},
        {'0','0','0','1','1'}};
        Solution obj = new Solution();
        System.out.println(obj.numIslands(grid));
    }
}
class Solution {
    public int numIslands(char[][] grid) {
        int islands = 0;
        for (int i = 0; i < grid.length; i++) {
            for (int j = 0; j < grid[0].length; j++) {
                if(grid[i][j]=='1' ){
                    DFSMarking(grid,i,j);
                    islands++;
                }
            }
        }
        return islands;
    }
    void DFSMarking(char[][] grid, int i , int j){
        if(i<0 || j<0 || i>=grid.length || j>=grid[0].length || grid[i][j] != '1') return;
        grid[i][j] = '0';
        DFSMarking(grid, i+1, j);
        DFSMarking(grid, i-1, j);
        DFSMarking(grid, i, j+1);
        DFSMarking(grid, i, j-1);
    }
}