import java.util.Arrays;

public class longest_subsequence_limited_sum {
    public static void main(String[] args) {
        int[] nums = { 4,5,2,1};
        int[] queries = { 3,10,21};
        Solution obj = new Solution();
        int[] ans = obj.answerQueries(nums, queries);
        for (int i : ans) {
            System.out.print(i + " ");
        }
    }
}
class Solution {
    public int[] answerQueries(int[] nums, int[] queries) {
        int ans[] = new int[queries.length];
        Arrays.sort(nums);
        
        for (int i = 0; i < queries.length; i++) {
            int count = 0,sum=0;
            for (int j = 0; j < nums.length; j++) {
                sum+=nums[j];
                if(sum>queries[i]) break;
                count++;
            }
            ans[i] = count;
        }
        return ans;
    }
}