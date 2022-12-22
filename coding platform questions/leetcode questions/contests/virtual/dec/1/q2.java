import java.util.Stack;

public class q2 {
    public static void main(String[] args) {
        Solution obj = new Solution();
        System.out.println(obj.smallestValue(4));
    }
}
class Solution {
    Stack<Integer> stack = new Stack<>();
    public int smallestValue(int n) {
        primeFactors(n);
        while(true){
            if(stack.size()==1) return stack.pop();
            else{
                int sum = 0;
                while(stack.size()!=0){
                    sum += stack.pop();
                }
                if(sum == n) return n;
                primeFactors(sum);
            }
        }
    }
    void primeFactors(int n){
        int i = 2;
        while(n!=1 ){
            if(n%i==0){
                stack.push(i);
                n = n/i;
            }
            else i++;
        }
    }
}