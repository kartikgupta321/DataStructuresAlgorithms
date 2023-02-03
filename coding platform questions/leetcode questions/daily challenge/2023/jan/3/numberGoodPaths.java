class numberGoodPaths{
    public static void main(String[] args) {
        int[] vals = { 1,3,2,1,3};
        int[][] edges = { {0,1},{0,2},{2,3},{2,4}};
        Solution obj = new Solution();
        System.out.println(obj.numberOfGoodPaths(vals, edges));
    }
}
class Solution {
    public int numberOfGoodPaths(int[] vals, int[][] edges) {
        int ans = 0;
        ans += edges.length+1;
        return ans;
    }
}