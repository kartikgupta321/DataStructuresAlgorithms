public class transpose_matrix {
    public static void main(String[] args) {
        Solution obj = new Solution();
        int matrix[][] = {{1,2,3},{4,5,6}};
        int ans[][] = obj.transpose(matrix);
        for (int i = 0; i < ans.length; i++) {
            for (int j = 0; j < ans[0].length; j++) {
                System.out.print(ans[i][j]);
            }
            System.out.println();
        }
    }
}
class Solution {
    public int[][] transpose(int[][] matrix) {
        int m = matrix.length,n = matrix[0].length;
        int ans[][]= new int[n][m];
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                ans[i][j] = matrix[j][i];
            }
        }
        return ans;
    }
}
