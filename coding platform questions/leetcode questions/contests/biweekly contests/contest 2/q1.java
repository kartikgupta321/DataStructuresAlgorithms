import java.util.HashMap;

class q1{
    public static void main(String[] args) {
        int[] ranks = { 13,12,3,4,7};
        char[] suits = {'a','d','c','b','c' };
        Solution obj = new Solution();
        System.out.println(obj.bestHand(ranks, suits));
    }
}
class Solution {
    public String bestHand(int[] ranks, char[] suits) {
        HashMap<Integer,Integer> map = new HashMap<>();
        HashMap<Character,Integer> charmap = new HashMap<>();
        for (int i = 0; i < ranks.length; i++) {
            if(map.containsKey(ranks[i])) map.put(ranks[i], map.get(ranks[i])+1);
            else{
                map.put(ranks[i], 1);
            }
        }
        for (int i = 0; i < suits.length; i++) {
            if(charmap.containsKey(suits[i])) charmap.put(suits[i], charmap.get(suits[i])+1);
            else{
                charmap.put(suits[i], 1);
            }
        }
        int maxSuit = 1;
        int maxRank = 1;
        for (char c : charmap.keySet()) {
            maxSuit = Math.max(maxSuit, charmap.get(c));
        }
        for (int c : map.keySet()) {
            maxRank = Math.max(maxRank, map.get(c));
        }
        if(maxSuit ==5 ) return "Flush";
        else if (maxRank ==4 || maxRank ==3) return "Three of a Kind";
        else if (maxRank ==2 ) return "Pair";
        else return "High Card";
    }
}