import java.util.Arrays;

public class Max_icecream_bars {
    public static void main(String[] args) {
        
    }
}
class Solution {
    public int maxIceCream(int[] costs, int coins) {
        int ans = 0;
        Arrays.sort(costs);
        for(int i =0; i < costs.length;i++){
            if(costs[i]>coins) break;
            ans++;
            coins -= costs[i];
        }
        return ans;
    }
}