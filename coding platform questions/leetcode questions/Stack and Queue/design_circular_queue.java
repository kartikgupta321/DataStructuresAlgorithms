public class design_circular_queue {
    public static void main(String[] args) {
        MyCircularQueue q = new MyCircularQueue(5);
        System.out.println(q.Front()+" " +q.Rear());
        q.enQueue(1);
        q.enQueue(2);
        q.enQueue(3);
        q.enQueue(4);
        q.enQueue(5);
        System.out.println(q.Front()+" " +q.Rear());
        q.deQueue();
        System.out.println(q.Front()+" " +q.Rear());
    }
}
class MyCircularQueue {
    int[] arr;
    int front=0,tail=-1,len=0;

    public MyCircularQueue(int k) {
            arr = new int[k];
    }
    
    public boolean enQueue(int value) {
        if(!isFull()){
            tail = (tail+1)% arr.length;
            arr[tail] = value;
            len++;
            return true;
        }
        return false;
    }
    
    public boolean deQueue() {
        if(!isEmpty()){
            front = (front+1)% arr.length;
            len--;
            return true;
        }
        return false;
    }
    
    public int Front() {
        return isEmpty() ? -1 : arr[front];
    }
    
    public int Rear() {
        return isEmpty() ? -1 : arr[tail];
    }
    
    public boolean isEmpty() {
        return len ==0;
    }
    
    public boolean isFull() {
        return len == arr.length;
    }
}