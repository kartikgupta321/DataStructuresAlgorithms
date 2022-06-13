class xor_subqueries{
    public static void main(String[] args) {
        int[] arr ={4,8,2,10};
        int[][] queries ={{2,3},{1,3},{0,0},{0,3}};
        Solution s= new Solution();
        int [] ans = s.xorQueries(arr, queries);
        for (int i = 0; i < ans.length; i++) {
            System.out.println(ans[i]);
        }
    }
}
class Solution {
    public int[] xorQueries(int[] arr, int[][] queries) {
        for (int i = 1; i < arr.length; i++) {
            arr[i] ^= arr[i-1];
        }
        int [] ans = new int[queries.length];
        for (int i = 0; i < queries.length; i++) {
            int l = queries[i][0];
            int r = queries[i][1];
            if(l ==0) ans[i] = arr[r];
            else ans[i] = arr[r] ^ arr[l-1];
        }
        return ans;
    }
}