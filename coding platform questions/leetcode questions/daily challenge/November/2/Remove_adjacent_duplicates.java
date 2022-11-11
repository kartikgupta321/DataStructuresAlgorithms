public class Remove_adjacent_duplicates {
    public static void main(String[] args) {
        Solution obj = new Solution();
        String s = "aabb";
        System.out.println(obj.removeDuplicates(s));
    }
}
class Solution {
    public String removeDuplicates(String s) {
        StringBuilder str = new StringBuilder(s);
        int i = 0;
        while (i < str.length()-1) {
            if(Character.compare(str.charAt(i), str.charAt(i+1)) ==0 ){
                str.delete(i, i+2);
                System.out.println(str);
                if(i==0) continue;
                else i -= 2;;
            }
            i++;
        }
        return str.toString();
    }
}