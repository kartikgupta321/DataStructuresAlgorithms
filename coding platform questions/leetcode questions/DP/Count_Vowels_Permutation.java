public class Count_Vowels_Permutation {
    public static void main(String[] args) {
        Solution obj = new Solution();
        System.out.println(obj.countVowelPermutation(3000));
    }
}
class Solution {
    public int countVowelPermutation(int n) {
        int mod =  1000000007;
        Long dp[][]=new Long [5][n];
        for (int i = 0; i < 5; i++) {
            dp[i][0] =  (long) 1;
        }
        for (int i = 0; i < 5; i++) {
            for (int j = 1;   j < n; j++) {
                dp[0][j] = (dp[1][j-1] + dp[2][j-1] + dp[4][j-1]) % mod;
                dp[1][j] = (dp[0][j-1] + dp[2][j-1]) % mod ;
                dp[2][j] = (dp[1][j-1] + dp[3][j-1]) % mod;
                dp[3][j] = dp[2][j-1];
                dp[4][j] = (dp[2][j-1] + dp[3][j-1]) % mod;
            }
        }
        int sum = 0;
        for (int j = 0; j < 5  ; j++) {
            sum += dp[j][n-1] ;
            sum = sum %mod;
        }
        return  sum%mod;
    }
}