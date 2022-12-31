import java.util.ArrayList;
import java.util.List;

public class all_paths_source_target {
    public static void main(String[] args) {
        int[][] graph = { {4,3,1},{3,2,4},{3},{4},{}};
        Solution obj = new Solution();
        List<List<Integer>> ans = obj.allPathsSourceTarget(graph);
        for (int i = 0; i < ans.size(); i++) {
            for (int j = 0; j < ans.get(i).size(); j++) {
                System.out.print(ans.get(i).get(j));
            }
            System.out.println();
        }
    }
}
class Solution {
    public List<List<Integer>> allPathsSourceTarget(int[][] graph) {
        List<List<Integer>> ans = new ArrayList<>();
        List<Integer> current = new ArrayList<>();
        current.add(0);
        dfs(0,current,graph,graph.length-1,ans);
        return ans;
    }
    public void dfs(int src,List<Integer> current,int[][] graph,int dest,List<List<Integer>> ans){
        if(src == dest){
            ans.add(new ArrayList<>(current));
            return;
        }
        for (int n : graph[src]) {
            current.add(n);
            dfs(n, current, graph, dest, ans);
            current.remove(current.size()-1);
        }
    }
}