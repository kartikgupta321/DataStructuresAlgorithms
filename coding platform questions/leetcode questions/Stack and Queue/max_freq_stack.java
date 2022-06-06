import java.util.HashMap;
import java.util.Stack;

public class max_freq_stack {
    public static void main(String[] args) {
        FreqStack obj = new FreqStack();
        obj.push(5);
        obj.pop();
    }
}
class FreqStack {
    HashMap<Integer,Integer> freq = new HashMap<>();
    HashMap<Integer,Stack<Integer>> stacks = new HashMap<>();
    int maxf=0;
    public FreqStack() {
        
    }
    
    public void push(int val) {
        int f = freq.getOrDefault(val, 0) + 1;
        freq.put(val,f);
        maxf = Math.max(maxf, f);
        if (stacks.containsKey(f)==false) {
            stacks.put(f, new Stack<Integer>());
        }
        stacks.get(f).add(val);
    }
    
    public int pop() {
        int val = stacks.get(maxf).pop();
        freq.put(val, maxf-1);
        if (stacks.get(maxf).isEmpty()==true) {
            maxf--;
        }
        return val;
    }
}