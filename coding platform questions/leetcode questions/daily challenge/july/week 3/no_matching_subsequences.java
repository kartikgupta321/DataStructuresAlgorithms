import java.util.HashMap;

public class no_matching_subsequences {
    public static void main(String[] args) {
        String s = "abcde";
        String[] words = {"a","bb","acd","ace"};
        Solution obj =  new Solution();
        System.out.println(obj.numMatchingSubseq(s, words));
    }
}
class Solution {
    public int numMatchingSubseq(String s, String[] words) {
        int m = s.length(),ans = 0;
        HashMap<String,Integer> map = new HashMap<>();
        for (String word : words) {
            map.put(word, map.getOrDefault(word, 0)+1);
        }
        for (String word : map.keySet()) {
            int i = 0,j = 0, n = word.length();
            while (i<m && j<n) {
                if(s.charAt(i) == word.charAt(j)) j++;
                i++;
            }
            if(j==n) ans += map.get(word);
        }
        return ans;
    }
}