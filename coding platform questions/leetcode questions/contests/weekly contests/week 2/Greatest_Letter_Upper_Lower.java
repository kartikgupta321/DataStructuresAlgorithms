class Greatest_Letter_Upper_Lower {
    public static void main(String[] args) {
        String s = "arRAzFif";
        Solution obj = new Solution();
        System.out.println(obj.greatestLetter(s));
    }
}
class Solution {
    public String greatestLetter(String s) {
        int[] low = new int[26];
        int[] up = new int[26];
        for (int i = 0; i < s.length(); i++) {
            if(Character.isUpperCase(s.charAt(i))){
                up[Character.toLowerCase(s.charAt(i))-'a'] = 1;
            }
            else if(Character.isLowerCase(s.charAt(i))){
                low[s.charAt(i)-'a'] = 1;
            }
        }
        for (int i = up.length-1; i >=0 ; i--) {
            if(up[i] ==1 && low[i] == 1 ){
                return String.valueOf((char)(i+65));
            }
        }
        return "";
    }
}