class ex{
    public static void main(String[] args) {
        int[] nums = {4,2,5,7 };
        Solution obj = new Solution();
        int[] ans = obj.sortArrayByParityII(nums);
        for (int i : ans) {
            System.out.print(i);
        }
    }
}
class Solution {
    public int[] sortArrayByParityII(int[] nums) {
        int[] ans = new int[nums.length];
        int i =0,j=1;

        for (int j2 = 0; j2 < nums.length; j2++) {
            if(nums[j2]%2==0){
                ans[i] = nums[j2];
                i+=2;
            }
            else{
                ans[j] = nums[j2];
                j+=2;
            }
        }
        return ans;
    }
}