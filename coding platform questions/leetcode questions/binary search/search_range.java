class search_range{
    class Solution {
        public int[] searchRange(int[] nums, int target) {
            int arr[]={-1,-1};
            int l=0, r= nums.length-1;
            while (l<=r) {              
                int mid = l+ (r-l)/2;
                if(nums[mid] == target){ 
                    arr[0] = mid;
                    r=mid-1;
                }
                else if(nums[mid]<target) l=mid+1;
                else r = mid-1;
            }
            l=0;
            r=nums.length-1;
            while (l<=r) {
                int mid = l+ (r-l)/2;
                if(nums[mid] == target){
                    arr[1]=mid;
                    l=mid+1;
                }
                else if(nums[mid]<target) l=mid+1;
                else r = mid-1;
            }
            return arr;
        }
    }
    public static void main(String[] args) {
        int nums[]={1};
        int target =1;
        search_range s = new search_range();
        // s.searchRange(nums,target);
        Solution sol = s.new Solution();
        System.out.println(sol.searchRange(nums, target)[0]);
        System.out.println(sol.searchRange(nums, target)[1]);
    }
}