import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class My_Calendar_1 {
    public static void main(String[] args) {
        MyCalendar obj = new MyCalendar();
        System.out.println(obj.book(25, 32));
        System.out.println(obj.book(32, 25));
    }
}
class MyCalendar {
    List<List<Integer>> list = new ArrayList<>();

    public MyCalendar() {
        
    }
    
    public boolean book(int start, int end) {
        for (int i = 0; i < list.size(); i++) {
                if(start >= list.get(i).get(0) && start < list.get(i).get(1) || end > list.get(i).get(0) && end <= list.get(i).get(1)) {
                    return false;
                }
                else if(list.get(i).get(0) >=start && list.get(i).get(0) < end) return false;
        }
        list.add(Arrays.asList(start,end));
        for (int i = 0; i < list.size(); i++) {
            System.out.println(list.get(i).get(0)+" "+list.get(i).get(1));
        }
        return true;
    }
}
