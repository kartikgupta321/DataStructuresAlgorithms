import java.util.Arrays;

class teamNoConflicts{
    public static void main(String[] args) {
        int[] scores = {};
        int[] ages = {};
        Solution obj = new Solution();
        System.out.println(obj.bestTeamScore(scores, ages));
    }
}
class Solution {
    public int bestTeamScore(int[] scores, int[] ages) {
        int ans = 0;
        int both[][] = new int[ages.length][2];
        for (int i = 0; i < ages.length; i++) {
            both[i][0] = ages[i];
            both[i][1] = scores[i];
        }
        Arrays.sort(both,(a,b)->Integer.compare(a[0], b[0]));
        for (int i = 0; i < ages.length; i++) {
            int sum = 0;
            for (int j = i; j < ages.length; j++) {

            }
        }
        return ans;
    }
}