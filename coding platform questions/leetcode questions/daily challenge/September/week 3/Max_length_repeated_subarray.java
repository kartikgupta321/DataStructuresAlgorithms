public class Max_length_repeated_subarray {
    public static void main(String[] args) {
        int[] nums1 = { 1,2,3,2,1};
        int[] nums2 = { 3,2,1,4};
        Solution obj = new Solution();
        System.out.println(obj.findLength(nums1, nums2));
    }
}
class Solution {
    public int findLength(int[] nums1, int[] nums2) {
        int[][] dp = new int[nums2.length+1][nums1.length+1];
        int ans = 0;
        for (int i = 1; i < nums2.length+1; i++) {
            for (int j = 1; j < nums1.length+1; j++) {
                if(nums1[j-1]==nums2[i-1]){
                    dp[i][j] = dp[i-1][j-1]+1;
                    if(ans < dp[i][j]) ans = dp[i][j];
                }

            }
        }
        return ans;
    }
}