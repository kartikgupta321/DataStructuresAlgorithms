import java.util.HashMap;

public class longest_substring_without_repeat {
    public static void main(String[] args) {
        Solution obj = new Solution();
        String s = "pwwkew";
        System.out.println(obj.lengthOfLongestSubstring(s));
    }
}
class Solution {
    int maxcount=0;
    public int lengthOfLongestSubstring(String s) {
        HashMap<Character,Integer> map = new HashMap<>();
        int max =0;
        for (int i = 0 , j=0; i < s.length(); i++) {
            if (map.containsKey(s.charAt(i))) {
                j= Math.max(j, map.get(s.charAt(i)) +1);
            }
            map.put(s.charAt(i), i);
            max = Math.max(max, i-j+1);
        }
        return max;
    }
}