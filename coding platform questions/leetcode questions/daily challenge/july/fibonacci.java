public class fibonacci {
    public static void main(String[] args) {
        Solution obj = new Solution();
        System.out.println(obj.fib(5));
    }
}
// class Solution {
//     public int fib(int n) {
//         if(n==0) return 0;
//         else if(n==1) return 1;
//         return fib(n-1) + fib(n-2);
//     }
// }
// class Solution {
//     public int fib(int n) {
//         int arr[] = new int[n+1];
//         arr[0] = 0;
//         arr[1] =1;
//         for (int i = 2; i <= n; i++) {
//             arr[i] = arr[i-1] + arr[i-2];
//         }
//         return arr[n];
//     }
// }
class Solution {
    public int fib(int n) {
        if(n==0) return 0;
        else if(n==1) return 1;
        int ans=0,prev=1,prev2=0;
        for (int i = 2; i <=n; i++) {
            ans = prev + prev2;
            prev2 = prev;
            prev = ans;
        }
        return ans;
    }
}