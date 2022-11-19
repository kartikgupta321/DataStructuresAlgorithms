public class Move_zeroes {
    public static void main(String[] args) {
        int[] nums = {0,1,0,3,12};
        Solution obj = new Solution();
        obj.moveZeroes(nums);
        for (int i = 0; i < nums.length; i++) {
            System.out.print(nums[i]+ " ");
        }
    }
}
class Solution{
    public void moveZeroes(int[] nums){
        int l =0,r=0;
        while (l<nums.length && r<nums.length) {
            if(nums[l]==0 && nums[r]==0){
                r++;
            }
            else if(nums[l]==0 && nums[r]!=0){
                nums[l] = nums[l] + nums[r];
                nums[r] = nums[l] - nums[r];
                nums[l] = nums[l] - nums[r];
            }
            else {
                l++;
                r++;
            }
        }
    }
}