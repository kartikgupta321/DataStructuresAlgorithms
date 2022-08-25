class jump_game{
    public static void main(String[] args) {
        int[] nums = { 2,3,1,1,4};
        Solution obj = new Solution();
        System.out.println(obj.canJump(nums));
    }
}
class Solution {
    public boolean canJump(int[] nums) {
        int reachable = 0;
        for (int i = 0; i < nums.length; i++) {
            if(i>reachable) return false;
            reachable = Math.max(reachable, i+nums[i]);
            if(reachable==nums.length-1) return true;
        }
        return true;
    }
}