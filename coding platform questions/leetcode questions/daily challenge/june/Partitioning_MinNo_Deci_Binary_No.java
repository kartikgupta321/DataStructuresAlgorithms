class Partitioning_MinNo_Deci_Binary_No{
    public static void main(String[] args) {
        String n = "82734";
        Solution obj = new Solution();
        System.out.println(obj.minPartitions(n));
    }
}
class Solution {
    int max=0;
    public int minPartitions(String n) {
        for (int i = 0; i < n.length(); i++) {
            max = Math.max(max, Character.getNumericValue(n.charAt(i)));
            if(max==9) return max;
        }
        return max;
    }
}