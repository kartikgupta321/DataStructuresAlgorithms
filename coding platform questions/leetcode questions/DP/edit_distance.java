public class edit_distance {
    public static void main(String[] args) {
        String word1 = "zoologicoarchaeologist" ;
        String word2 = "zoogeologist";
        Solution obj = new Solution();
        System.out.println(obj.minDistance(word1, word2));
    }
}
class Solution {
    public int minDistance(String word1, String word2) {
        int dp[][] = new int[word2.length()+1][word1.length()+1];
        for (int i = 0; i <= word1.length(); i++)   {dp[0][i] = i;}
        for (int i = 0; i <= word2.length(); i++)   {dp[i][0] = i;}
        for (int i = 1; i <= word2.length(); i++) {
            for (int j = 1; j <= word1.length(); j++) {
                if(word1.charAt(j-1)==word2.charAt(i-1)){ 
                    dp[i][j] = dp[i-1][j-1];
                }
                else{
                    dp[i][j] = Math.min(Math.min(dp[i-1][j], dp[i][j-1]), Math.min(dp[i-1][j-1], dp[i-1][j])) + 1;
                }
            }
        }
        return dp[word2.length()][word1.length()];
    }
}