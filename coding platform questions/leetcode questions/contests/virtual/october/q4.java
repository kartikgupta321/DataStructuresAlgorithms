import java.util.HashMap;
public class q4 {
    public static void main(String[] args) {
        Solution obj = new Solution();
        String[] words = {"abc","ab","bc","b"};
        // String[] words = {"abcd"};
        int[] ans = obj.sumPrefixScores(words);
        for (int i = 0; i < ans.length; i++) {
            System.out.print(ans[i]+" ");
        }
    }    
}
class Solution {
    public int[] sumPrefixScores(String[] words) {
        int [] ans = new int[words.length];
        HashMap<String,Integer> map = new HashMap<>();
        for (int i = 0; i < words.length; i++) {
            int count = 0;
            for (int j = 0; j < words[i].length(); j++) {
                if(map.containsKey(words[i].substring(0, j+1))==true) count = map.get(words[i].substring(0, j+1));
                else{
                    for (int j2 = 0; j2 < words.length; j2++) {
                        if(words[j2].length()>j){
                            if(words[i].substring(0, j+1).equals(words[j2].substring(0, j+1)) ==true) count++;
                        }
                    }
                }
                map.put(words[i].substring(0, j+1),count );
            }
            ans[i] = count;
        }
        return ans;
    }
}