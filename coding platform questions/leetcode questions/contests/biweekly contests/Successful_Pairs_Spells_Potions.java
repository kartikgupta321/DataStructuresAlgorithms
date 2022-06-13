
public class Successful_Pairs_Spells_Potions {
    public static void main(String[] args) {
        Solution obj = new Solution();
        int[] spells = {3,1,2};
        int[] potions = {8,5,8};
        int success = 16;
        int[] pairs = obj.successfulPairs(spells, potions, success);
        for (int i = 0; i < pairs.length; i++) {
            System.out.println(pairs[i]);
        }
    }
}
class Solution {
    public int[] successfulPairs(int[] spells, int[] potions, long success) {
        int [] pairs = new int[spells.length];
        for (int i = 0; i < spells.length; i++) {
            for (int j = 0; j < potions.length; j++) {
                long l = new Long(spells[i]*potions[j]);
                if( l >= success) pairs[i] += 1; 
            }
        }
        return pairs;
    }
}