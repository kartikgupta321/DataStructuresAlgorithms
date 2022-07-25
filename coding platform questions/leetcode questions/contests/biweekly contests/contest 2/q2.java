import java.util.HashMap;
import java.util.TreeMap;

public class q2 {
    public static void main(String[] args) {
        NumberContainers obj = new NumberContainers();
        obj.change(1, 10);
        obj.change(1, 20);
        obj.change(2, 10);
        obj.change(3, 30);
        
        System.out.println(obj.find(30));
    }
}
class NumberContainers {

    TreeMap<Integer,Integer> map = new TreeMap<>();
    public NumberContainers() {
        
    }
    public void change(int index, int number) {
        map.remove(index, number);
        map.put(index, number);
    }
    
    public int find(int number) {
        for (Integer i : map.keySet()) {
            if(map.get(i) == number){
                return i;
            } 
        }
        return -1;
    }
}