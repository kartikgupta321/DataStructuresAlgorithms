import java.util.ArrayList;
import java.util.List;

public class Find_Replace_Pattern {
    public static void main(String[] args) {
        String[] words = {"abc","deq","mee","aqq","dkd","ccc" };
        String pattern = "abb";
        Solution obj = new Solution();
        List<String> list = obj.findAndReplacePattern(words, pattern);
        for (int i = 0; i < list.size(); i++) {
            for (int j = 0; j < list.get(i).length(); j++) {
                System.out.print(list.get(i).charAt(j));
            }
            System.out.println();
        }
    }
}
class Solution {
    public List<String> findAndReplacePattern(String[] words, String pattern) {
        List<String> list = new ArrayList<>();
        for (int i = 0; i < words.length; i++) {
            int [] arr = new int[26];
            int j =0;
            for ( j = 0; j < pattern.length(); j++) {
                if(arr[pattern.charAt(j)-'a'] == 0){
                    arr[pattern.charAt(j)-'a'] = words[i].charAt(j);
                }
                else{
                    if(arr[pattern.charAt(j)-'a'] != words[i].charAt(j)) break;
                    
                }
            }
            if(j==pattern.length()) list.add(words[i]);
        }
        return list;
    }
}