import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

class Substring_concatenation_words{
    public static void main(String[] args) {
        String s = "barfoofoobarthefoobarman";
        String[] words = { "bar","foo","the"};
        Solution obj = new Solution();
        List<Integer> ans= obj.findSubstring(s, words);
        for (int i = 0; i < ans.size(); i++) {
            System.out.print(ans.get(i)+" ");
        }
    }
}
class Solution {
    int wordLength,k,subStringSize;
    HashMap<String,Integer> wordCount = new HashMap<>();

    public boolean check(int i,String s){
        HashMap<String,Integer> remaining = new HashMap<>(wordCount);
        int wordsUsed = 0;
    
        for (int j = i; j < i + subStringSize; j+=wordLength) {
            String sub = s.substring(j,j+wordLength);
            if(remaining.getOrDefault(sub, 0)!=0){
                remaining.put(sub, remaining.get(sub)-1);
                wordsUsed++;
            }
            else{
                break;
            }
        }
        return wordsUsed==k;

    }
    public List<Integer> findSubstring(String s, String[] words) {
        int n = s.length();
        k = words.length;
        wordLength = words[0].length();
        subStringSize = wordLength*k;

        for (String word : words) {
            wordCount.put(word,wordCount.getOrDefault(word, 0)+1);
        }

        List<Integer> answer = new ArrayList<>();
        for (int i = 0; i < n - subStringSize + 1 ; i++) {
            if(check(i, s)){
                answer.add(i);
            }
        }
        return answer;
    }
} 