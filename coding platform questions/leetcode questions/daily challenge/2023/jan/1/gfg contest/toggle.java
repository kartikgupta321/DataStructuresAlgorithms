import java.util.Arrays;

public class toggle {
    public static void main(String[] args) {
        int[] arr = {0,0,1,1,0,1};
        Solution obj = new Solution();
        System.out.println(obj.toggle(0, arr));
    }
}
class Solution {
    public int toggle(int n, int[] arr) {
        n = arr.length;
        int ans = 0;
        int start = 0,end = 0,max=0;
        for (int i = 0; i < arr.length; i++) {
            if(arr[i]==0){
                int currstart=i;
                int currmax=0;
                while( i<n && arr[i]==0){
                    i++;
                    currmax++;
                }
                if(currmax>max){
                    max = currmax;
                    start = currstart;
                    end = i;
                }
            }
        }
        Arrays.fill(arr, start, end, 1);
        for (int i = 0; i < arr.length; i++) {
            if(arr[i]==1){
                max = 0;
                while (i<n && arr[i]==1) {
                    max++;
                    i++;
                }
            }
            ans = Math.max(ans, max);
        }
        return ans;
    }
}