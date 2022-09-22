public class sum_even_queries {
    public static void main(String[] args) {
        int[] nums = { 1,2,3,4};
        int[][] queries = { {1,0},{-3,1},{-4,0},{2,3}};
        Solution obj = new Solution();
        int[] ans = obj.sumEvenAfterQueries(nums, queries);
        for (int i : ans) {
            System.out.print(i+" ");
        }
    }
}
class Solution {
    public int[] sumEvenAfterQueries(int[] nums, int[][] queries) {
        int[] ans = new int[queries.length];
        int sum = 0;
        for (int i : nums) {
            if(i%2==0){
                sum += i;
            }
        }
        for (int i = 0; i < queries.length; i++) {
            int val = queries[i][0], index = queries[i][1];
            nums[index] += val;
            if((nums[index]%2==0 && val%2==0) ){
                sum += val;
                nums[index] += val;
            } 
            else if(nums[index]%2==0 && val%2!=0) {
                sum -= nums[index];
                nums[index] += val;
            }
            else if(nums[index]%2!=0 && val%2!=0) {
                nums[index] += val;
                sum += val;
            }
            else {
                nums[index] += val;
            }
            for(int k : nums){
                System.out.print(k +" ");
            }
            System.out.println();
            ans[i] = sum;
        }
        return ans;
    }
}