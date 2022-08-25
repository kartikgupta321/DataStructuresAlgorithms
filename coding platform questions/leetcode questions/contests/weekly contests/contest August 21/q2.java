public class q2 {
    public static void main(String[] args) {
        String num = "444947137";
        Solution obj = new Solution();
        System.out.println(obj.largestPalindromic(num));
    }
}
class Solution {
    public String largestPalindromic(String num) {
        int arr[] = new int[910];
        for (int i = 0; i < num.length(); i++) {
            System.out.println(Character.getNumericValue(num.charAt(i)));
            arr[Character.getNumericValue(num.charAt(i))]++;
        }
        
        return "0";
    }
}