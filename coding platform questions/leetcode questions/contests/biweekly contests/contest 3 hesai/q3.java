public class q3 {
    public static void main(String[] args) {
        String blocks = "WBWBBBW";
        int k = 2;
        Solution obj = new Solution();
        System.out.println(obj.minimumRecolors(blocks, k));
    }
}
class Solution {
    public int minimumRecolors(String blocks, int k) {
        int min = Integer.MAX_VALUE;
        int j = 0;
        for (int i = 0; i+j <= blocks.length(); i++) {
            int count = 0;
            for ( j = 0; j < k; j++) {
                if( blocks.charAt(i+j)=='W') count++;
            }
            min = Math.min(min, count);
        }
        return min;
    }
}