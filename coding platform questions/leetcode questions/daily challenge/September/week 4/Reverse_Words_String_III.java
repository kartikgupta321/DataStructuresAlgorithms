class Reverse_Words_String_III{
    public static void main(String[] args) {
        String s = "Let's take LeetCode contest";
        Solution obj = new Solution();
        System.out.println(obj.reverseWords(s));
    }
}
class Solution {
    public String reverseWords(String s) {
        StringBuilder str = new StringBuilder(s);
        int count = 0,i=0;
        for ( i = 0; i < s.length(); i++) {
            if(str.charAt(i)==' '){
                int l = i-count,r = i-1;
                for (int j = 0; j < count/2; j++) {
                    char temp = str.charAt(r);
                    str.setCharAt(r, str.charAt(l));
                    str.setCharAt(l, temp);
                    l++;
                    r--;
                }
                count = 0;
            }
            else{
                count++;
            }
        }
        int l = i-count,r = i-1;
                for (int j = 0; j < count/2; j++) {
                    char temp = str.charAt(r);
                    str.setCharAt(r, str.charAt(l));
                    str.setCharAt(l, temp);
                    l++;
                    r--;
                }
        return str.toString();
    }
}