public class q2 {
    public static void main(String[] args) {
    Solution obj = new Solution();
    System.out.println(obj.isStrictlyPalindromic(9));
    }
}
class Solution {
    public boolean isStrictlyPalindromic(int n) {
        int N = n;
        for (int i = 2; i <= n-2; i++) {
            StringBuilder str = new StringBuilder();
            while (N>=1) {
                int r = N%i;
                N=N/i;
                str =str.append(r);
            }
            N = n;
            str.reverse();
            System.out.println(str+" "+i);
            if(palindrome(str.toString()) == false) return false;
        }
        return true;
    }
    boolean palindrome(String s){
        for (int i = 0; i < s.length()/2; i++) {
            if(s.charAt(i) != s.charAt(s.length()-1-i)) return false;
        }
        return true;
    }
}
