class reshapeMatrix{
    public static void main(String[] args) {
        int[][] mat = {{1,2},{3,4} };
        Solution obj = new Solution();
        int[][] ans = obj.matrixReshape(mat, 1, 4);
        for (int i = 0; i < ans.length; i++) {
            for (int j = 0; j < ans[0].length; j++) {
                System.out.println(ans[i][j]+" ");
            }
            System.out.println();
        }
        
    }
}
class Solution {
    public int[][] matrixReshape(int[][] mat, int r, int c) {
        if (mat.length*mat[0].length != r*c) {
            return mat;
        }
        int[] arr = new int[r*c];
        int k = 0;
        for (int i = 0; i < mat.length; i++) {
            for (int j = 0; j < mat[0].length; j++) {
                arr[k] = mat[i][j];
                k++;
            }
        }
        int[][] ans = new int[r][c];
        k=0;
        for (int i = 0; i < r; i++) {
            for (int j = 0; j < c; j++) {
                ans[i][j] = arr[k];
                k++;
            }
        }
        return ans;
    }
}