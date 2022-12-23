import java.util.Arrays;
import java.util.HashMap;

public class q2 {
    public static void main(String[] args) {
        int[] nums = { 4,3,6,162,8};
        Solution obj = new Solution();
        System.out.println(obj.longestSquareStreak(nums));
    }
}
class Solution {
    public int longestSquareStreak(int[] nums) {
        int res = 0;
        HashMap<Integer,Integer> map = new HashMap<>();
        Arrays.sort(nums);
        for (int i : nums) {
            int root = (int) Math.sqrt(i);
            if(root*root==i) {
                map.put(i, map.getOrDefault(root, 0)+1);
            }
            else map.put(i, 1);
            res = Math.max(res, map.get(i));
        }
        return res < 2 ? -1 : res;
    }
}