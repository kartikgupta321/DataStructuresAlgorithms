class No_provinces{
    public static void main(String[] args) {
        Solution obj = new Solution();
        int[][] isConnected = { {1,0,0},{0,1,0},{0,0,1}};
        System.out.println(obj.findCircleNum(isConnected));
    }
}
class Solution {
    int[] parent;
    public int findCircleNum(int[][] isConnected) {
        parent = new int[isConnected.length];
        for (int i = 0; i < isConnected.length; i++) {
            for (int j = 0; j < isConnected[i].length; j++) {
                if(isConnected[i][j]==1 && i!=j){
                    union(i, j);
                }
            }
        }
        int count=0;
        for (int i = 0; i < parent.length; i++) {
            if(parent[i]==0){
                count++;
            }
        }
        return count;
    }
    int find(int a){
        if(parent[a]==0) return a;
        return find(parent[a]); 
    }
    void union(int a, int b){
        int froma = find(a);
        int tob = find(b);
        if(froma != tob){
            parent[froma] = tob;
        }
    }
}