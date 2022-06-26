import java.util.PriorityQueue;

public class furthest_building {
    public static void main(String[] args) {
        int[] heights = {4,12,2,7,3,18,20,3,19};
        int bricks = 10,ladders=2;
        Solution obj = new Solution();
        System.out.println(obj.furthestBuilding(heights, bricks, ladders));
    }
}
class Solution {
    public int furthestBuilding(int[] heights, int bricks, int ladders) {
        PriorityQueue<Integer> pq = new PriorityQueue<>();
        for (int i = 0; i < heights.length-1; i++) {
            int d = heights[i+1] - heights[i];
            if(d>0) pq.add(d);
            if(pq.size() > ladders){
                bricks -= pq.poll();
            }
            if(bricks<0) return i;
        }
        return heights.length-1;
    }
}