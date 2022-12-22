import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class q3 {
    public static void main(String[] args) {
        Solution obj = new Solution();
        List<List<Integer>> edges = new ArrayList<>();
        edges.add(Arrays.asList(1,2));
        edges.add(Arrays.asList(3,4));
        System.out.println(obj.isPossible(4, edges));
    }
}
class Solution {
    public boolean isPossible(int n, List<List<Integer>> edges) {
        int[] degree = new int[n+1];
        for (int i = 0; i < edges.size(); i++) {
            degree[edges.get(i).get(0)]++;
            degree[edges.get(i).get(1)]++;
        }
        List<Integer> odd = new ArrayList<>();
        for (int i = 1; i < degree.length; i++) {
            if(degree[i]%2!=0) odd.add(i);
        }
        if(odd.size()==0) return true;
        if(odd.size()==2){
            if(edges.contains(Arrays.asList(odd.get(0),odd.get(1)))==false 
            && edges.contains(Arrays.asList(odd.get(1),odd.get(0)))==false) return true;
            System.out.println(odd);
            for (int i = 1; i <=n ; i++) {
                if(i!=odd.get(0) && i!=odd.get(1)){
                    System.out.println(i);
                    if(edges.contains(Arrays.asList(odd.get(0),i))==false
                    && edges.contains(Arrays.asList(i,odd.get(0)))==false
                    && edges.contains(Arrays.asList(i,odd.get(1)))==false
                    && edges.contains(Arrays.asList(odd.get(1),i))==false ) return true;
                }
            }
        }
        if(odd.size()==4){
            System.out.println(odd);
            if(edges.contains(Arrays.asList(odd.get(0),odd.get(1)))==false
            && edges.contains(Arrays.asList(odd.get(0),odd.get(2)))==false
            && edges.contains(Arrays.asList(odd.get(0),odd.get(3)))==false
            && edges.contains(Arrays.asList(odd.get(1),odd.get(2)))==false
            && edges.contains(Arrays.asList(odd.get(1),odd.get(3)))==false
            && edges.contains(Arrays.asList(odd.get(2),odd.get(3)))==false
            && edges.contains(Arrays.asList(odd.get(1),odd.get(0)))==false
            && edges.contains(Arrays.asList(odd.get(2),odd.get(0)))==false
            && edges.contains(Arrays.asList(odd.get(3),odd.get(0)))==false
            && edges.contains(Arrays.asList(odd.get(2),odd.get(1)))==false
            && edges.contains(Arrays.asList(odd.get(3),odd.get(1)))==false
            && edges.contains(Arrays.asList(odd.get(3),odd.get(2)))==false) return true;
        }
        return false;
    }
}