import java.util.HashMap;

class q1{
    public static void main(String[] args) {
        String s = "abcdd";
        Solution obj = new Solution();
        System.out.println(obj.repeatedCharacter(s));
    }
}
class Solution {
    public char repeatedCharacter(String s) {
        
        HashMap<Character,Character> map = new HashMap<>();
        for (int i = 0; i < s.length(); i++) {
            if(map.containsKey(s.charAt(i))) return map.get(s.charAt(i));
            map.put(s.charAt(i), s.charAt(i));
        }
        return 'a';
    }
}