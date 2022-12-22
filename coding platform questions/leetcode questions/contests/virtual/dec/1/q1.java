import java.util.HashSet;
import java.util.Set;
public class q1 {
    public static void main(String[] args) {
        Solution obj = new Solution();
        String[] words = { "deac","dcbea","ecbda","decba","cbdae","dcae","bedca","bdace"};
        System.out.println(obj.similarPairs(words));
    }
}
class Solution {
    public int similarPairs(String[] words) {
        int ans = 0,n=words.length;
        for (int i = 0; i < n; i++) {
            Set<Character> set1 = new HashSet<>();
            for (int j = 0; j < words[i].length(); j++) {
                set1.add(words[i].charAt(j));
            }
            for (int j = i+1; j < n; j++) {
                Set<Character> set2 = new HashSet<>();
                for (int j2 = 0; j2 < words[j].length(); j2++) {
                    set2.add(words[j].charAt(j2));
                }
                if(set1.equals(set2)==true) ans++;
            }
        }
        return ans;
    }
}