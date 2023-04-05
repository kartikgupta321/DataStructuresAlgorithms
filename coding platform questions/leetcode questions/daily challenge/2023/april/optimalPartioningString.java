public class optimalPartioningString {
    public static void main(String[] args) {
        String s = "abacaba";
        Solution obj = new Solution();
        System.out.println(obj.partitionString(s));
    }
}
class Solution {
    public int partitionString(String s) {
        int count = 0;
        int[] array = new int[26];
        for (int i = 0; i < s.length(); i++) {
            if(array[s.charAt(i)-'a']==1){
                array = new int[26];
                array[s.charAt(i)-'a']++;
                count++;
            }
            else{
                array[s.charAt(i)-'a']++;
            }
            for (int k : array) {
                System.out.print(k);
            }
            System.out.println();
        }
        return count+1;
    }
}