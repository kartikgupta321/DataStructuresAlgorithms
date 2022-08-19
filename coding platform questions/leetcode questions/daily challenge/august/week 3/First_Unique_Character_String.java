import java.util.HashMap;

class First_Unique_Character_String{
    public static void main(String[] args) {
        String s  = "aabb" ;
        Solution obj = new Solution() ;
        System.out.println(obj.firstUniqChar(s));
    }
}
class Solution {
    public int firstUniqChar(String s) {
        HashMap<Character,Integer> map = new HashMap<>();
        for (int i = 0; i < s.length(); i++) {
            map.put(s.charAt(i), map.getOrDefault(s.charAt(i), 0)+1);
        }
        for (int i = 0; i < s.length(); i++) {
            if(map.get(s.charAt(i))<2) return i;
        }
        return -1;
    }
}