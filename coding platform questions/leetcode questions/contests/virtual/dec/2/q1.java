import java.util.ArrayList;
import java.util.List;

public class q1 {
    public static void main(String[] args) {
        int[][] grid = { {1,2,4},{3,3,1}};
        Solution obj = new Solution();
        System.out.println(obj.deleteGreatestValue(grid));
    }
}
class Solution {
    public int deleteGreatestValue(int[][] grid) {
        int ans=0;
        for (int i = 0; i < grid[0].length; i++) {
            List<Integer> list = new ArrayList<>();
            for (int j = 0; j < grid.length; j++) {
                int max = 0,maxi=0,maxj=0;
                for (int j2 = 0; j2 < grid[0].length; j2++) {
                    if(grid[j][j2]>max){
                        max = grid[j][j2];
                        maxi = j;
                        maxj = j2;
                    } 
                }
                grid[maxi][maxj] =0;
                
                list.add(max);
                System.out.print(list);
            }
            for (int j = 0; j < grid.length; j++) {
                for (int j2 = 0; j2 < grid[0].length; j2++) {
                    System.out.print(grid[j][j2]);
                }
                System.out.println();
            }
            list.sort(null);
            System.out.println(list.get(list.size()-1));
            ans += list.get(list.size()-1);
        }
        return ans;
    }
}