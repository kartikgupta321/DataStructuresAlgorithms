import java.util.Arrays;
import java.util.HashMap;

public class Valid_Anagram {
    public static void main(String[] args) {
        String s = "rat";
        String t = "car";
        Solution obj = new Solution();
        System.out.println(obj.isAnagram(s, t));
    }
}
// class Solution {
//     public boolean isAnagram(String s, String t) {
//         HashMap<Character,Integer>map = new HashMap<>();
//         if(s.length() != t.length()) return false;
//         for (int i = 0; i < s.length(); i++) {
//             if( map.containsKey(s.charAt(i))){
//                 map.put(s.charAt(i),map.get(s.charAt(i))+1 );
//             }
//             else map.put(s.charAt(i), 1);
//         }
//         for (int i = 0; i < t.length(); i++) {
//             if(map.containsKey(t.charAt(i)) && map.get(t.charAt(i)) > 0){
//                 map.put(t.charAt(i), map.get(t.charAt(i))-1);
//             }
//             else return false;
//         }
//         return true;
//     }
// }
class Solution {
    public boolean isAnagram(String s, String t) {
        if(s.length() != t.length()) return false;
        char [] S = s.toCharArray();
        char [] T = t.toCharArray();
        Arrays.sort(T);
        Arrays.sort(S);
        for (int i = 0; i < T.length; i++) {
            if(T[i] == S[i]) continue;
            return false;
        }
        return true;
    }
}