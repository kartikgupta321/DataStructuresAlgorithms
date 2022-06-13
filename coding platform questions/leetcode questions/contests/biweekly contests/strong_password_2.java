class strong_password_2{
    public static void main(String[] args) {
        String password = "Me+You--IsMyDream";
        Solution obj = new Solution();
        Character.isDigit(5);
        System.out.println(obj.strongPasswordCheckerII(password));
    }
}
class Solution {
    public boolean strongPasswordCheckerII(String password) {
        if(password.length()<8) return false;
        int low=0,up=0,special=0,digit=0;
        for (int i = 0; i < password.length(); i++) {
            if(low!=1 && Character.isLowerCase(password.charAt(i))) low = 1;
            else if(up!=1 && Character.isUpperCase(password.charAt(i))) up = 1;
            else if(digit!=1 && Character.isDigit(password.charAt(i))) digit = 1;
            else if(password.charAt(i)=='!' || password.charAt(i)=='@' ||password.charAt(i)=='#' ||
                password.charAt(i)=='$' ||password.charAt(i)=='%' || password.charAt(i)=='^' || password.charAt(i)=='&' ||
                password.charAt(i)=='*' || password.charAt(i)=='(' || password.charAt(i)==')' || password.charAt(i)=='-' ||
                password.charAt(i)=='+' )   special = 1;
            if(i>0 && password.charAt(i) == password.charAt(i-1)) return false;
        }
        if(low==0 || up==0 || special==0 ||digit==0) return false;
        return true;
    }
}