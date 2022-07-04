import java.util.HashMap;

class q1{
    public static void main(String[] args) {
        String key = "the quick brown fox jumps over the lazy dog";
        String message = "vkbs bs t suepuv";
        Solution obj = new Solution();
        String ans = obj.decodeMessage(key, message);
        for (int i = 0; i < ans.length(); i++) {
            System.out.print(ans.charAt(i)+" ");
        }
    }
}
class Solution {
    HashMap<Character,Integer> map = new HashMap<>();
    public String decodeMessage(String key, String message) {
        int count = 0;
        for (int i = 0; i < key.length(); i++) {
            if(key.charAt(i) == ' ') continue;
            if(map.containsKey(key.charAt(i))) continue;
            map.put(key.charAt(i), count);
            count++;
        } 
        StringBuilder ans = new StringBuilder();

        for (int i = 0; i < message.length(); i++) {
            if(message.charAt(i) == ' ') ans.append(' ');
            else{
                ans.append((char) (map.get(message.charAt(i))+'a'));
            }
        }
        return ans.toString();
    }
}