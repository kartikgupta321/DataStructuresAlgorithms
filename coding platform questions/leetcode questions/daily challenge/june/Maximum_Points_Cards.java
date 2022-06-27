public class Maximum_Points_Cards {
    public static void main(String[] args) {
        int[] cardPoints = {2,2,2};
        int k =2;
        Solution obj = new Solution();
        System.out.println( obj.maxScore(cardPoints, k));
    }
}
class Solution {
    public int maxScore(int[] cardPoints, int k) {
        int total = 0;
        int subsum = 0;
        int ans=0;
        int j= cardPoints.length - k-1;
        for (int i = 0; i < cardPoints.length; i++) {
            total+= cardPoints[i];
            if(i<=j) subsum+= cardPoints[i];
        }
        ans = Math.max(ans, total-subsum);
        j++;
        for ( int i=1; j < cardPoints.length; i++,j++) {
            subsum = subsum - cardPoints[i-1] + cardPoints[j];
            ans = Math.max(ans, total-subsum);
        }
        return ans;
    }
}