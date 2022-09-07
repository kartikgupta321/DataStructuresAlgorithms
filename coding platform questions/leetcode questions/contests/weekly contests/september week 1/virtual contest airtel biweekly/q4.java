public class q4 {
    public static void main(String[] args) {
        int[] chargeTimes = { 8,76,74,9,75,71,71,42,15,58,88,38,56,59,10,11}; 
        int[] runningCosts ={ 1,92,41,63,22,37,37,8,68,97,39,59,45,50,29,37}; 
        long budget = 412;
        Solution obj = new Solution();
        System.out.println(obj.maximumRobots(chargeTimes, runningCosts, budget));
    }
}
class Solution {
    public int maximumRobots(int[] chargeTimes, int[] runningCosts, long budget) {
        int ans = 0;
        for (int i = 0; i < runningCosts.length; i++) {
            int cost = 0,count =1;
            int chargetime = chargeTimes[i];
            int runningCost = runningCosts[i];
            for (int j = 0; j < runningCosts.length; j++) {
                cost = chargetime + count * runningCost;
                System.out.println(cost);
                if(cost <=budget) {
                    count++;
                    chargetime = Math.max(chargetime, chargeTimes[j+1]);
                    runningCost += runningCosts[j+1];
                    continue;
                }
                break;
            }
            System.out.println("break");
            ans = Math.max(ans, count);
        }
        return ans-1;
    }
}