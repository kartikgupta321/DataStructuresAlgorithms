import java.util.Arrays;
import java.util.List;

public class triangle {
    public static void main(String[] args) {
        Solution obj = new Solution();
        List<List<Integer>> triangle = Arrays.asList(Arrays.asList(2),Arrays.asList(3,4),
        Arrays.asList(6,5,7),Arrays.asList(4,1,8,3));
        System.out.println(obj.minimumTotal(triangle));
    }
}
class Solution {
    public int minimumTotal(List<List<Integer>> triangle) {
        List<Integer> minval = triangle.get(triangle.size()-1);
        for (int layer = triangle.size()-2; layer >= 0; layer--) {
            for (int i = 0; i <= layer; i++) {
                minval.set(i,Math.min(minval.get(i), minval.get(i+1)) + triangle.get(layer).get(i));
            }
        }
        return minval.get(0);
    }
}