public class Count_Vowels_Permutation {
    public static void main(String[] args) {
        Solution obj = new Solution();
        System.out.println(obj.countVowelPermutation(1));
    }
}
class Solution {
    public int countVowelPermutation(int n) {
        int dp[][]=new int [5][n];
        for (int i = 0; i < 5; i++) {
            dp[i][0] = i;
        }
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < 5; j++) {
                System.out.print(dp[i][j]);
            }
            System.out.println();
        }
        return 0;
    }
}