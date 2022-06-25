import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class N_queens {
    public static void main(String[] args) {
        Solution obj = new Solution();
        List<List<String>> list = obj.solveNQueens(4);
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
        List<List<String>> result = new ArrayList<List<String>>();
        helper(result, new ArrayList<String>(), 0, new boolean[n], new boolean[n*2], new boolean[n*2], n);
        return result;
    }
    void helper(List<List<String>> result,List<String> board,int row,boolean cols[],boolean d1[], boolean d2[],int n ){
        if (row==n) result.add(new ArrayList<String>(board));            
        
        for (int col = 0; col< n; col++) {
            int id1 = row-col + n;
            int id2 = col + row;
            if (!cols[col] && !d1[id1] && !d2[id2]) {
                char[] r = new char[n];
                Arrays.fill(r, '.');
                r[col] = 'Q';
                board.add(new String(r));
                cols[col] = true;
                d1[id1] = true;
                d2[id2] = true;
                helper(result, board, row+1, cols, d1, d2, n);
                board.remove(board.size()-1);
                cols[col] = false;
                d1[id1] = false;
                d2[id2] = false;
            }
        }
    }
}