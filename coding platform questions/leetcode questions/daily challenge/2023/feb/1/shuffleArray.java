public class shuffleArray {
    public static void main(String[] args) {
        int[] nums = { 1,2,3,4,4,3,2,1};
        Solution obj = new Solution();
        int[] ans = obj.shuffle(nums, 4);
        for (int i : ans) {
            System.out.print(i+" ");
        }
    }
}
class Solution {
    public int[] shuffle(int[] nums, int n) {
        int[] ans = new int[nums.length];
        int flag = 0;
        for (int k=0,i = 0,j=n; k < nums.length; k++) {
            if(flag==0){
                System.out.println(k+" "+i);
                
                ans[k] = nums[i];
                i++;
                flag = 1;
            }
            else{
                ans[k] = nums[j];
                j++;
                flag = 0;
            }
        }
        return ans;
    }   
}