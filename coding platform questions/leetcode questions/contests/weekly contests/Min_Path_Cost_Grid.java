public class Min_Path_Cost_Grid {
    public static void main(String[] args) {
        Solution obj=new Solution();
        int[][] grid = {{5,3},{4,0},{2,1} };
        int[][] moveCost = {{9,8},{1,5},{10,12},{18,6},{2,4},{14,3} };
        System.out.println(obj.minPathCost(grid, moveCost));
    }
}
class Solution {
    public int minPathCost(int[][] grid, int[][] moveCost) {
        int cost = 0;
        for (int i = 0; i < grid.length; i++) {
            int ccost = grid[i][0];
            int min = moveCost[grid[i][0]][0];
            for (int j = 1; j < moveCost[grid[i][0]].length; j++) {
                if(moveCost[grid[i][0]][j] < min) min = moveCost[grid[i][0]][j] ;
            }
            ccost += min;
        }

        return cost;
    }
}