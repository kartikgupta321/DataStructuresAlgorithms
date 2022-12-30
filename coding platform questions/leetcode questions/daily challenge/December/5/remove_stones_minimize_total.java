import java.util.Collections;
import java.util.PriorityQueue;

class remove_stones_minimize_total{
    public static void main(String[] args) {
        int[] piles = { 5,4,9};
        Solution obj = new Solution();
        System.out.println(obj.minStoneSum(piles, 2));
    }
}
class Solution {
    public int minStoneSum(int[] piles, int k) {
        PriorityQueue<Integer> heap = new PriorityQueue<>(Collections.reverseOrder());
        for (Integer integer : piles) {
            heap.add(integer);
        }
        for (int i = 0; i < k; i++) {
            int exit = heap.poll();
            int enter = 0;
            if(exit%2==0){
                enter = exit/2;
            }
            else {
                enter = exit/2 +1;
            }
            heap.add(enter);
        }
        int sum = 0;
        for (Integer integer : heap) {
            sum += integer;
        }
        return sum;
    }
}