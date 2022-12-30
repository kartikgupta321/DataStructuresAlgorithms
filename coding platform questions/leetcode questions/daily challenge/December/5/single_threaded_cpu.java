import java.util.Arrays;
import java.util.Comparator;
import java.util.PriorityQueue;

public class single_threaded_cpu {
    public static void main(String[] args) {
        int[][] tasks = { {7,10},{7,12},{7,5},{7,4},{7,2},{1,9}};
        Solution obj = new Solution();
        int[] ans = obj.getOrder(tasks);
        for (int i : ans) {
            System.out.print(i+" ");
        }
    }
}
class Solution {
    public class Task{
        int startTime;
        int processTime;
        int index;
        Task(int startTime, int processTime, int index){
            this.startTime = startTime;
            this.processTime = processTime;
            this.index = index;
        }
    }
    public class StartTime implements Comparator<Task>{
        @Override
        public int compare(Task one, Task two){
            return one.startTime - two.startTime;
        }
    }
    public class Duration implements Comparator<Task>{
        @Override
        public int compare(Task one,Task two){
            if(one.processTime == two.processTime) return one.index- two.index;
            return one.processTime-two.processTime;
        }
    }
    public int[] getOrder(int[][] tasks) {
        int n = tasks.length;
        int[] ans = new int[n];
        Task[] extTasks = new Task[n];
        
        for (int i = 0; i < n; i++) {
            extTasks[i] = new Task(tasks[i][0],tasks[i][1],i);
        }
        Arrays.sort(extTasks, new StartTime());
        PriorityQueue<Task> pq = new PriorityQueue<>(new Duration());

        int ai = 0,ti = 0,currentTime = 0;
        
        while(ai<n){
            while(ti<n && extTasks[ti].startTime<=currentTime){
                pq.add(extTasks[ti++]);
            }
            if(pq.size()==0){
                currentTime = extTasks[ti].startTime;
                continue;
            }
            Task bestFit= pq.remove();
            ans[ai++] = bestFit.index;
            currentTime += bestFit.processTime;
        }
        return ans;
    }
}