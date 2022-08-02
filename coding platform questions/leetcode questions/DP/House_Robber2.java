public class House_Robber2 {
    public static void main(String[] args) {
        int[] nums = { 1,2};
        Solution obj = new Solution();
        System.out.println(obj.rob(nums));
    }
}
class Solution {
    public int rob(int[] nums) {
        if(nums.length==1) return nums[0];
        int p = 0 ,p1=0;
        for (int i = 0; i < nums.length-1; i++) {
            int  temp = p;
            p = Math.max(p, p1+nums[i]);
            p1 = temp;
        }
        int ans = p;
        p = 0 ;
        p1=0;
        for (int i = 1; i < nums.length; i++) {
            int  temp = p;
            p = Math.max(p, p1+nums[i]);
            p1 = temp;
        }
        if(ans<p) return p;
        return ans;
    }
}