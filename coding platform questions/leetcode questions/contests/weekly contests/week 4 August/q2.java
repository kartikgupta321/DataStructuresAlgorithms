class q2{
    public static void main(String[] args) {
        Solution obj = new Solution();
        String s= "leet**cod*e";
        System.out.println(obj.removeStars(s));
    }
}
class Solution {
    public String removeStars(String s) {
        StringBuilder str = new StringBuilder(s);
        for (int i = 1; i < str.length(); i++) {
            if(str.charAt(i)=='*'){
                    str.delete(i-1, i+1);
                    i=i-2;
           }
        }
        return str.toString();
    }
}