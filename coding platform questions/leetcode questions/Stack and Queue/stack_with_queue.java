import java.util.LinkedList;
import java.util.Queue;

class stack_with_queue{
    public static void main(String[] args) {
        MyStack obj = new MyStack();
        obj.push(5);
        obj.push(1);
        obj.push(3);
        obj.pop();
        System.out.println(obj.top());
    }
}
class MyStack {
    Queue<Integer> q = new LinkedList<Integer>();
    public MyStack() {
        
    }
    
    public void push(int x) {
        q.add(x);
        int s = q.size();
        for (int i = 1; i < s; i++) {
            q.add(q.poll());
        }
    }
    
    public int pop() {
        return q.poll();
    }
    
    public int top() {
        return q.peek();
    }
    
    public boolean empty() {
        return q.isEmpty();
    }
}