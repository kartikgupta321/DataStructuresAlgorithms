public class q3 {
    public static void main(String[] args) {
        String s = "abcabcdabc";
        Solution obj = new Solution();
        System.out.println(obj.deleteString(s));
    }
}
class Solution {
    public int deleteString(String s) {
        int ptr = 0,count=0;
        StringBuilder str = new StringBuilder(s);
        for (int i = 1; i <= s.length()/2; i++) {
            if(s.substring(ptr,i).equals(s.substring(ptr+i,i+i))){
                str.delete(ptr, i);
                ptr = i;
                count++;
            }
            System.out.println(str+" "+i+" "+ptr);
        }
        return count;
    }
}