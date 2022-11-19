public class UglyNumber {
    public static void main(String[] args) {
        int n = 210;
        Solution obj = new Solution();
        System.out.println(obj.isUgly(n));
    }
}
class Solution{
    boolean isUgly(int n){
        if(n<=0) return false;
        int i = 2;
        while(n>1){
            if(i>5) return false;
            while (n%i==0) {
                n=n/i;
            }
            i++;
        }
        return true;
    }
}