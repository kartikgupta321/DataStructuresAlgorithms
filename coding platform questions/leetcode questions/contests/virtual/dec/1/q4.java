public class q4 {
    public static void main(String[] args) {
        int[][] queries = { {5,3},{4,7},{2,3} };
        Solution obj = new Solution();
        int[] ans = obj.cycleLengthQueries(3, queries);
        for (int i : ans) {
            System.out.print(i+ " ");
        }
    }
}
class Solution {
    public int[] cycleLengthQueries(int n, int[][] queries) {
        int[] ans=new int[queries.length];
        for (int i = 0; i < ans.length; i++) {
            int path = 0;
            int a=queries[i][0],b=queries[i][1];
            while(a!=b){
                path +=1;
                if(a>b) a >>= 1;
                else b >>= 1;
            }
            ans[i] = path+1;
        }
        return ans;
    }
}

