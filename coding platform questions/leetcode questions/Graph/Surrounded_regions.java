public class Surrounded_regions {
    public static void main(String[] args) {
        // char[][] board = {{'X','X','X','X'},{'X','O','O','X'},{'X','X','O','X'},{'X','O','X','X'}};
        char[][] board = {{'O'}};
        Solution obj = new Solution();
        obj.solve(board);
        for (int i = 0; i < board.length; i++) {
            for (int j = 0; j < board[0].length; j++) {
                System.out.print(board[i][j]);
            }
            System.out.println();
        }
    }
}
class Solution {
    int[] dsuf;
    public void solve(char[][] board) {
        dsuf = new int[board.length*board[0].length + 1];
        int index = 0;
        for (int i = 0; i < board.length; i++) {
            for (int j = 0; j < board[0].length; j++) {
                if(board[i][j] == 'O' ){
                    if(j-1 > 0 && board[i][j-1]=='O') Union(index, index-1);
                    if(i-1 > 0 && board[i-1][j]=='O') Union(index, index - board[0].length);
                    if(j+1 <board[0].length && board[i][j+1]=='O') Union(index, index+1);
                    if(i+1 <board.length && board[i+1][j]=='O') Union(index, index + board[0].length);
                }
                index++;
            }
        }
        index =0;
        for (int i = 0; i < board.length; i++) {
            for (int j = 0; j < board[0].length; j++) {
                if(board[i][j] == 'O' && Find(index) != board.length*board[0].length){
                    if(j-1==-1 || j+1 == board[0].length || i-1==-1 || i+1== board.length){
                        Union(index, board.length*board[0].length );
                    }
                }
                index++;
            }
        }
        index = 0;
        for (int i = 0; i < board.length; i++) {
            for (int j = 0; j < board[0].length; j++) {
                if(board[i][j] == 'O' && Find(index) != board.length*board[0].length){
                    board[i][j] = 'X';
                }
                index++;
            }
        }
        for (int i = 0; i < dsuf.length; i++) {
            System.out.println(dsuf[i]);
        }
    }
    int Find(int v){
        if(dsuf[v]==0) return v;
        return dsuf[v] = Find(dsuf[v]);
    }
    void Union(int froma, int toP){
        froma = Find(froma);
        toP = Find(toP);
        if(froma != toP) dsuf[froma] = toP;
    }
}