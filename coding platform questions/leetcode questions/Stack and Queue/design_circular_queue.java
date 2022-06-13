import java.util.LinkedList;
import java.util.Queue;

public class design_circular_queue {
    public static void main(String[] args) {
        MyCircularQueue q = new MyCircularQueue(5);
        q.enQueue(5);
        q.enQueue(4);
        q.enQueue(3);
        q.enQueue(2);
        // System.out.println(q.isEmpty());
        // System.out.println(q.isFull());
        // System.out.println(q.Front());
        // System.out.println(q.Rear());
        System.out.println(q.head.value);
    }
}
class MyCircularQueue {
    class Node{
        int value;
        Node next;
        Node(int value,Node next){
            value = this.value;
            next = this.next;
        }
    }
    public Node head;
    int count =0;
    int size;

    public MyCircularQueue(int k) {
        size = k;
        
    }
    
    public boolean enQueue(int value) {
        if(count==size) return false;
        else if(head==null) head = new Node(value, null);
        else{
            Node last = head;
            while (last.next!=null) {
                last = last.next;
            }
            last.next = new Node(value, null);
        }
        count++;
        return true;
    }
    
    public boolean deQueue() {
        if(count==0) return false;
        else if(head.next == null) head.next =null;
        else{
            Node last = head;
            while (last.next.next!=null) {
                last = last.next;
            }
            last.next = null;
        }   
        count--;
        return true;
        
    }
    
    public int Front() {
        if(head==null) return -1;
        return head.value;
    }
    
    public int Rear() {
        if(head==null) return -1;
        Node last= head;
        while (last.next!=null) {
            last = last.next;
        }
        return last.value;
    }
    
    public boolean isEmpty() {
        if(head==null) return true;
        return false;
    }
    
    public boolean isFull() {
        if(count==size) return true;
        return false;
    }
}