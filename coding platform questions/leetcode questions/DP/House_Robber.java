public class House_Robber {
    public static void main(String[] args) {
        int[] nums = {1};
        Solution obj = new Solution();
        System.out.println(obj.rob(nums));
    }
}
class Solution {
    public int rob(int[] nums) {
        int prev1 = 0;
        int prev2 = 0;
        for (int num : nums) {
            int tmp = prev1;
            prev1 = Math.max(prev2 + num, prev1);
            prev2 = tmp;
        }
        return prev1;
    }
}
// class Solution {
//     public int rob(int[] nums) {
//         if(nums.length==2) return Math.max(nums[0], nums[1]);
//         else if(nums.length==1 ) return nums[0];
//         int [] dp = new int[nums.length];
//         dp[0] = nums[0];
//         dp[1] = nums[1];
//         int max = dp[0],index=0;
//         for (int i = 2; i < nums.length; i++) {
//             for (int j = index; j < i-1; j++) {
//                 max = Math.max(max, dp[j]) ;
//                 index++;
//             }
//             dp[i] = max + nums[i];
//         }
//         return Math.max(dp[dp.length-2], dp[dp.length-1]);
//     }
// }