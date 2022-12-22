import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class keys_rooms {
    public static void main(String[] args) {
        List<List<Integer>> rooms = new ArrayList<>();
        rooms.add(Arrays.asList(1));
        rooms.add(Arrays.asList(2));
        rooms.add(Arrays.asList(3));
        rooms.add(Arrays.asList());
        Solution obj = new Solution();
        System.out.println(obj.canVisitAllRooms(rooms));
    }
}
class Solution{
    int[] array ;
    public boolean canVisitAllRooms(List<List<Integer>> rooms){
        array = new int[rooms.size()];
        Arrays.fill(array, -1);
        array[0] = 1;
        openrooms(0);
        for (int i = 0; i < rooms.size(); i++) {
            if(array[i]==1) continue;
            else return false;
        }
        return true;
    }
    void openrooms(int n){
        if(array[n]==1) return;
        else {

        }
    }
}