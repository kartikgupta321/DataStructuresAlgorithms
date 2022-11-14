public class Reverse_words_string {
    public static void main(String[] args) {
        String s = "the sky is blue";
        Solution obj = new Solution();
        System.out.println(obj.reverseWords(s));
    }
}
class Solution {
    public String reverseWords(String s) {
        StringBuilder ans = new StringBuilder();
        int j = 0;
        for (int i = 0; i < s.length(); i++) {
            StringBuilder str = new StringBuilder();
            while (s.charAt(i)==' ') i++;
            while ( j < s.length()-1 && s.charAt(j)!=' ') {
                j++;
            }
            str = str.append(s.substring(i, i+j));
            str = str.reverse();
            ans.append(str);
            while (s.charAt(i)==' ') i++;
            j=0;
        }
        ans = ans.reverse();
        return ans.toString();
    }
}