public class Mirror_reflection {
    public static void main(String[] args) {
        Solution obj = new Solution();
        System.out.println(obj.mirrorReflection(3, 1));
    }
}
class Solution {
    public int mirrorReflection(int p, int q) {
        while(p%2==0 && q %2==0) {
            p >>= 1;
            q >>= 1;
        }
        return 1 - p%2 + q%2;
    }
}