class first_last_position{
    public static void main(String[] args) {
        int[] nums = { 5,7,7,8,8,10};
        Solution obj = new Solution();
        int[] ans = obj.searchRange(nums, 8);
        for (int i : ans) {
            System.out.println(i);
        }
    }
}
class Solution {
    public int[] searchRange(int[] nums, int target) {
        int[] ans = {-1,-1};
        int l = 0, r = nums.length-1;
        while (l<=r) {
            int mid = l + (r-l)/2;
            if(nums[mid] == target){
                ans[0] = mid;
                r= mid-1;
            }
            else if (nums[mid] < target) l=mid+1;
            else r= mid -1;
        }
        l = 0; r = nums.length-1;
        while (l<=r) {
            int mid = l + (r-l)/2;
            if(nums[mid] == target){
                ans[1] = mid;
                l = mid+1;
            }
            else if (nums[mid] < target) l=mid+1;
            else r= mid -1;
        }
        return ans;
    }
}