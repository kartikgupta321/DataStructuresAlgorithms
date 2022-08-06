import java.util.Collections;
import java.util.PriorityQueue;

public class Kth_smallest_element {
    public static void main(String[] args) {
        int[][] matrix = { {1,5,9},{10,11,13},{12,13,15}};
        int k = 8;
        Solution obj = new Solution();
        System.out.println(obj.kthSmallest(matrix, k));
    }
}
class Solution {
    public int kthSmallest(int[][] matrix, int k) {
        PriorityQueue<Integer> heap = new PriorityQueue<>(Collections.reverseOrder());
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix.length; j++) {
                heap.add(matrix[i][j]);
                if(heap.size()>k) heap.poll();
            }
        }
        return heap.poll();
    }
}