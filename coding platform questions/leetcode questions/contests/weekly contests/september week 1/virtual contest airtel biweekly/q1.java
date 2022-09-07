import java.util.HashMap;

class q1{
    public static void main(String[] args) {
        int[] nums = { 0,0,0};
        Solution obj = new Solution();
        System.out.println(obj.findSubarrays(nums));
    }
}
class Solution {
    public boolean findSubarrays(int[] nums) {
        HashMap<Integer,Integer> map = new HashMap<>();
        for (int i = 0; i < nums.length-1; i++) {
            int sum = nums[i] + nums[i+1];
            if(map.containsKey(sum) == true) return true;
            map.put(sum, 1);
        }
        return false;
    }
}