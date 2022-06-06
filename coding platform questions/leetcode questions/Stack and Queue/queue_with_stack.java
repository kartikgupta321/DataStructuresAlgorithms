import java.util.Stack;

class queue_with_stack{


    public static void main(String[] args) {
        
        MyQueue obj = new MyQueue();
        System.out.println(obj.empty());
        obj.push(5);
        obj.push(3);
        obj.push(1);
        System.out.println(obj.pop());
        System.out.println(obj.peek());
        System.out.println(obj.pop());
        System.out.println(obj.empty());
    }
}
class MyQueue {
    Stack<Integer> stack1 = new Stack<Integer>();
    Stack<Integer> stack2 = new Stack<Integer>();
    public MyQueue() {
        
    }
    
    public void push(int x) {
        stack1.push(x);
    }
    
    public int pop() {
        if (stack2.empty()==true) {
            while (stack1.empty()!=true) {
                stack2.push(stack1.pop());
            }
        }
        return stack2.pop();
    }
    
    public int peek() {
        if (stack2.empty()==true) {
            while (stack1.empty()!=true) {
                stack2.push(stack1.pop());
            }
        }
        return stack2.peek();
    }
    
    public boolean empty() {
        if (stack1.empty()==true && stack2.empty()==true) {
            return true;
        }
        return false;
    }
}
