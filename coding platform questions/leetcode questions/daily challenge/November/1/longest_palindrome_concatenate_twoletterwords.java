import java.util.HashMap;

class longest_palindrome_concatenate_twoletterwords{
    public static void main(String[] args) {
        String[] words = { "dd","aa","bb","dd","aa","dd","bb","dd","aa","cc","bb","cc","dd","cc"};
        Solution obj = new Solution();
        System.out.println(obj.longestPalindrome(words));
    }
}
class Solution {
    HashMap<String,Integer> map = new HashMap<>();
    public int longestPalindrome(String[] words) {
        int count = 0;boolean central = false;
        for (int i = 0; i < words.length; i++) {
            if(map.containsKey(words[i])==true ){
                map.put(words[i], map.get(words[i])+1);
            }
            else map.put(words[i], 1);
        }
        for (String string : map.keySet()) {
            String reverse = "" + string.charAt(1) + string.charAt(0);
            if(string.charAt(0) != string.charAt(1)){
                if(string.charAt(0) < string.charAt(1)){
                    if(map.containsKey(reverse)==true){
                        count += 2 * Math.min(map.get(string), map.get(reverse));
                    }
                }
            }
            else{
                if(map.get(string)%2==0) count+= map.get(string);
                else{
                    count += map.get(string)-1;
                    central =true;
                }
            }
        }
        if(central) count++;
        return count*2;
    }
}