import java.util.Arrays;

public class Reordered_power_2 {
    public static void main(String[] args) {
        Solution obj = new Solution();
        System.out.println(obj.reorderedPowerOf2(652));
    }
}
class Solution {
    public boolean reorderedPowerOf2(int n) {
        int[] A = count(n);

        for (int i = 0; i <= 31; i++) {
            if(Arrays.equals(A, count(1<<i))) return true;
        }
        return false;
    }
    int[] count(int N){
        int[] ans = new int[10];
        while(N>0){
            ans[N%10]++;
            N =N/10;
        }
        return ans;
    }
}