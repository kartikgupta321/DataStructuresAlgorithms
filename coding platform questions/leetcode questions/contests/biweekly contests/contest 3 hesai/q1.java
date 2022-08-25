class q1{
    public static void main(String[] args) {
        String s = "0110101";
        Solution obj = new Solution();
        System.out.println(obj.secondsToRemoveOccurrences(s));
    }
}
class Solution {
    public int secondsToRemoveOccurrences(String s) {
        StringBuilder str = new StringBuilder(s);
        int count = -1;
        while (true) {
            int  ok = 0;
            count++;
            for (int i = 1; i < s.length(); i++) {
                if(str.charAt(i-1) == '0' && str.charAt(i)=='1'){
                    ok = 1;
                    str.setCharAt(i-1, '1');
                    str.setCharAt(i, '0');
                    i++;
                }
            }
            if(ok == 0) break;
        }
        return count;
    }
}