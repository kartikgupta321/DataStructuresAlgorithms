public class min_stack {
    public static void main(String[] args) {
        
    }
}
class MinStack {

    class Node{
        int val;
        int min;
        Node next;
        Node(int val,int min, Node next){
            this.val = val;
            this.min = min;
            this.next = next;
        }

    }

    public Node head;

    public MinStack() {
        
    }
    
    public void push(int val) {
        if (head==null) {
            head = new Node(val, val, null);
        }
        else{
            head = new Node(val, Math.min(val, head.min), head);
        }
    }
    
    public void pop() {
        head = head.next;
    }
    
    public int top() {
        return head.val;
    }
    
    public int getMin() {
        return head.min;
    }
}