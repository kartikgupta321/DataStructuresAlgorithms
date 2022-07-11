public class Min_Cost_Climbing_Stairs {
    public static void main(String[] args) {
        Solution obj = new Solution();
        int[] cost = { 1,100,1,1,1,100,1,1,100,1};
        System.out.println(obj.minCostClimbingStairs(cost));
    }
}
class Solution {
    public int minCostClimbingStairs(int[] cost) {
        int prev1= cost[1];
        int prev2= cost[0];
        for (int i = 2; i < cost.length; i++) {
            int temp = prev1;
            prev1 = Math.min(prev1, prev2) + cost[i];
            prev2 = temp;
        }
        return Math.min(prev1,prev2);
    }
}