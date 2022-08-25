class Power_4{
    public static void main(String[] args) {
        int n = 20;
        Solution obj = new Solution();
        System.out.println(obj.isPowerOfFour(n));
    }
}
class Solution {
    public boolean isPowerOfFour(int n) {
        n = Integer.parseInt(Integer.toBinaryString(n));
        if(Math.log10(n)%2==0) return true;
        return false;
    }
}