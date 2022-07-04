public class Wiggle_Subsequence {
    public static void main(String[] args) {
        int[] nums = { 1,17,5,10,13,15,10,5,16,8};
        Solution obj = new Solution();
        System.out.println(obj.wiggleMaxLength(nums));
    }
}
class Solution {
    public int wiggleMaxLength(int[] nums) {
        int up = 1,down = 1;
        for (int i = 1; i < nums.length; i++) {
            if(nums[i]>nums[i-1])   up = down +1;
            if(nums[i]<nums[i-1])   down = up+1;
        }
        return Math.max(up, down);
    }
}