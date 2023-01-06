import java.util.HashMap;
public class Minimum_Rounds_Tasks {
    public static void main(String[] args) {
        int[] tasks = { 69,65,62,64,70,68,69,67,60,65,69,62,65,65,61,66,68,61,65,63,60,66,68,66,67,65,63,65,70,69,70,62,68,70,60,68,65,61,64,65,63,62,62,62,67,62,62,61,66,69};
        Solution obj = new Solution();
        System.out.println(obj.minimumRounds(tasks));
    }
}
class Solution {
    public int minimumRounds(int[] tasks) {
        HashMap<Integer,Integer> map = new HashMap<>();
        for (int i = 0; i < tasks.length; i++) {
            map.put(tasks[i], map.getOrDefault(tasks[i], 0)+1);
        }
        int min = 0;
        for (int i : map.keySet()) {
            System.out.print(i+" "+map.get(i));
            System.out.println();
        }
        for (int i : map.keySet()) {
            int curr = map.get(i);
            if(curr==0) continue;
            while (curr!=0) {
                if(curr%2==0 && curr%3!=0){
                    min += curr/2;
                    curr=0;
                }
                else if(curr>=3){
                    min++;
                    curr -= 3;
                }
                else if(curr==2) {
                    min++;
                    curr = 0;
                }
                else return -1;
            }
        }
        return min;
    }
}