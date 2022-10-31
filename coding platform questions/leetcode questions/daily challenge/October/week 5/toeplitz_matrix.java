public class toeplitz_matrix {
    public static void main(String[] args) {
        int[][] matrix = {{1,2},{2,2}};
        Solution obj = new Solution();
        System.out.println(obj.isToeplitzMatrix(matrix));
    }
}
class Solution {
    public boolean isToeplitzMatrix(int[][] matrix) {
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                System.out.println(i+" "+j);
                if(i<matrix.length-1  && j<matrix[i].length-1  && matrix[i][j]==matrix[i+1][j+1]) continue;
                else if(i==matrix.length-1  || j==matrix[i].length-1) continue;
                else return false;
            }
        }
        return true;
    }
}