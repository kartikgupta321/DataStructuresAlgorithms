public class range_sum_query {
    public static void main(String[] args) {
        int[][] matrix ={{3, 0, 1, 4, 2},{5, 6, 3, 2, 1},{1, 2, 0, 1, 5},{4, 1, 0, 1, 7},{1, 0, 3, 0, 5}};
        NumMatrix obj = new NumMatrix(matrix);
        System.out.println(obj.sumRegion(2, 1, 4, 3));
    }
}
class NumMatrix {
    int[][] arr;
    public NumMatrix(int[][] matrix) {
        arr = matrix;
    }
    
    public int sumRegion(int row1, int col1, int row2, int col2) {
        int sum =0;
        for (int i = row1; i <= row2; i++) {
            for (int j = col1; j <= col2; j++) {
                sum += arr[i][j];
            }
        }
        return sum;
    }
}