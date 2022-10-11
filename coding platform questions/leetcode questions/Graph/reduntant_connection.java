public class reduntant_connection {
    public static void main(String[] args) {
        int[][] edges = { {1,2},{2,3},{3,4},{1,4},{1,5}};
        Solution obj = new Solution();
        System.out.println(obj.findRedundantConnection(edges)[0]+" "+obj.findRedundantConnection(edges)[1]);
    }
}
class Solution {
    int[] dsuf;
    public int[] findRedundantConnection(int[][] edges) {
        dsuf = new int[edges.length+1];
        for (int i = 0; i < edges.length; i++) {
            if(Find(edges[i][0]-1) == Find(edges[i][1]-1)) {
                return edges[i];
            }
            Union(edges[i][0]-1, edges[i][1]-1);
        }
        return edges[edges.length];
    }
    int Find(int v){
        if(dsuf[v]==0){
            return v;
        }
        return dsuf[v] = Find(dsuf[v]);
    }
    void Union(int fromP, int toP){
        fromP = Find(fromP);
        toP = Find(toP);
        if(fromP != toP){
            dsuf[fromP] = toP;
        }
    }
}