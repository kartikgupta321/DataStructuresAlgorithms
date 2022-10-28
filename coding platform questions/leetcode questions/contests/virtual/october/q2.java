public class q2 {
    public static void main(String[] args) {
        Solution obj = new Solution();
        System.out.println(obj.longestContinuousSubstring("yrpjofyzubfsiypfre"));
    }
}
class Solution {
    public int longestContinuousSubstring(String s) {
        int count = 1,ans = 1;
        for (int i = 0; i < s.length()-1; i++) {
            System.out.println(s.charAt(i)+" "+s.charAt(i+1)+' ');
            if(s.charAt(i) == s.charAt(i+1)-1){
                count++;
            }
            else{
                ans = Math.max(ans, count);
                count = 1;
            }
            System.out.print(count);
        }
        return Math.max(ans, count);
    }
}