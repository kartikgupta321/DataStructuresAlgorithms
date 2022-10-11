class q1{
    public static void main(String[] args) {
        Solution obj = new Solution();
        System.out.println(obj.commonFactors(25, 30));
    }
}
class Solution {
    public int commonFactors(int a, int b) {
        int min = Math.min(a, b);
        int count = 0;
        for (int i = 1; i <= min; i++) {
            if(a%i==0 && b%i==0) count++;
        }
        return count;
    }
}