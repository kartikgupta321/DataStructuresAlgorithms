public class N_queens2 {
    public static void main(String[] args) {
        Solution obj = new Solution();
        System.out.println(obj.totalNQueens(8));
    }
}
class Solution{
    int count=0;
    public int totalNQueens(int n){
        helper(0,new boolean[n],new boolean[n*2],new boolean[n*2],n);
        return count;
    }
    void helper( int row ,boolean [] cols, boolean [] d1,boolean [] d2,int n){
        if(row==n) count++;
        for (int col = 0; col < n; col++) {
            int id1 = row-col+n;
            int id2 = row+col;
            if(!cols[col] && !d1[id1] && !d2[id2]) {
                cols[col] = true;
                d1[id1] = true;
                d2[id2] = true;
                helper(row+1, cols, d1, d2, n);
                cols[col] = false;
                d1[id1] = false;
                d2[id2] = false;
            }
        }
    }
}
