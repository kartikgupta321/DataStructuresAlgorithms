import java.util.Arrays;
public class Interleaving_string {
    public static void main(String[] args) {
        Solution obj = new Solution();
        String s1 = "aabcc",s2 = "dbbca",s3 = "aadbbcbcac";
        System.out.println(obj.isInterleave(s1, s2, s3));
    }
}
class Solution {
    public boolean isInterleave(String s1, String s2, String s3) {
        if(s3.length() != s1.length() + s2.length()) return false;
        Boolean[][] dp = new  Boolean [s1.length()+1][s2.length()+1];
        for (Boolean[] booleans : dp) Arrays.fill(booleans, false);
        dp[s1.length()][s2.length()] =true;
        for (int i = s1.length(); i >=0; i--) {
            for (int j = s2.length(); j >=0; j--) {
                if(i<s1.length() && s1.charAt(i)==s3.charAt(i+j) && dp[i+1][j] ) 
                    dp[i][j] = true;
                if(j<s2.length() && s2.charAt(j)==s3.charAt(i+j) && dp[i][j+1] ) 
                    dp[i][j] = true;
            }
        }
        for (int i = 0; i < dp.length; i++) {
            for (int j = 0; j < dp[i].length; j++) {
                System.out.print(dp[i][j] +" ");
            }
            System.out.println();
        }
        return dp[0][0];
    }
}  