class domino_tromino_tiling{
    public static void main(String[] args) {
        Solution obj = new Solution();
        System.out.println(obj.numTilings(300));
    }
}
class Solution {
    public int numTilings(int n) {
        long mod = 1000000007;
        long one=1,two=1,three=2;
        if(n==1||n==2||n==3){
            if(n==1) return 1;
            if(n==2) return 2;
        }
        for (int i =3 ; i <= n; i++) {
            long temp = one;
            one = two;
            two = three;
            three = (2*(three) + temp)%mod;
        }
        return (int) three;
    }
}