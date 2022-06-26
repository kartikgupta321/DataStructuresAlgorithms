class Non_decreasing_Array{
    public static void main(String[] args) {
        int[] nums = {5,7,1,8};
        Solution obj = new Solution();
        System.out.println(obj.checkPossibility(nums));
    }
}
class Solution {
    public boolean checkPossibility(int[] nums) {
        int err = 0;
        for (int i = 1; i < nums.length; i++) {
            if(nums[i]<nums[i-1]){
                if(err++ > 0 || (i>1 && i<nums.length-1 && nums[i-2]>nums[i] && nums[i+1] <nums[i-1])){
                    return false;
                }
            }
        }
        return true;
    }
}