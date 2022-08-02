class Unique_paths{
    public static void main(String[] args) {
        Solution obj = new Solution();
        System.out.println(obj.uniquePaths(51, 9));
    }
}
class Solution {
    public int uniquePaths(int m, int n) {
        if(m==1 || n==1 ) return 1;
        m--;n--;
        long j = 1, ans = 1;
        if(m<n) {
            m = m+n;
            n = m - n;
            m = m - n;
        }
        for(int i = m+1 ; i <= m+n; i++,j++){
            ans = ans * i;
            ans /= j;
        }
        return (int)ans;
    }
}