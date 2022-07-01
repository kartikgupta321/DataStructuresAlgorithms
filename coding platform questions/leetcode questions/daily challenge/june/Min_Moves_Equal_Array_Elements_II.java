import java.util.Arrays;

public class Min_Moves_Equal_Array_Elements_II {
    public static void main(String[] args) {
        int[] nums = { 1,5,9,10};
        Solution obj = new Solution();
        System.out.println(obj.minMoves2(nums));
    }
}
class Solution {
    public int minMoves2(int[] nums) {
        Arrays.sort(nums);
        int ans =0;
        for (int i = 0; i < nums.length; i++) {
            ans += Math.abs(nums[i] - nums[nums.length/2]) ;
        }
        return ans;
    }
}