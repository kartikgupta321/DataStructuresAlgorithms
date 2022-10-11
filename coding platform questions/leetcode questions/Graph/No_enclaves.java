public class No_enclaves {
    public static void main(String[] args) {
        Solution obj = new Solution();
        int[][] grid = { {0,0,0,0},{1,0,1,0},{0,1,1,0},{0,0,0,0}};
        System.out.println(obj.numEnclaves(grid));
    }
}
class Solution {
    int[] dsuf;
    public int numEnclaves(int[][] grid) {
        int count = 0;
        dsuf = new int[grid.length * grid[0].length + 1];
        int index = 0;
        for (int i = 0; i < grid.length; i++) {
            for (int j = 0; j < grid[i].length; j++) {
                if(grid[i][j]==1){
                    if(i-1==-1 || i+1==grid.length || j-1==-1 || j+1==grid[0].length ){
                        Union(index, grid.length * grid[0].length);
                    } 
                    if(j-1 > 0 && grid[i][j-1]==1) Union(index, index-1);
                    if(i-1 > 0 && grid[i-1][j]==1) Union(index, index - grid[0].length);
                    if(j+1 <grid[0].length &&grid[i][j+1]==1) Union(index, index+1);
                    if(i+1 <grid.length &&grid[i+1][j]==1) Union(index, index + grid[0].length);
                }
                index++;
            }
        }
        index=0;
        for (int i = 0; i < grid.length; i++) {
            for (int j = 0; j < grid[i].length; j++) {
                if(grid[i][j]==1){
                    if(Find(index)!=grid.length * grid[0].length) count++;
                }
                index++;
            }
        }

        for (int i = 0; i < dsuf.length; i++) {
            System.out.println(dsuf[i]);
            if(dsuf[i]!=0) System.out.println("find"+Find(i));
        }
        System.out.println(dsuf[15]);
        return count;
    }
    int Find(int v){
        if(dsuf[v]==0) return v;
        return dsuf[v] = Find(dsuf[v]);
    }
    void Union(int fromP, int toP){
        fromP = Find(fromP);
        toP = Find(toP);
        
        if(fromP != toP){
            if(fromP==dsuf.length-1) dsuf[toP] = fromP;
            else dsuf[fromP] = toP;
        }
    }
}