
public class palindrome_no {
    static int rev = 0;
    static int base= 1;
    public static int reverse(int x){
        if(x<0) x=x*(-1);
        if (x>0) {
            reverse(x/10);
            rev =rev+ (x%10)*base;
            base *=10;
        }
        return rev;
    }
    public static boolean isPalindrome(int x) {
        if(reverse(x)==x)
            return true;
        return false;
    }
    public static void main(String[] args) {
        System.out.println(isPalindrome(11));
    }
}
