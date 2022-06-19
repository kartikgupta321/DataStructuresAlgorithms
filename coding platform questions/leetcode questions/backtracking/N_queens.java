import java.util.List;

public class N_queens {
    public static void main(String[] args) {
        Solution obj = new Solution();
        List<List<String>> list = obj.solveNQueens(3);
        for (int i = 0; i < list.size(); i++) {
            for (int j = 0; j < list.get(i).size(); j++) {
                for (int j2 = 0; j2 < list.get(i).get(j).length(); j2++) {
                    System.out.print(list.get(i).get(j).charAt(j2));
                }
                System.out.print(" , ");
            }
            System.out.println();
        }
    }
}
class Solution {
    public List<List<String>> solveNQueens(int n) {
        
    }
}