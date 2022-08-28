public class q1 {
    public static void main(String[] args) {
        int[] nums = {469781,45635,628818,324948,343772,713803,452081};
        int[] queries = {816646,929491};
        Solution obj = new Solution();
        int[] ans = obj.answerQueries(nums, queries);
        for (int i = 0; i < ans.length; i++) {
            System.out.print(ans[i]+" ");
        }
    }
}
class Solution {
    public int[] answerQueries(int[] nums, int[] queries) {
        int[] ans = new int[queries.length];

        for (int i = 0; i < queries.length; i++) {
            int maxcount = 0;
            for (int k = 0; k < nums.length; k++) {
                int sum = 0;
                int count = 0;
                for (int j = k; j < nums.length; j++) {
                    if(sum + nums[j] == queries[i]){
                        sum += nums[j];
                        count++;
                        break;
                    }
                    if(sum + nums[j] <= queries[i]){
                        sum += nums[j];
                        System.out.print(nums[j]);
                        count++;
                    }
                    System.out.println();
                    
                }
                maxcount = Math.max(maxcount, count);
            }
            ans[i] = maxcount;
        }
        return ans;
    }
}