import java.util.PriorityQueue;

public class Target_Array_Multiple_Sums {
    public static void main(String[] args) {
        Solution obj = new Solution();
        int target[] = {9,3,5};
        System.out.println(obj.isPossible(target));
    }
}
class Solution {
    public boolean isPossible(int[] target) {
        PriorityQueue<Integer> pq = new PriorityQueue<>((a, b)->(b-a));
        long total = 0;
        for(int a : target){
            total += a;
            pq.add(a);
        }
        while (true) {
            int a = pq.poll();
            total -= a;
            if(a==1 || total==1) return true;
            if(a<total || total==0 || a%total ==0) return false;
            a %= total;
            total +=a;
            pq.add(a);
        }
    }
}