import java.util.HashMap;

class word_pattern{
    public static void main(String[] args) {
        String pattern="jquery";
        String s="jquery";
        Solution obj = new Solution();
        System.out.println(obj.wordPattern(pattern, s));
    }
}
class Solution {
    public boolean wordPattern(String pattern, String s) {
        String [] word = new String[26];
        HashMap<String,Integer> map = new HashMap<>();
        int size = 0;
        for (int i = 0; i < s.length(); i++) {
            if(s.charAt(i)==' ') size++;
        }
        String [] array = new String[size+1];
        int fill = 0;
        for (int i = 0; i < s.length(); i++) {
            int j = i;
            while (i<s.length()  && s.charAt(i)!=' ') {
                i++;
            }
            array[fill] = s.substring(j, i);
            fill++;
        }
        if(array.length != pattern.length()) return false;
        for (int i = 0; i < array.length; i++) {
            if(word[pattern.charAt(i)-'a']==null){
                if(map.containsKey(array[i])==true) return false;
                map.put(array[i], 1);
                word[pattern.charAt(i)-'a'] = array[i];

            }
            else if(word[pattern.charAt(i)-'a'].equals(array[i])) {
                continue;
            }
            else{
                return false;
            }
        }
        return true;
    }
}