class set_mismatch{
    public static void main(String[] args) {
        int[] nums = {2,2};
        Solution obj = new Solution();
        System.out.println(obj.findErrorNums(nums)[0]);
        System.out.println(obj.findErrorNums(nums)[1]);
    }
}
class Solution {
    public int[] findErrorNums(int[] nums) {
        int[] ans = new int[2];
        int[] arr = new int[nums.length];
        for (int i = 0; i < arr.length; i++) {
            arr[nums[i]-1]++;
        }
        for (int i = 0; i < arr.length; i++) {
            if(arr[i]==2) ans[0] = i+1;
            else if(arr[i]==0) ans[1] = i+1;
            else if(ans[0]!=0 && ans[1]!=0) break;
        }
        return ans;
    }
}