class Make_string_great{
    public static void main(String[] args) {
        String s = "abBAcC";
        Solution obj = new Solution();
        System.out.println(obj.makeGood(s));
    }
}
class Solution {
    public String makeGood(String s) {
        StringBuilder str = new StringBuilder(s);
        for (int i = 0; i < s.length()-1; i++) {
            if(s.charAt(i) == Character.toLowerCase(s.charAt(i+1)) ){
                str.delete(i, i+2);
            }    
            else if(s.charAt(i) == Character.toUpperCase(s.charAt(i+1))){
                str.delete(i, i+2);
            }
        }
        return str.toString();
    }
}