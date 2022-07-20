import java.util.ArrayList;
import java.util.List;

public class pascals_triangle {
    public static void main(String[] args) {
        Solution obj = new Solution();
        List<List<Integer>> list = obj.generate(1);
        for (int i = 0; i < list.size(); i++) {
            for (int j = 0; j < list.get(i).size(); j++) {
                System.out.print(list.get(i).get(j));
            }
            System.out.println();
        }
    }
}
class Solution {
    public List<List<Integer>> generate(int numRows) {
        List<List<Integer>> result  = new ArrayList<>();
        if (numRows==0 ) return result;

        List<Integer> row1 = new ArrayList<>(1);
        row1.add(1);
        result.add(row1);

        for (int i = 1; i < numRows; i++) {
            List<Integer> row = new ArrayList<>(1);
            row.add(1);

            for (int j = 1; j < i; j++) {
                int left = result.get(i-1).get(j-1);
                int right = result.get(i-1).get(j);
                row.add(left+right);
            }
            row.add(1);
            result.add(row);
        }
        return result;
    }
}