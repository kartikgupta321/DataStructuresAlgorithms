public class jump_game2 {
    public static void main(String[] args) {
        int[] nums = {2,3,1,1,4};
        Solution obj = new Solution();
        System.out.println(obj.jump(nums));
    }
}
class Solution {
    public int jump(int[] nums) {
        int res=0,r=0,l=0;

        while (r<nums.length-1) {
            int farthest =0;
            for (int i = l; i <= r; i++) {
                farthest = Math.max(farthest, i + nums[i]);
            }
            l = r+1;
            r = farthest;
            res += 1;   
        }
        return res;
    }
}