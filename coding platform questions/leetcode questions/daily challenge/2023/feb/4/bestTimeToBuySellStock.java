class bestTimeToBuySellStock{
    public static void main(String[] args) {
        int[] prices = {2,1,2,1,0,1,2};
        Solution obj = new Solution();
        System.out.println(obj.maxProfit(prices));
    }
}
class Solution {
    public int maxProfit(int[] prices) {
        int l = 0, r = 1;
        int profit = 0;
        while(r<prices.length) {
            if(prices[l]>prices[r]){
                l = r;
                r++;
                continue;
            }
            profit = Math.max(profit,prices[r]-prices[l]);
            r++;
        }
        return profit;
    }
}