class q1{
    public static void main(String[] args) {
        int [][] grid = {{2,0,0,1},{0,3,1,0},{0,5,2,0},{4,0,0,2}};
        Solution obj = new Solution();
        System.out.println(obj.checkXMatrix(grid));
    }
}
class Solution {
    public boolean checkXMatrix(int[][] grid) {
        for (int i = 0; i < grid.length; i++) {
            for (int j = 0; j < grid.length; j++) {
                if(i==j || i+j == grid.length-1){
                    if(grid[i][j]==0) return false;
                }
                else{
                    if(grid[i][j]!=0) return false;
                }
            }
        }
        return true;
    }
}