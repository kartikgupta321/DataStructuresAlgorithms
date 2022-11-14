import java.util.PriorityQueue;
import java.util.Queue;

class Find_median_datastream{
    public static void main(String[] args) {
        MedianFinder obj = new MedianFinder();
        obj.addNum(2);
        obj.addNum(3);
        obj.addNum(4);
        obj.addNum(5);
        System.out.println(obj.findMedian());
    }
}
class MedianFinder {
    // Use min and max heap of approx same size
    Queue<Integer> minHeap = new PriorityQueue<>();
    Queue<Integer> maxHeap = new PriorityQueue<>((a,b) -> b - a);
    public MedianFinder() {

    }
    public void addNum(int num) {
        maxHeap.offer(num);
        minHeap.offer(maxHeap.poll());
        if(minHeap.size()>maxHeap.size()){
            maxHeap.offer(minHeap.poll());
        }
    }
    public double findMedian() {
        if(maxHeap.size()>minHeap.size()) return maxHeap.peek();
        return (double)(minHeap.peek()+maxHeap.peek())/2;
    }
}