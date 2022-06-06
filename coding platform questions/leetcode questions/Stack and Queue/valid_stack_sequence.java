import java.util.Stack;

public class valid_stack_sequence {
    public static void main(String[] args) {
        int[] pushed = {1,3};
        int[] popped = {1,3};
        Solution s = new Solution();
        System.out.println(s.validateStackSequences(pushed, popped));
    }
}
class Solution {
    public boolean validateStackSequences(int[] pushed, int[] popped) {
        Stack<Integer> stack = new Stack<Integer>();
        int j=0;
        for (int i = 0; i < pushed.length; i++) {
            stack.push(pushed[i]);
            System.out.println("i "+i+" j "+j+"stack "+stack.peek());
            while ((j<popped.length) && stack.empty()==false && popped[j]==stack.peek()  ) {
                stack.pop();
                j++;
            }
        }
        if (stack.empty()==true) {
            return true;
        }
        return false;
    }
}