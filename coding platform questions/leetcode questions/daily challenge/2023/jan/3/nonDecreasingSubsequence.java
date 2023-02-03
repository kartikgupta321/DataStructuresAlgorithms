import java.util.ArrayList;
import java.util.List;

public class nonDecreasingSubsequence {
    public static void main(String[] args) {
        int[] nums = {4,6,7,7};
        Solution obj = new Solution();
        List<List<Integer>> ans = obj.findSubsequences(nums);
        for (int i = 0; i < ans.size(); i++) {
            for (int j = 0; j < ans.get(i).size(); j++) {
                System.out.print(ans.get(i).get(j)+" || ");
            }
        }
    }
}
class Solution {
    public List<List<Integer>> findSubsequences(int[] nums) {
        List<List<Integer>> ans = new ArrayList<>();
        for (int i = 0; i < nums.length; i++) {
            List<Integer> list = new ArrayList<>();
            for (int j = 0; j < nums.length; j++) {
                
            }
        }
        return ans;
    }
}