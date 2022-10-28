class q1{
    public static void main(String[] args) {
        Solution obj = new Solution();
        System.out.println(obj.smallestEvenMultiple(5));
    }
}
class Solution {
    public int smallestEvenMultiple(int n) {
        if(n%2==0) return n;
        return n*2;
    }
}