import java.util.Arrays;
import java.util.HashMap;
import java.util.List;

class Most_stones_removed{
    public static void main(String[] args) {
        int[][] stones = { {3,2},{3,1},{4,4},{1,1},{0,2},{4,0}};
        Solution obj = new Solution();
        System.out.println(obj.removeStones(stones));
    }
}
class Solution {
    public int removeStones(int[][] stones) {
        
    }
    int find(int v){
        if(dsuf[v]==-1)
        return v;
        return find(dsuf[v]);
    }
    void Union(int x,int y){
        
    }
}