import java.util.PriorityQueue;

class jump_game_6{
    public static void main(String[] args) {
        int[] nums = { 1,-1,-2,4,-7,3};
        int k = 2;
        Solution obj = new Solution();
        System.out.println(obj.maxResult(nums, k));
    }
}
// class Solution {
//     public int maxResult(int[] nums, int k) {
//         int [] dp = new int[nums.length];
//         Arrays.fill(dp, Integer.MIN_VALUE);
//         dp[0] = nums[0];
//         for (int i = 1; i < dp.length; i++) {
//             for (int j = 1; j <= k && i-j >= 0 ; j++) {
//                 dp[i] = Math.max(dp[i], dp[i-j] + nums[i]);
//             }
//         }
//         return dp[dp.length-1];
//     }
// }
class Solution {
    public int maxResult(int[] nums, int k) {
        int res = nums[0];
        PriorityQueue<int[]> pq = new PriorityQueue<>((a,b)->b[0]-a[0]);
        pq.add(new int[] {nums[0],0});
        for (int i = 1; i < nums.length; i++) {
            while (pq.peek()[1]<i-k) pq.poll();
            res = pq.peek()[0]+nums[i];
            pq.add(new int[] { pq.peek()[0]+nums[i],i});
        }
        return res;
    }
}