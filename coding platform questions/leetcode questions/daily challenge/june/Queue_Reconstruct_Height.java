import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;

public class Queue_Reconstruct_Height {
    public static void main(String[] args) {
        int[][] people = { {7,0},{4,4},{7,1},{5,0},{6,1},{5,2}};
        Solution obj = new Solution();
        int[][] ans = obj.reconstructQueue(people);
        for (int i = 0; i < ans.length; i++) {
            for (int j = 0; j < ans[i].length; j++) {
                System.out.print(ans[i][j]);
            }
            System.out.print(" ");
        }
    }
}
class Solution {
    public int[][] reconstructQueue(int[][] people) {
        Arrays.sort(people, (a,b) -> a[0]==b[0] ? a[1]-b[1] : b[0] - a[0]);

        List<int[]> ordered = new LinkedList<>();

        for(int[] p : people) ordered.add(p[1], p);

        return ordered.toArray(new int[people.length][2]);
    }
}