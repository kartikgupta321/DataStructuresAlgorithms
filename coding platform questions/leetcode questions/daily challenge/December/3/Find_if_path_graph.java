import java.util.Arrays;
class Find_if_path_graph{
    public static void main(String[] args) {
        int[][] edges = {{2,9},{7,8},{5,9},{7,2},{3,8},{2,8},{1,6},{3,0},{7,0},{8,5}};
        Solution obj = new Solution();
        System.out.println(obj.validPath(10, edges, 1, 0));
        
    }
}
class Solution {
    int[] dsuf;
    public boolean validPath(int n, int[][] edges, int source, int destination) {
        dsuf = new int[n];
        Arrays.fill(dsuf, -1);
        for (int i = 0; i < edges.length; i++) {
            if( find(edges[i][0]) == find(edges[i][1])) continue;
            else union(edges[i][0], edges[i][1]);
        }
        for (int i : dsuf) {
            System.out.println(i);
        }
        if(find(source)==find(destination)) return true;
        return false;

    }
    int find(int v){
        System.out.println(v);
        System.out.println(dsuf[9]);
        if(dsuf[v]==-1) return v;
        return find(dsuf[v]);
    }
    void union(int fromP, int toP){
        fromP = find(fromP);
        toP = find(toP);
        if(fromP == toP) return;
        dsuf[fromP] = toP;
    }
}