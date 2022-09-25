public class Concatenation_consecutive_binary {
    public static void main(String[] args) {
        Solution obj = new Solution();
        System.out.println(obj.concatenatedBinary(12));
    }
}
class Solution {
    public int concatenatedBinary(int n) {
        int mod = 1000000007,ans=0;
        StringBuilder str = new StringBuilder();
        for (int i = 1; i <= n; i++) {
            str.append(Integer.toBinaryString(i));
        }
        System.out.println(str);
        int p=0;
        for (int i = str.length()-1; i >=0; i--) {
            ans += Character.getNumericValue(str.charAt(i)) *Math.pow(2, p);
            p++;
        }
        return ans;
    }
}