import java.util.Arrays;

public class max_bags_rocks {
    public static void main(String[] args) {
        int[] capacity = { 2,3,4,5};
        int[] rocks = { 1,2,4,4};
        Solution obj = new Solution();
        System.out.println(obj.maximumBags(capacity, rocks, 2));
    }
}
class Solution {
    public int maximumBags(int[] capacity, int[] rocks, int additionalRocks) {
        int[] diff = new int[capacity.length];
        for (int i = 0; i < capacity.length; i++) {
            diff[i] = capacity[i] - rocks[i];
        }
        Arrays.sort(diff);
        int ans = 0;
        for (int i = 0; i < diff.length; i++) {
            if(diff[i]==0) ans++;
            else if(diff[i]<=additionalRocks){
                ans++;
                additionalRocks = additionalRocks -diff[i]; 
            }
            else break;
        }
        // for (int i : diff) {
        //     System.out.print(i+" ");
        // }
        return ans;
    }
}