class Remove_duplicates_sortedarray{
    public static void main(String[] args) {
        int[] nums = { 0,0,1,1,1,2,2,3,3,4};
        Solution obj = new Solution();
        System.err.println(obj.removeDuplicates(nums));
        for (int i : nums) {
            System.out.print(i+" ");
        }
    }
}
class Solution {
    public int removeDuplicates(int[] nums) {
        int pos=0,val=nums[0],count=0;
        for (int i = 1; i < nums.length; i++) {
            if(nums[i] != val){
                count++;
                nums[pos+1] = nums[i];
                pos++;
                val = nums[i];
            }
        }
        return count;
    }
}