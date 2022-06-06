import java.util.HashMap;
import java.util.LinkedList;
import java.util.PriorityQueue;
import java.util.Queue;

public class first_unique_char_string {
    public static void main(String[] args) {
        String s = "loveleetcode";
        Solution obj = new Solution();
        System.out.println(obj.firstUniqChar(s));
    }
}
class Solution {
    public int firstUniqChar(String s) {
        HashMap<Character,Integer> map = new HashMap<>();
        for (int i = 0; i < s.length(); i++) {
            int f = map.getOrDefault(s.charAt(i), 0) + 1;
            map.put(s.charAt(i), f);
        }
        for (int i = 0; i < s.length(); i++) {
            if(map.get(s.charAt(i))<2){
                return i;
            }
        }
        return -1;
    }
}