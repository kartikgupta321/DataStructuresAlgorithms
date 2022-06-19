import java.util.Stack;

public class valid_parentheses {
    public static void main(String[] args) {
        Solution obj = new Solution();
        String s = "}";
        System.out.println(obj.isValid(s));
    }
}
class Solution {
    Stack<Character> stack = new Stack<>();
    public boolean isValid(String s) {
        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i)=='(' || s.charAt(i)=='[' || s.charAt(i)=='{' ) {
                stack.push(s.charAt(i));
            }
            else if(s.charAt(i)==')'  && !stack.empty() && stack.peek()=='(') stack.pop();
            else if(s.charAt(i)=='}'  && !stack.empty() && stack.peek()=='{') stack.pop();
            else if(s.charAt(i)==']'  && !stack.empty() && stack.peek()=='[') stack.pop();
            else return false;
        }
        return stack.isEmpty();
    }
}